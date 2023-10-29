package com.advance.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample6 {
	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 3, 4, 2));

		System.out.println("Ascending Order");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("\nDescending Order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
