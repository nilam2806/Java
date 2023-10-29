package com.assessment.org;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		int i;
   
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of count for the Fibonacci series: ");
        int count = scanner.nextInt();

        System.out.println("Fibonacci series with " + count + " numbers: ");
		 for(i=0;i<count;++i)  
		 {    
		  n3=n1+n2; 
		  System.out.println(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
	
}
