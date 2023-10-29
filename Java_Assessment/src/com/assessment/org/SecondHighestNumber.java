package com.assessment.org;

public class SecondHighestNumber {
	public static void main(String[] args) {
		
		
		      int temp, size;
		      int arr[] = {20,45,76,98,114,5};
		      size = arr.length;

		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(arr[i]>arr[j]){
		               temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
		         }	
		      }
		      System.out.println("Second Highest number is:: "+arr[size-2]);
		   
		}
}
        
