package com.xworkz.ceo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class CeoMap {

	public static void main(String[] args) {
		HashMap<String, String> ceo = new HashMap<>();
		ceo.put("Accenture", "Julie Sweet");
		ceo.put("Aditya Birla Group", "Kumar Mangalam Birla");
		ceo.put("Adobe Systems", "Shantanu Narayen");
		ceo.put("Apple", "Tim cook");
		ceo.put("BHP", "Andrew");
		ceo.put("Boeing", "Dave");
		ceo.put("Capgemini", "Aiman");
		ceo.put("Coca cola", "James Quiency");
		ceo.put("Dell", "Mchel dell");
		ceo.put("Erricsson", "Borje");
		ceo.put("Facebook", "Mark zuxkerburg");
		ceo.put("Ford", "Hacket");
		ceo.put("Google", "Sundar Pichai");
		ceo.put("IBM", "Araving Krishna");

		System.out.println(ceo);
		Set<String> keys = ceo.keySet();
		System.out.println("getting only keys");
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("getting values");
		for (String key : keys) {
			System.out.println(ceo.get(key));
		}

		System.out.println("Getting all entries using entry set");
		Set<Integer> set = new HashSet<Integer>();
		Set<Entry<String, String>> entry = ceo.entrySet();
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());

		}
		System.out.println();
		System.out.println("looping using forEach of map");
		ceo.forEach((key, value) -> System.out.println(key + " " + value));

	}
}
