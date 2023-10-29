package com.training.org.a;

public class CalculateSalary {
	public static void main(String[] args) {
		int noOfWorkingHours = 370;
        NetSalaryCalculate netsal = new DecemberSalaryCalculate(noOfWorkingHours);
        double netSalary = netsal.calculateNetSalary();
        System.out.println("Net Salary for December 2022: $" + netSalary);
	}

}
