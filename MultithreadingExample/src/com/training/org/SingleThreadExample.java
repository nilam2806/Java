package com.training.org;

class ThreadExample extends Thread{
	public void run() {
		System.out.println("Run method is called from ThreadExample class "+currentThread().getId());
		System.out.println(currentThread().getName());
	}
}

public class SingleThreadExample {
	public static void main(String[] args) {
		ThreadExample th = new ThreadExample();
		th.start();
		
	}

}
