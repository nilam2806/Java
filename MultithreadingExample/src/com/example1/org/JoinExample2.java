package com.example1.org;

public class JoinExample2 extends Thread
{
	public JoinExample2(String name) {
		super(name);
	}
	public void run()
	{
		System.out.println("r1 "+currentThread().getName());
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException ie) 
		{ 
			// do something
		}
		System.out.println("r2 "+currentThread().getName());
	}
	public static void main(String[] args)
	{
		JoinExample2 t1=new JoinExample2("Thread1");
		JoinExample2 t2=new JoinExample2("Thread2");
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}