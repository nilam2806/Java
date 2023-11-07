package com.assessment.org;

import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {

		ICustomerService customerService = new CustomerService();

		customerService.loadCustomersFromCSV("customer_data.csv");

		// find all customers sorted by id
		List<Customer> sortedCustomers = customerService.findAll();
		System.out.println("All Customers Sorted by ID:");
		for (Customer customer : sortedCustomers) {
			System.out.println(customer);
		}

		// find customer with highest balance
		Customer customerWithHighestBalance = customerService.findCustomerWithHighestBalance();
		System.out.println("\nCustomer with Highest Balance:");
		System.out.println(customerWithHighestBalance);

		// transformed file
		customerService.writeNewFile();
	}

}
