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

public class FilterExample14 {
	public static void main(String[] args) throws IOException {

//		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//		list.parallelStream().forEach(System.out::println);
//        final int ans = list.stream().reduce(0, (value, sum) ->{ System.out.println("sum "+sum+" value "+value);sum += value;return sum;});
//
//		  System.out.println("ANS"+ans);

		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		final int ans = list.stream().reduce(0, (value, sum) -> sum += value);

		System.out.println("Sum: " + ans);

	}
}
