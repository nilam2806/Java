package com.trainig.com;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int a = 0;
		try {
			a = 100 / 10;
			// System.out.println("Value of a" + a);
			System.out.println("Done");

		} catch (ArithmeticException e) {
			System.out.println("FOUND ERROR" + e.getMessage());
		} catch (Exception e) {
			System.out.println("ERROR " + e.getMessage());
		} finally {
			System.out.println("We are always with you");
		}
		System.out.println("ENDED");
		System.out.println("Value of a " + a);

	}

}
