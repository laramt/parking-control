package com.project.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARKING_CONTROL_DB")
public class ParkingSpotModel implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false, unique = true, length = 5)
	private int parkingSpotNumber;
	
	@Column(nullable = false, unique = true, length = 8)
	private String parkingSpotLicensePlate;
	
	@Column(nullable = false, length = 70)
	private String brandCar;
	
	@Column(nullable = false, length = 70)
	private String modelCar;
	
	@Column(nullable = false, length = 70)
	private String colorCar;
	
	@Column(nullable = false)
	private LocalDateTime registrationDate;
	
	@Column(nullable = false, length = 150)
	private String OwnerName;
	
	@Column(nullable = false, length = 10)
	private int apartment;
	
	@Column(nullable = false, length = 10)
	private String block;

	public ParkingSpotModel() {
		super();
	}

	public ParkingSpotModel(UUID id, int parkingSpotNumber, String parkingSpotLicensePlate, String brandCar,
			String modelCar, String colorCar, LocalDateTime registrationDate, String ownerName, int apartment,
			String block) {
		super();
		this.id = id;
		this.parkingSpotNumber = parkingSpotNumber;
		this.parkingSpotLicensePlate = parkingSpotLicensePlate;
		this.brandCar = brandCar;
		this.modelCar = modelCar;
		this.colorCar = colorCar;
		this.registrationDate = registrationDate;
		OwnerName = ownerName;
		this.apartment = apartment;
		this.block = block;
	}

	public UUID getId() {
		return id;
	}
	

	public int getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(int parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public String getParkingSpotLicensePlate() {
		return parkingSpotLicensePlate;
	}

	public void setParkingSpotLicensePlate(String parkingSpotLicensePlate) {
		this.parkingSpotLicensePlate = parkingSpotLicensePlate;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public int getApartment() {
		return apartment;
	}

	public void setApartment(int apartment) {
		this.apartment = apartment;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
	
	
	
}
