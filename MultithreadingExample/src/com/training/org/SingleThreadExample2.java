package com.training.org;

class ThreadExample1 extends Thread {
	private int sleepTime;

	// PrintThread constructor assigns name to thread
	// by calling superclass Thread constructor
	public ThreadExample1(String name) {
		super(name);
		// sleep between 0 and 5 seconds
		sleepTime = (int) (Math.random() * 5000);
		// display name and sleepTime
		System.err.println("Name: " + getName() + ";  sleep: " + sleepTime);
	}

	// control thread's execution
	public void run() {
		// put thread to sleep for a random interval
		try {
			System.err.println(getName() + " going to sleep");
			// put thread to sleep
			Thread.sleep(sleepTime);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

public class SingleThreadExample2 {
	public static void main(String[] args) {
		ThreadExample1 th1 = new ThreadExample1("Thread1");
		ThreadExample1 th2 = new ThreadExample1("Thread2");
		ThreadExample1 th3 = new ThreadExample1("Thread3");

		System.out.println("Starting Threads....");
		th1.start();
		th2.start();
		th3.start();

	}
}
