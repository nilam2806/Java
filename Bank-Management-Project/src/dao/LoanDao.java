package dao;

import java.util.List;

import bean.Loan;

public interface LoanDao {

public Loan createLoan();
	
	public boolean updateLoan();
	
	public boolean removeLoan();
	
	public List<Loan> getLoansOfCustomer();
	
	public String getLoanDetails();

}
