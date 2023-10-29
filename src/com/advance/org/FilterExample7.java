package com.advance.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample7 {
	public static void main(String[] args) {

		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3));

		final List<Integer> ans = list.stream().distinct().collect(Collectors.toList());

		System.out.println("Distinct List: " + Arrays.toString(ans.toArray()));
	}
}
