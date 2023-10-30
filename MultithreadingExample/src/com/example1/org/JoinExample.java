package com.example1.org;



public class JoinExample extends Thread {

	
	    public void run( ) 
	    {
	      String str = this.getName();
	      if(str.equals("First"))
	       {
	             for(int i=0; i<=100; i++)
	             {
	                  System.out.println(str + ": " + i);
	                  try
	                  {
	                       Thread.sleep(1000);
	                 }
	                  catch(InterruptedException e)
	                  {
	                         e.printStackTrace( );
	                  }
	             }
	         }	
	         else if(str.equals("Second"))
	        {
	             for(int i=100; i >=0; i--)
	             {
	                  System.out.println(str + ": " + i);
	                  try
	                  {
	                       Thread.sleep(1000);
	                  }
	                  catch(InterruptedException e)
	                  {
	                          e.printStackTrace( );
	                  }
	                }
	         }
	       else if(str.equals("Third"))
	        {
	             for(int i=200; i >=100; i--)
	             {
	                  System.out.println(str + ": " + i);
	                  try
	                  {
	                       Thread.sleep(1000);
	                  }
	                  catch(InterruptedException e)
	                  {
	                          e.printStackTrace( );
	                  }
	             }
	  }
	       }          // close run( ) method

	     

		public static void main(String args[])
	     {
			JoinExample tr1 = new JoinExample( );
			JoinExample tr2 = new JoinExample( );
			JoinExample tr3 = new JoinExample( );
	           
	             tr1.setName("First");
	             tr2.setName("Second");
	             tr3.setName("Third");
	   
	            tr1.start( );           
	            tr2.start( );
	         tr3.start( );

//	       try
//	            {
//	                tr1.join();
//	                tr2.join();
//	                tr3.join();
//	            }
//	            catch(InterruptedException e)
//	            {
//	                  e.printStackTrace();
//	           }
	    }

		
	}

