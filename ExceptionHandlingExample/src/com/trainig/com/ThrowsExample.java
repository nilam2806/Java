package com.trainig.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fIn = new FileInputStream("MyFile.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
