package com.training.org;

import java.util.*;

public class LambdaExpressionExample2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Eshan");
		list.add("Anand");
		list.add("Prashant");

		// first loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// second loop
		for (String str : list) {
			System.out.println(str);
		}

		// Third loop

		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);
		}

		// Fourth loop
		list.forEach((n) -> System.out.println(n));
	}
}
