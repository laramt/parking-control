package com.project.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.parkingcontrol.models.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{

	boolean existsByLicensePlate(String licensePlateCar);

	boolean existsByParkingSpotNumber(int parkingSpotNumber);

	boolean existsByApartmentAndBlock(int apartment, String block);

	
	
}
