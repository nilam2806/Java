package dao;

import java.util.List;

import bean.Account;

public interface AccountDao {


	public Account createAccount();
	
	public boolean updateAccount();
	
	public boolean removeAccount();
	
	public List<Account> getAccountsOfCustomer();
	
	public String getAccountDetails();

}
