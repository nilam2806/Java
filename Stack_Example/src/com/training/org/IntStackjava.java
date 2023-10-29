package com.training.org;

public class IntStackjava {
	
	import java.util.Scanner;
	class sum
	{
	    public static void main(String[] args)  
	    { 
	        Scanner sr = new Scanner(System.in);
	        int n = sr.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i] = sr.nextInt();
	        }
	        int temp=0;
	        for(int i=0;i<n;i++) // select an element
	        for(int j=i+1;j<n;j++) //traverse ahead and check for duplicate
	            if(arr[i]==arr[j])
	              {
	                System.out.println(arr[i]);
	                temp=1;
	                i=n;j=n;
	              }
	        if(temp==0)
	        System.out.println("No repeating integer found");
	    }
	}

}



import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("The second highest number in the array is: " + secondMax);
        } else {
            System.out.println("No second highest element found in the array.");
        }
    }
}
class FibonacciExample1{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
