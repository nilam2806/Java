package com.assessment.org;
import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) 
    {
        int n,Even = 0, Odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                Even = Even + a[i];
            }
            else
            {
                Odd = Odd + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+Even);
        System.out.println("Sum of Odd Numbers:"+Odd);
    }
}
