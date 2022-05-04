package com.xworkz.mobile;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class MobileMap {

	public static void main(String[] args) {
		HashMap<String, String> mobile = new HashMap<>();
		mobile.put("Redmi", "Megha");
		mobile.put("One plus", "Manju");
		mobile.put("Acer", "Shivalinga");
		mobile.put("Apple", "Chetu");
		mobile.put("Leneovo", "Pinku");
		mobile.put("Oppo", "Sharanya");
		mobile.put("Panasonic", "Renu");
		mobile.put("Vivo", "Shashank");
		mobile.put("Samsung", "Sumanth");
		mobile.put("Realme", "Vidya");
		mobile.put("Vodafone", "Manasvi");
		mobile.put("Nokia", "Lata");
		mobile.put("LG", "Neela");
		mobile.put("Huawei", "Sheela");
		mobile.put("Sony", "Aditi");

		System.out.println(mobile);
		Set<String> s = mobile.keySet();

		for (String k : s) {
			System.out.println(k);
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("getting keys:");
		for (String k : s) {
			System.out.println(k);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("getting values:");
		for (String key : s) {
			System.out.println(mobile.get(key));
		}

		System.out.println("---------------------------------------------------------");
		System.out.println("Getting all entries using entry set:");
		Set<Integer> set = new HashSet<Integer>();
		Set<Entry<String, String>> entry = mobile.entrySet();
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());

		}

		System.out.println("--------------------------------------------------------");
		System.out.println("loop using forEach of map");
		mobile.forEach((key, value) -> System.out.println(key + " " + value));
	}
}
