package dao;

import bean.Employee;

public interface EmployeeDAO {

    public Employee createEmployee();
	
	public boolean updateEmployee();
	
	public boolean removeEmployee();
	
	public boolean setManager();

}
