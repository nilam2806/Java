package com.advance.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample10 {
	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		final List<Integer> ans = list.stream().skip(2).collect(Collectors.toList());

		System.out.println("Skipped List: " + Arrays.toString(ans.toArray()));
	}
}
