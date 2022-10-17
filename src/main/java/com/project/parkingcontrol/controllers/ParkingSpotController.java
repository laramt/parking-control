package com.project.parkingcontrol.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.parkingcontrol.dtos.ParkingSpotDto;
import com.project.parkingcontrol.models.ParkingSpotModel;
import com.project.parkingcontrol.services.ParkingSpotService;

@RestController
@RequestMapping("/parking-spot")
@CrossOrigin (origins = "*", maxAge = 3600)
public class ParkingSpotController {

	
	final ParkingSpotService parkingSpotService;
	
	
	public ParkingSpotController(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}


	@PostMapping
	public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto) {
		//check if already exists 
		if(parkingSpotService.existsByParkingSpotNumber(parkingSpotDto.getParkingSpotNumber())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Parking spot already in use.");
		}
		if(parkingSpotService.existsByParkingSpotLicensePlate(parkingSpotDto.getParkingSpotLicensePlate())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("License plate Already registred.");
		}
		if(parkingSpotService.existsByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock())) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Parking spot alredy registred to this apartment/block");
		}
		
	     ParkingSpotModel parkingSpotModel = new ParkingSpotModel();
	     BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel);
	     
	     parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
	     
	     return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
	}
	
	// gets all parking spots registered
	@GetMapping
	public ResponseEntity<List<ParkingSpotModel>> getAllParkingSpots(){
		List<ParkingSpotModel> list = parkingSpotService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
}
