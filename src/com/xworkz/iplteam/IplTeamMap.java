package com.xworkz.iplteam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class IplTeamMap {

	public static void main(String[] args) {
		HashMap<String, String> ipl = new HashMap<>();
		ipl.put("RCB", "Faf du Plessis");
		ipl.put("Punjab Kings", "Mayank Agarwa");
		ipl.put("Mumbai Indians", "Rohit Sharma");
		ipl.put("CSK", "Ravindra Jadeja");
		ipl.put("Gujarat Titans", "Hardik Pandya");
		ipl.put("SunRisers Hyderabad", "Kane Williamson");
		ipl.put("Delhi Capitals", "Rishabh Pant");
		ipl.put("Rajasthan Royals", "Sanju Samson");
		ipl.put("Kolkata Knight Riders", "Shreyas Iyer");
		ipl.put("Lucknow Super Giants", "KL Rahul");

		System.out.println("keys and values:" + ipl);
		Set<String> keys = ipl.keySet();
		System.out.println("getting only keys");
		for (String key : keys) {
			System.out.println(key);
		}

		System.out.println("======================================================");
		System.out.println("getting only values");
		for (String key : keys) {
			System.out.println(ipl.get(key));
		}
		System.out.println("==============================================================");
		System.out.println("Getting all entries using entry set");
		Set<Integer> set = new HashSet<Integer>();
		Set<Entry<String, String>> entry = ipl.entrySet();
		for (Entry<String, String> entry2 : entry) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}

		System.out.println("===========================================================");
		System.out.println("Looping using forEach of map");
		ipl.forEach((key, value) -> System.out.println(key + " " + value));

	}

}
