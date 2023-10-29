package com.training.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Employee {
	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		System.out.println("Default constructor of Emloyee is called");
		this.empId = 0;
		this.empName = "";
		this.salary = 0;
	}

	public Employee(int EmpId, String empName, double salary) {
		System.out.println("Parameterized constructor of Emloyee is called.");
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	public String toString() {
		return "EmpId: " + this.empId + " |Name: " + this.empName + " |salary: " + this.salary;
	}

}

class Organization {
	private String orgName;
	private String orgLocation;

	// private Employee emp;
	// private Employee[] emp;
	private ArrayList<Employee> emp;
	// private Employee[] emp;

	public Organization() {
		System.out.println("Default constructor of Organization is called");
		this.orgName = "";
		this.orgLocation = "";
		this.emp = new ArrayList<>();

	}

	public Organization(String orgName, String orgLocation, int empId, String empName, int size) {
		System.out.println("Parameterized constructor of Organization is called.");
		this.orgName = orgName;
		this.orgLocation = orgLocation;
		this.emp = new ArrayList<>(size);

	}

	public Organization(String orgName, String orgLocation, Employee[] empList) {
		System.out.println("Parameterized constructor of Organization is called.");
		this.orgName = orgName;
		this.orgLocation = orgLocation;
		this.emp = new ArrayList<>(Arrays.asList(empList));

	}

	public void addEmployee(Employee emp1) {
		emp.add(emp1);
	}

	public String toString() {
		// return Arrays.toString(emp)+" OrgName: "+this.orgName+"OrgLocation:
		// "+this.orgLocation;
		return Arrays.asList(emp) + " OrgName: " + this.orgName + " |OrgLocation: " + this.orgLocation;

	}

	public ArrayList<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return emp;
	}

}

public class ContainmentExample {
	public static void main(String[] args) {
//		Organization mav=new Organization("Maveric", "Pune", 101, "Eshan", 100000);
//		System.out.println(mav);

		Employee empList[] = new Employee[5];
		empList[0] = new Employee(101, "Eshan", 10000);
		empList[1] = new Employee(102, "Priya", 20000);
		empList[2] = new Employee(103, "Anand", 30000);
		empList[3] = new Employee(104, "Manish", 40000);
		empList[4] = new Employee(105, "Tanish", 50000);

		Organization org1 = new Organization("MYOrg", "pune", empList);
		System.out.println(org1);

//		Employee newEmployee = new Employee(106, "Riya", 60000);
//		org1.addEmployee(newEmployee);
//        System.out.println(org1);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter employee ID (0 to stop): ");
			int empId = sc.nextInt();
			if (empId == 0) {
				break;
			}
			System.out.print("Enter employee name: ");
			String empName = sc.next();

			System.out.print("Enter employee salary: ");
			double salary = sc.nextDouble();

			Employee newEmployee = new Employee(empId, empName, salary);
			org1.addEmployee(newEmployee);
			System.out.println("Added new employee: " + newEmployee);
		}

		sc.close();

		System.out.println("Final Organization State:");
		System.out.println(org1);

		ArrayList<Employee> allEmployees = org1.getEmployees();
		System.out.println("All Employees:");
		for (Employee employee : allEmployees) {
			System.out.println(employee);
		}
	}
	// Oraganization org1=new Oraganization("MYOrg","pune",5);
}
