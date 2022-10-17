package com.project.parkingcontrol.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.parkingcontrol.dtos.ParkingSpotDto;
import com.project.parkingcontrol.models.ParkingSpotModel;
import com.project.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	// saves on repository
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	// checks if license plate already exists on repository
	public boolean existsByLicensePlate(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlate(licensePlateCar);
	}
	
	// checks if parking spot number is already on repository
	public boolean existsByParkingSpotNumber(int parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}
	
	// checks if apartment and block are already on repository
	public boolean existsByApartmentAndBlock(int apartment, String block) {
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}
	
}
