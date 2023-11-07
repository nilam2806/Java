package com.assessment.org;

public class Customer {
	private int id;
	private String name;
	private String department;
	private double balance;

	public Customer(int id, String name, String department, double balance) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getBalance() {
		return balance;
	}
	public String toString() {
        return id + ", " + name + ", " + department + ", " + balance;
    }
}
