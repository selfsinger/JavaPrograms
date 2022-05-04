package com.xworkz.countrymap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {

	public static void main(String[] args) {
		HashMap<String,Integer> country=new HashMap<>();
		country.put("India",500072);
		country.put("Australia",500772);
		country.put("Bangladesh",501436);
		country.put("Brazil",500998);
		country.put("Canada",565722);
		country.put("China",509876);
		country.put("Colombia",500067);
		country.put("Denmark",507872);
		country.put("Egypt",570072);
		country.put("France",508709);
		country.put("Germany",500043);
		country.put("Iran",500543);
		country.put("Indonesia",508790);
		country.put("Latvia",504352);
		country.put("Malaysia",545362);
		
		
		System.out.println(country);
		Set<String> keys=country.keySet();
		System.out.println("getting only keys");
		for(String key:keys)
		{
			System.out.println(key);
		}
		System.out.println("===================================================");
		System.out.println("getting only values");
		for(String key:keys)
		{
			System.out.println(country.get(key));
		}
		
		System.out.println("====================================================");
		System.out.println("Getting all entries using entry set");
		//Set<Integer> set=new HashSet<Integer>();
		Set<Entry<String, Integer>> entry = country.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey()+" "+entry2.getValue());
			
		}
		System.out.println();
		System.out.println("looping using forEach of map");
		country.forEach((key,value)->System.out.println(key+" "+value));
	}
}
