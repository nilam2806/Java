package com.assessment.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV {

	public static void main(String[] args) {

		String csvFilePath = "C:\\Users\\nilamp\\Nilam\\AdvanceJava_Assessment\\customer_data.csv";
		
		writeDataToCSV(csvFilePath);
        readDataFromCSV(csvFilePath);
	}

	public static void writeDataToCSV(String filePath) {
		String data1 = "2, sachin tendulkar, digital, 10000";
		String data2 = "1, Rahul Dravid, qe, 2000";
		String data3 = "3, virat kohli, hr, 50000";

		try (FileWriter writer = new FileWriter(filePath)) {
			writer.write(data1 + "\n");
			writer.write(data2 + "\n");
			writer.write(data3 + "\n");
			System.out.println("CSV file created successfully at: " + filePath+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readDataFromCSV(String filePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {

				String[] fields = line.split(",");
				if (fields.length == 4) {
					int id = Integer.parseInt(fields[0].trim());
					String name = fields[1].trim();
					String department = fields[2].trim();
					double balance = Double.parseDouble(fields[3].trim());
					System.out.println(
							"ID: " + id + ", Name: " + name + ", Department: " + department + ", Balance: " + balance);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
