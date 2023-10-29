package dao;

import java.util.List;

import bean.Branch;
import bean.Employee;

public interface BranchDao {

   public Branch createBranch();
	
	public boolean updateBranch();
	
	public boolean removeBranch();
	
	public String getBranchDetails();
	
	public List<Employee> getBranchEmployees();

}
