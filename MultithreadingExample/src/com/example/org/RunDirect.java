//What if we call run() method directly instead start() method?

//Each thread starts in a separate call stack.
//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
package com.example.org;

class RunDirect extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		RunDirect t1 = new RunDirect();
		t1.run();// fine, but does not start a separate call stack
	}
}
