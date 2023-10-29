package com.advance.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample2 {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve", "Mike");

		List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(filteredNames);
	}
}
