package com.advance.org;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample13 {
	public static void main(String[] args) throws IOException {

//		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		
//		 list.parallelStream().forEach(System.out::println);

		Stream.of("A", "B", "C").parallel().forEach(x -> System.out.println("forEach: " + x));

		Stream.of("A", "B", "C").parallel().forEachOrdered(x -> System.out.println("forEachOrdered: " + x));
	}
}
