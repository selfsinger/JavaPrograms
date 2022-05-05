package com.xwrokz.methodsofmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Java");
		map.put(2, "SQL");
		map.put(3, "Web");
		map.put(4, "Python");
		map.put(5, "Java");
		map.put(6, "BS");
		Map<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(1, "Java");
		map1.put(2, "SQL");
		map1.put(3, "Web");
		map1.put(4, "Python");
		map1.put(5, "Java");
		map1.put(6, "BS");

		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(8, "React");

		System.out.println("Map includes:" + map);

		// 1.compute()
		System.out.println("************************************************************");
		map.compute(3, (key, oldVal) -> oldVal.concat("Technology"));
		map.compute(5, (key, oldVal) -> oldVal.concat("Script"));
		System.out.println("Rename the map 3 and 5:" + map);

		// return null to remove values

		String s1 = map.compute(1, (key, oldVal) -> null);
		System.out.println("first value is:" + s1);
		System.out.println("after null:" + map);

		System.out.println("**********************************************************");
		// 2.computeifPresent()
//		map.computeIfPresent(3,(key,oldVal)->oldVal.concat("Technology"));
//		 map.computeIfPresent(5,(key,oldVal)->oldVal.concat("Script"));
//		 System.out.println("after changing:"+map);
		String str = map.computeIfPresent(40, (key, oldVal) -> "Spring framework");
		System.out.println(str);

		// 3.computeifAbsent()
		System.out.println("*********************************************************");
		map.computeIfAbsent(2, key -> "SQL at" + key);
		System.out.println("no changes" + map);

		// 4.remove
		System.out.println("*************************************************************");
		boolean remove = map.remove(6, "BS");
		System.out.println("removed 6th element" + remove);

		// 5.replace
		System.out.println("***********************************************************");
		map.replace(2, "Sql");
		System.out.println("replaced:" + map);

		//6.containsKey
		System.out.println("*****************************************************");
		System.out.println("is the key 1 present?" + map.containsKey(2));

		//7.containsValue
		System.out.println("****************************************************");
		System.out.println("Is the value Python present?" + map.containsValue("Python"));

		//8.getOrDefault
		System.out.println("********************************************************");
		String m = map.getOrDefault(5, "Pyth");
		System.out.println(m);

		//9.merge
		System.out.println("********************************8****************");
		String returnedValue = map.merge(7, "Angular", (oldVal, newVal) -> oldVal + newVal);
		System.out.println("new entry:" + returnedValue);
		System.out.println("updated Map is:" + map);

		//10.size
		System.out.println("************************************************");
		System.out.println("Size of map is:" + map.size());

		//11.entrySet
		System.out.println("***************************************");
		System.out.println("the set is :" + map.entrySet());

		//12.equals
		System.out.println("*****************************************");
		System.out.println("is both map are equal or not:" + map.equals(map1));

		//13.foreach
		System.out.println("********************************");
		map.forEach((key, value) -> System.out.println("Key=" + key + " ,Value=" + value));

		//14.putAll
		System.out.println("************************************");
		map.putAll(map2);
		System.out.println("map:" + map);

		//15.isEmpty
		System.out.println("****************************");
		boolean i = map.isEmpty();
		System.out.println("Is map empty?:" + i);

		//16.get
		System.out.println("**********************************");
		String val = map.get(3);
		System.out.println("The map value with key 3 is:" + val);

		//17.keySet
		System.out.println("*********************************");
		System.out.println("Keys:" + map.keySet());

		//18.values
		System.out.println("*******************************");
		System.out.println("Only values of map:" + map.values());

		// 19.PutIfAbsent
		System.out.println("********************************************");
		map.putIfAbsent(9, "Kotlin");

		map.putIfAbsent(4, "Python");
		System.out.println("updated" + map);

		System.out.println("*******************************************************");
		// 20.replaceAll
		map.replaceAll((key, value) -> value + "-" + key);
		System.out.println(map);

	}

}
