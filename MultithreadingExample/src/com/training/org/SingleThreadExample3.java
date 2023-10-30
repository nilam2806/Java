package com.training.org;



class ThreadExample3 extends Thread{
	private int sleepTime;
	// PrintThread constructor assigns name to thread 
	// by calling superclass Thread constructor
	public ThreadExample3(String name){
		super(name);
		// sleep between 0 and 5 seconds
		sleepTime = (int) ( Math.random() * 5000 );
		// display name and sleepTime
		System.err.println( 
				"Name: " + getName() + ";  sleep: " + sleepTime );
	}
	// control thread's execution
	public void run()
	{
		// put thread to sleep for a random interval
		try {
			System.err.println( getName() + " going to sleep" );
			// put thread to sleep
			Thread.sleep( sleepTime );
		}
        catch ( InterruptedException interruptedException ) {
            System.err.println( interruptedException.toString() );
          }
    
         // print thread name
         System.err.println( getName() + " done sleeping" );
	}

}

public class SingleThreadExample3 {
	public static void main(String[] args) {
		ThreadExample3 th1=new ThreadExample3("Thread1");
		ThreadExample3 th2=new ThreadExample3("Thread2");
		ThreadExample3 th3=new ThreadExample3("Thread3");
		
//
		System.out.println("Starting Threads....");
		th1.start();
		th2.start();
		th3.start();
		
	}
}
