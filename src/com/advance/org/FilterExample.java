package com.advance.org;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) {

		System.out.println(Stream.of(1, 2, 3, 4, 5).filter(x -> x % 2 == 0).collect(Collectors.toList()));
	}
}
