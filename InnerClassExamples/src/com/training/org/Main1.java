package com.training.org;
	// Class 3
	// Main class
public class Main1 {
	
        // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Creating object of outer class inside main()
	        // method
	    	InnerDeclaredOuterClass x = new InnerDeclaredOuterClass();
	 
	        // Calling over the same method
	        // as we did for inner class above
	        x.outerMethod();
	    }
	}

