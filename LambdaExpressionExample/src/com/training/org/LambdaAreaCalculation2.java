package com.training.org;

import java.util.Scanner;

@FunctionalInterface
interface MyInterface2 {
	double getPiValue();
}

public class LambdaAreaCalculation2 {
	public int show() {
		return 100;
	}

	public static void main(String[] args) {

		// with lambda expression
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter the r value :");
			int r = kb.nextInt();
			MyInterface2 ref;
			ref = () -> 3.1415;
			System.out.println(ref);
			System.out.println(new LambdaAreaCalculation2().show());
			System.out.println("Area of Circle with given radius is = " + r * r * ref.getPiValue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
