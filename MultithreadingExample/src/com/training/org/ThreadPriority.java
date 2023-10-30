package com.training.org;

class ThreadPriority1 extends Thread {
	private int sleepTime;

	// PrintThread constructor assigns name to thread
	// by calling superclass Thread constructor
	public ThreadPriority1(String name) {
		super(name);
		// sleep between 0 and 5 seconds
		sleepTime = (int) (Math.random() * 5000);
		// display name and sleepTime
		//System.err.println("Name: " + getName() + ";  sleep: " + sleepTime);
	}

	// control thread's execution
	public void run() {
		System.err.println(getName() + " going to call");
		// put thread to sleep
//			Thread.sleep( sleepTime );

		// print thread name
		System.err.println(getName() + " ending");
	}
}

public class ThreadPriority {
	public static void main(String[] args) {
		ThreadPriority1 th1 = new ThreadPriority1("Thread1");
		ThreadPriority1 th2 = new ThreadPriority1("Thread2");
		ThreadPriority1 th3 = new ThreadPriority1("Thread3");
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);
//
		System.out.println("Starting Threads....");
		th1.start();
		th2.start();
		th3.start();

	}

}
