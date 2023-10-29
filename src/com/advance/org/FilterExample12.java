package com.advance.org;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample12 {
	public static void main(String[] args) throws IOException {

		// Creating a File object 
        File fileName = new File("C:\\Users\\nilamp\\Documents\\OOPS.txt"); 
  
        // Create a Stream of string type 
        // using the lines() method to 
        // read one line at a time from the text file 
        Stream<String> text = Files.lines(fileName.toPath()); 
  
        
        text.parallel().forEach(System.out::println);
       
        
        // Creating parallel streams using parallel() method 
        // later using forEach() to print on console 
//        text.parallel().forEach(System.out::println); 
  
        // Closing the Stream 
        // using close() method 
        text.close(); 
	}
}
