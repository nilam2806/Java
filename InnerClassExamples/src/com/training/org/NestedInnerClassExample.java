package com.training.org;

public class NestedInnerClassExample {
	private String message;
	static int outerNum1=200;

	class InnerClass {

		private int num1;

		public InnerClass() {
			System.out.println("Default constructor of inner class is called.");
		}

		public InnerClass(int num1) {
			System.out.println("Parameterized constructor of inner class is called.");
			this.num1 = num1;
		}

		public void show() {
			NestedInnerClassExample innerObj= new NestedInnerClassExample("New message");
			innerObj.show();
			System.out.println("In a nested class method :" +this.num1+" "+message);
		}
	}
	
	static class InnerStatic{
		public void show() {
			System.out.println("I am inside the InnerStatic method: "+outerNum1);
		}
	}

	public NestedInnerClassExample() {
		System.out.println("Default constructor of NestedInnerClassExample is called that is outer class.");
	}

	public NestedInnerClassExample(String message) {
		System.out.println("Paramaterized constructor of NestedInnerClassExample is called that is outer class.");
		this.message = message;
	}

	public void show() {
		System.out.println("This is show method from a outer class :" + this.message);
	}

}
