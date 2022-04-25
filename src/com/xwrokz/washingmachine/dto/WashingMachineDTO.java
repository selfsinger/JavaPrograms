package com.xwrokz.washingmachine.dto;

import java.io.Serializable;

import com.xwrokz.washingmachine.type.WashingMachineType;

public class WashingMachineDTO {
	
	private int id;
	private String brand;
	private double capacity;
	private String color;
	private WashingMachineType type;
	private double price;
	private String modelNo;
	
	
	public WashingMachineDTO(int id, String brand, double capacity, String color, WashingMachineType type, double price, String modelNo) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.color = color;
		this.price = price;
		this.modelNo = modelNo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public WashingMachineType getType() {
		return type;
	}


	public void setType(WashingMachineType type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getModelNo() {
		return modelNo;
	}


	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}


	@Override
	public String toString() {
		return "WashingMachineDTO [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", color=" + color
				+ ", type=" + type + ", price=" + price + ", modelNo=" + modelNo + "]";
	}
	
	
	
	
}
