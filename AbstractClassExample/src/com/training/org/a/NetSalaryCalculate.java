package com.training.org.a;

abstract class NetSalaryCalculate {
	String month;
	protected int noOfWorkingHours;
	
	public NetSalaryCalculate(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }

	protected abstract int calculateDaysInDecMonth();
	
	
	public double calculateNetSalary() {
        int noOfDaysInMonth = calculateDaysInDecMonth();
        double perDaySalary = 10000.0 / noOfDaysInMonth;
        double perHourSalary = perDaySalary / 8;
        return perHourSalary * noOfWorkingHours;
	
}
}
	class DecemberSalaryCalculate extends NetSalaryCalculate {
	    public DecemberSalaryCalculate(int noOfWorkingHours) {
	        super(noOfWorkingHours);
	    }

		@Override
		protected int calculateDaysInDecMonth() {
			
			return 31;
		}
	}