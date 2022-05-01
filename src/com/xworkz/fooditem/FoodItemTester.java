package com.xworkz.fooditem;

import java.util.*;
import java.util.stream.Collectors;

import com.xworkz.fooditem.dto.FoodItemDTO;
import com.xworkz.fooditem.type.FoodType;

public class FoodItemTester {

	public static void main(String[] args) {

		FoodItemDTO food1 = new FoodItemDTO(1, "MasalaDosa", "Large", "Hotel Shubham", FoodType.VEG, 40);
		FoodItemDTO food2 = new FoodItemDTO(2, "Idli", "Medium", "Royal Orchid", FoodType.VEG, 50);
		FoodItemDTO food3 = new FoodItemDTO(3, "Pulav", "Large", "Mathura residency", FoodType.VEG, 35);
		FoodItemDTO food4 = new FoodItemDTO(4, "Sandwich", "Medium", "Souparnika", FoodType.VEG, 55);
		FoodItemDTO food5 = new FoodItemDTO(5, "Palak paneer", "Small", "Hallikere", FoodType.VEG, 60);
		FoodItemDTO food6 = new FoodItemDTO(6, "Butter chicken", "Large", "Sri mahalakshmi", FoodType.NON_VEG, 90);
		FoodItemDTO food7 = new FoodItemDTO(7, "Fruit salad", "Large", "Hotel samrat ashoka", FoodType.FRUITS, 45);
		FoodItemDTO food8 = new FoodItemDTO(8, "Aloo gobi", "Medium", "Hotel Anmol", FoodType.VEG, 65);
		FoodItemDTO food9 = new FoodItemDTO(9, "Tandoori fish", "Small", "Hotel varadashree", FoodType.NON_VEG, 100);
		FoodItemDTO food10 = new FoodItemDTO(10, "Pizza", "Medium", "Sri anjaneya", FoodType.VEG, 150);

		List<FoodItemDTO> list = new ArrayList<FoodItemDTO>();
		list.add(food1);
		list.add(food2);
		list.add(food3);
		list.add(food4);
		list.add(food5);
		list.add(food6);
		list.add(food7);
		list.add(food8);
		list.add(food9);
		list.add(food10);

		System.out.println(list.size());

		System.out.println("1.Displaying all items");
		list.forEach(foodItems -> System.out.println(foodItems));

		System.out.println("----------------------------------------------------------------");
		System.out.println("2.Filtering items by non veg type");
		list.stream().filter(food -> food.getType().equals(FoodType.NON_VEG)).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("------------------------------------------------------------------");
		System.out.println("3.Here prninting details where food price is greater than 50");
		list.stream().filter(food -> food.getPrice() > 50).map(food -> food.getPrice()).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("-------------------------------------------------------------------");
		System.out.println("4.Here getting the hotel names where price greater than 50");
		list.stream().filter(food -> food.getPrice() > 50).map(food -> food.getHotelName()).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("-------------------------------------------------------------------");
		System.out.println("5.Getting  sorted hotel names, where price is greater than 50");
		list.stream().filter(food -> food.getPrice() > 50).map(food -> food.getHotelName()).sorted()
				.collect(Collectors.toList()).forEach(print -> System.out.println(print));

		System.out.println("-------------------------------------------------------------------");
		System.out.println("6.Getting sorted(ascending) food names");
		list.stream().map(food -> food.getName()).sorted().collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("-------------------------------------------------------------------");
		System.out.println("7.Getting only id's sorted in descending order");
		list.stream().sorted((x, y) -> y.getId().compareTo(x.getId())).map(food -> food.getId())
				.collect(Collectors.toList()).forEach(print -> System.out.println(print));

		System.out.println("--------------------------------------------------------------------");
		System.out.println("8.Getting items where hotel name in descending order");
		list.stream().sorted((m, n) -> n.getHotelName().compareTo(m.getHotelName())).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("9.Getting items by veg type and sorted food names in descdending order");
		list.stream().filter(food -> food.getType().equals(FoodType.VEG))
				.sorted((p, q) -> q.getName().compareTo(p.getName())).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("10.Here sorting names in ascending order");
		list.stream().map(food -> food.getName()).sorted().collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("--------------------------------------------------------------------------");
		System.out.println("11.Here sorting qunatity in descending order");
		list.stream().sorted((m, n) -> n.getQuantity().compareTo(m.getQuantity())).map(food -> food.getQuantity())
				.collect(Collectors.toList()).forEach(print -> System.out.println(print));

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("12.Getting only food names in uppercase");
		list.stream().map(food -> food.getName().toUpperCase()).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));

		System.out.println("------------------------------------------------------------------------");
		System.out.println("13.Getting only hotel names in uppercase ");
		list.stream().map(food -> food.getHotelName().toUpperCase()).collect(Collectors.toList())
				.forEach(print -> System.out.println(print));
	}

}
