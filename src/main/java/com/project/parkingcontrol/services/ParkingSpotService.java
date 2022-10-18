package com.project.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.parkingcontrol.models.ParkingSpotModel;
import com.project.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
	
	// saves on repository
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	// checks if license plate already exists on repository
	public boolean existsByParkingSpotLicensePlate(String parkingSpotLicensePlate) {
		return parkingSpotRepository.existsByParkingSpotLicensePlate(parkingSpotLicensePlate);
	}
	
	// checks if parking spot number is already on repository
	public boolean existsByParkingSpotNumber(int parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	
	// checks if apartment and block are already on repository
	public boolean existsByApartmentAndBlock(int apartment, String block) {
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}
	
	// finds all registered parking spots
	public List<ParkingSpotModel> findAll(){
		return parkingSpotRepository.findAll();
	}
	
	//find parking spot by id
	public Optional<ParkingSpotModel> findById(UUID id){
		return parkingSpotRepository.findById(id);
	}
}
