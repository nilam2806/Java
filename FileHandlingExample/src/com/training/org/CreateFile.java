package com.training.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		
		File myobj=new File("C:\\Users\\nilamp\\Documents\\Learning Java\\File Handling\\myfile.txt");
		Scanner myReader = new Scanner(myobj);
		int words=0;
		while (myReader.hasNext()) {
			String word = myReader.next();
			System.out.println(word);
			words++;
		}
		System.out.println("Total number of words "+words);
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\nilamp\\Documents\\Learning Java\\File Handling\\myfile.txt");
//
//	     int k;
//	     while((k=fis.read()) != -1)
//	     {
//	        System.out.print((char)k);
//	     }
//	     fis.close();
		
		
//		try {
//			FileWriter myWriter = new FileWriter("C:\\Users\\nilamp\\Documents\\Learning Java\\File Handling\\myfile.txt");
//			myWriter.write("Data to write into file");
//
//			myWriter.close();
//			System.out.println("Successfully wrote to the file.");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			File myObj = new File("C:\\Users\\nilamp\\Documents\\Learning Java\\File Handling\\myfile.txt");
//			Scanner myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//
//		}
//		try {
//				
//			File obj = new File("C:\\Users\\nilamp\\Documents\\Learning Java\\File Handling\\myfile.txt");
//		if(obj.createNewFile()) {
//			System.out.println("File created: "+obj.getName());
//		}
//		else {
//			System.out.println("File already exist. ");
//		}
//			if (obj.exists()) {
//				System.out.println("File name: " + obj.getName());
//				System.out.println("Absolute Path: " + obj.getAbsolutePath());
//				System.out.println("Writable " + obj.canWrite());
//				System.out.println("Readable " + obj.canRead());
//				System.out.println("File size in bytes " + obj.length());
//
//			} else {
//				System.out.println("File does not exist.");
//			}
//		} catch (Exception e) {
//			System.out.println("An error has occured.");
//			e.printStackTrace();
//		}
	}

}
