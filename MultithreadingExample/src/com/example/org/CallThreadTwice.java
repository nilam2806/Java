//Can we start a thread twice?

//No. After starting a thread, it can never be started again. If you does so, an "IllegalThreadStateException" is thrown.
//In such case, thread will run once but for second time, it will throw exception.

//Let's understand it by the example given below:
package com.example.org;

public class CallThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		CallThreadTwice t1 = new CallThreadTwice();
		t1.start();
		t1.start();
	}

}
