package com.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Class1 {

	void get(int n) {

	}

	void getter(int n) {

	}

	public static void main(String[] args) {

		/*
		 * List<String> emp = new ArrayList<>(); emp.add("john"); emp.add("steveb");
		 * emp.add("paul"); emp.add("mark"); emp.add("paula"); emp.add("pearson");
		 * emp.add(null); emp.add(null); emp.add(null);
		 */

		List<String> emp = Arrays.asList("payukl", "peasron", "mark","mark");
		List<Integer> num = Arrays.asList(2,3,4,8,9);

		emp.stream().map(n -> n.length()).forEach(n->System.out.println(n));
		/*
		 * (for(String s : emp) { System.out.println(s);
		 * 
		 * }
		 */

		// emp.forEach(s -> System.out.println(s));

		/*
		 * emp.forEach(s -> { if (s.startsWith("p")) { System.out.println(s); } });
		 */

		// Predicate<String> p = (s) -> s.startsWith("p");

		//emp.stream().filter(s -> s != null).forEach(s -> System.out.println(s));

		emp.stream().filter(s -> s != null).sorted().collect(Collectors.toSet()).forEach(s -> System.out.println(s));
		;

	}
}
