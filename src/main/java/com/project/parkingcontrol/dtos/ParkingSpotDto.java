package com.project.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ParkingSpotDto {

	@NotNull
    private int parkingSpotNumber;
    @NotBlank
    @Size(max = 9)
	private String parkingSpotLicensePlate;
	@NotBlank
	private String brandCar;
	@NotBlank
	private String modelCar;
	@NotBlank
	private String colorCar;
	@NotBlank
	private String ownerName;
	@NotNull
	private int apartment;
	@NotBlank
	private String block;

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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
