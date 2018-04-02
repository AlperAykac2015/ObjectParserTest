package com.obj.psr.ObjectParserTest9;

public class Car {
	private String brand = null;
	private int doors = 0;

	private Insurances[] insurances;

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDoors() {
		return this.doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public Insurances[] getInsurances() {
		return insurances;
	}

	public void setInsurances(Insurances[] insurances) {
		this.insurances = insurances;
	}
}