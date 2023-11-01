package com.training.org;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface3 {
	double getPiValue(int a);
}

public class LambdaAreaCalculation3 {

	public static void main(String[] args) {

		// with lambda expression
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter the r value :");
			int r = kb.nextInt();
			MyInterface3 ref;
			ref = (int a) -> {
				System.out.println("This is lambda expression multiple statement");
				return a * a * 3.1415;
			};
			System.out.println(ref);

			System.out.println("Area of Circle with given radius is = " + ref.getPiValue(r));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
