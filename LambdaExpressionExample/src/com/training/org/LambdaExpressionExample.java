package com.training.org;

import java.util.*;

public class LambdaExpressionExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Eshan");
		list.add("Tanish");
		list.add("Anish");
		list.add("jai");

		list.forEach((n) -> System.out.println(n));
	}
}
