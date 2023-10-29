package com.training.org;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) {
		
		System.out.println(Stream.of(1, 2, 3, 4, 5)
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList()));
//		List<String> names = Arrays.asList("John", "Jane", "Adman","Eve", "Mike");
//		
//		List<String> filteredNames= names.stream()
//										.filter(name ->name.startsWith("J"))
//										.map(String::toUpperCase)
//										.collect(Collectors.toList());
//		
//		System.out.println(filteredNames);
		
	}

}
