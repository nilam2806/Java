package com.training.org;

public class StringBuilderExamples {
	public static void main(String[] args) {
//		StringBuilder sb=new StringBuilder();
//		sb.append("JAVA");
//		sb.append("Programming");
//		
//		System.out.println(sb.capacity());
//		sb.insert(2, "World");
//		
//		System.out.println(sb);
//		System.out.println(sb.capacity());
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  


		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  


		StringBuilder sb11=new StringBuilder("Hello");  
		sb11.replace(1,3,"Java");  
		System.out.println(sb11);//prints HJavalo  


		StringBuilder sb111=new StringBuilder("Hello");  
		sb111.delete(1,3);  
		System.out.println(sb111);//prints Hlo  


		StringBuilder sb1111=new StringBuilder("Hello");  
		sb1111.reverse();  
		System.out.println(sb1111);//prints olleH  


	}
	
}
