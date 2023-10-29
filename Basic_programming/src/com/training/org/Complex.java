package com.training.org;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Complex {
	private int real;
	private int imag;
	
	//Default constructor
	public Complex() {
		System.out.println("Default constructor of Complex is called");
		real=0;
		imag=0;
	}
	
	//Parameterised constructor
	public Complex(int real,int imag) {
		System.out.println("Parameterized constructor of Complex class is called");
		this.real=real;
		this.imag=imag;
	}
	
	public String toString() {
		return ("Complex values are "+real+" "+imag);
	}
	
	
//	public void showComplexValues() {
//		System.out.println("Complex values are "+real+" "+imag);
//	} 
	
	
	public void acceptComplexValues() throws IOException{
		
		//First method
//		
//		BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the values for real");
//		this.real=Integer.parseInt(input.readLine());
//		
//		System.out.println("Enter the values for imag");
//		this.imag=Integer.parseInt(input.readLine());
		
		
		//second method
//		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the values for real");
		this.real=input.nextInt();
		
		System.out.println("Enter the values for imag");
		this.imag=input.nextInt();
		
		
		
		//Third method
		
        this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter first value"));
	    this.imag = Integer.parseInt(JOptionPane.showInputDialog("Enter second value"));
		JOptionPane.showMessageDialog(null, "Values are "+this.real+" "+this.imag);
	}
	
	public static void main(String[] args) throws IOException {
		
		Complex c1 =new Complex();
		c1.acceptComplexValues();
		
		System.out.println(c1);
		
		
//		c1.showComplexValues();
		
//		Complex c2=new Complex(100,200);
//		c2.showComplexValues();
		
//		Complex c1=new Complex();
//		c1.showComplexValues();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I: "+i);
//		}
		
		
//		System.out.println(c1);
	}

}


