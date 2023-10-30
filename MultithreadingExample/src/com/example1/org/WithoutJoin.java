package com.example1.org;

public class WithoutJoin extends Thread {
	public WithoutJoin(String name) {
		super(name);
	}

	public void run() {
		System.out.println("r1 " + currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
			// do something
		}
		System.out.println("r2 " + currentThread().getName());
	}

	public static void main(String[] args) {
		WithoutJoin t1 = new WithoutJoin("Thread1");
		WithoutJoin t2 = new WithoutJoin("Thread2");
		t1.start();
		try {
			t1.join(); // Waiting for t1 to finish
		} catch (InterruptedException ie) {
		}
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
