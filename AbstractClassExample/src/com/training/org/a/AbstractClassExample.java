package com.training.org.a;

abstract class ParentClass{
	public ParentClass() {
		System.out.println("Default constructor of parentclass is called");
		
	}
	public void displayParent() {
		System.out.println("displayParent method from ParenClass is called");
	}
	public abstract void show();
	
	
}
	class ChildClass extends ParentClass{
		public ChildClass() {
			System.out.println("Default constructor of chaildclass is called");
		}
		@Override
		public void show() {
			System.out.println("show method from ChildClass is called");
		}
		
		public void displayParent2() {
			System.out.println("displayParent method from ParentClass2 is called");
		}
	}
	
	
	
	class ChildClass2 extends ParentClass{
		public ChildClass2() {
			System.out.println("Default constructor of parentclass2 is called");
		}
		@Override
		public void show() {
			System.out.println("show method from ChildClass2 is called");
			
		}
		
	}


public class AbstractClassExample {
	public static void main(String [] args) {
		ParentClass p1=new ChildClass();
		p1.displayParent();
		p1.show();
		
		
//		p1=new ChildClass2();
//		p1.displayParent();
//     	p1.show();
//		
	}
	

}
