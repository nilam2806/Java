package com.trainig.com;

public class ExceptionEx {
	public static void main(String[] args) {
        int a = 100;
		int b = 0;
		int [] arr= new int[10];
		try {
			System.out.println("Division of a/b is " + (a / b));
			
			System.out.println("Display the array index 11");
			int element=arr[11];
			
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero exception");
		}
	}
}


