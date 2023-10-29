package com.assessment.org;

public class FirstRepeatingElement {

	
	    public static void main(String[] args) {
	        int[] arr = {7, 2, 3, 4, 5, 1, 7}; 

	        int firstRepeating = findFirstRepeating(arr);

	        if (firstRepeating != -1) {
	            System.out.println("The first repeating element is: " + firstRepeating);
	        } else {
	            System.out.println("No repeating elements found in the array.");
	        }
	    }

	    public static int findFirstRepeating(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    return arr[i]; 
	                }
	            }
	        }

	        return -1; 
	    }
	    	
	    	
	}



