package com.training.org;

import com.training.org.NestedInnerClassExample.InnerClass;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("Argument Values "+args[0]+" "+args[1]);
//		InnerClass obj1 = new NestedInnerClassExample("myMessage").new InnerClass(100);
//		obj1.show();

//		NestedInnerClassExample obj2 = new NestedInnerClassExample();
//		obj2.show();
		
		NestedInnerClassExample.InnerStatic obj3 = new NestedInnerClassExample.InnerStatic();
		obj3.show();

	}

}
