package com.assessment.org;

import java.util.List;

public interface ICustomerService {
	List<Customer> findAll();

	Customer findCustomerWithHighestBalance();

	void writeNewFile();

	void loadCustomersFromCSV(String csvFilePath);
}
