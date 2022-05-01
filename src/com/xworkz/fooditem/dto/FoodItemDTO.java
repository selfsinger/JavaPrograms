package com.xworkz.fooditem.dto;

import com.xworkz.fooditem.type.FoodType;

public class FoodItemDTO {
	
	Integer id;
	String name,quantity,hotelName;
	FoodType type;
	double price;
	public FoodItemDTO(Integer id, String name, String quantity, String hotelName, FoodType type, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.hotelName = hotelName;
		this.type = type;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItemDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", hotelName=" + hotelName
				+ ", type=" + type + ", price=" + price + "]";
	}
	
	

}
