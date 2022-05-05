package com.xworkz.optionalmethods;

import java.util.Optional;

public class OptionalTester {

	public static void main(String[] args) {
		String[] values = { "Megha", "b", "c", "d", null };
		// 1.ofNullable
		Optional<String> optional = Optional.ofNullable(values[4]);
		if (optional.isPresent())
			System.out.println(values[4]); // 2.isPresent
		else
			System.out.println("value is null");

		// 3.ifpresent
		optional.ifPresent(m -> System.out.println(m));

		// 4.orElse
		System.out.println(optional.orElse("defaultValue"));

		System.out.println();
		String name = "Megha";
		Optional<String> of = Optional.of(name);
		System.out.println(of.isPresent());

		// 5.get
		String data = of.get();
		System.out.println(data);

		// 6.hashcode
		System.out.println(of.hashCode());

		// 7.empty
		Optional<String> o = Optional.empty();
		System.out.println(o);

		// 8.stream
		System.out.println("Optional" + of);
		System.out.println("Stream is:");
		of.stream().forEach(System.out::println);

		// 9.filter
		Optional<String> v = Optional.ofNullable("Megha");
		System.out.println("1st filter: " + v.filter(val -> val.contains("z")));
		System.out.println("2nd filter: " + v.filter(val -> val.contains("a")));

		// 10.orElseGet

		// non empty
		Optional<Integer> opin = Optional.of(345678);

		Integer i = opin.orElseGet(() -> -999);

		System.out.println("Its not empty int value : " + i);

		// optional empty
		Optional<Integer> emp = Optional.empty();

		Integer orELseG = emp.orElseGet(() -> -999);
		System.out.println("For empty optional result : " + orELseG);

	}

}
