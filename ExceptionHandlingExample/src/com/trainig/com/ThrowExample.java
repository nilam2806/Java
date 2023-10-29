package com.trainig.com;

class MyException extends Exception {
	private String myMessage;

	public MyException() {
		System.out.println("Parameterized constructor of MyException class is called");
		myMessage = "";
	}

	public MyException(String msg) {
		System.out.println("Parameterized constructor of MyException class is called");
		myMessage = msg;
	}

	public String getmyMessage() {
		return this.myMessage;
	}
}

public class ThrowExample {
	public static void main(String[] args) {
		int a = 0;
		try {
			if (a == 0) {
				throw new MyException("This is my Custom Message");
			}
		} catch (MyException e) {
			System.out.println(e.getmyMessage());
		}
	}
}
