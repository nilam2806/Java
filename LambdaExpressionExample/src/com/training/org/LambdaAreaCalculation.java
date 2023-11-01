package com.training.org;
import java.util.Scanner;
@FunctionalInterface
interface MyInterface{
	double getPiValue();
}
public class LambdaAreaCalculation {
	public static void main(String[] args) {
		
		//with lambda expression
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter the value of radius");
			int r = kb.nextInt();
			MyInterface ref;
			ref = () -> 3.1415;
			System.out.println("Area of Circle with given radius is = " + r * r * ref.getPiValue());
		}
		
		
		//Without lambda expression...use implements MyInterface after class name
//		Scanner kb = new Scanner(System.in);
//		int r = kb.nextInt();
//		MyInterface l1=new LambdaAreaCalculation();
//		System.out.println("Area of Circle with given radius is = " + r * r * l1.getPiValue());
	}

//	@Override
//	public double getPiValue() {
//		return 3.1415;
//	}
//	

}
