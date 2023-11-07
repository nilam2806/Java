package com.assessment.org;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService implements ICustomerService {

	private List<Customer> customers = new ArrayList<>();

//	public CustomerService(String csvFilePath) {
//		loadCustomersFromCSV(csvFilePath);
//	}

	@Override
	public List<Customer> findAll() {
		Collections.sort(customers, (c1, c2) -> Integer.compare(c1.getId(), c2.getId()));
		return customers;
	}

	@Override
	public Customer findCustomerWithHighestBalance() {
		Customer customerWithHighestBalance = null;
		double maxBalance = Double.MIN_VALUE;
		for (Customer customer : customers) {
			if (customer.getBalance() > maxBalance) {
				maxBalance = customer.getBalance();
				customerWithHighestBalance = customer;
			}
		}
		return customerWithHighestBalance;
	}

	@Override
	public void writeNewFile() {
		try {
			String outputFilePath = "C:\\Users\\nilamp\\Nilam\\AdvanceJava_Assessment\\transformed_customers.csv";
			FileWriter writer = new FileWriter(outputFilePath);
			for (Customer customer : customers) {
				writer.write(customer.getId() + ", " + customer.getName() + "\n");
			}
			writer.close();
			System.out.println("\nNew CSV file created at: " + outputFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadCustomersFromCSV(String csvFilePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length == 4) {
					int id = Integer.parseInt(parts[0].trim());
					String name = parts[1].trim();
					String department = parts[2].trim();
					double balance = Double.parseDouble(parts[3].trim());
					Customer customer = new Customer(id, name, department, balance);
					customers.add(customer);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
