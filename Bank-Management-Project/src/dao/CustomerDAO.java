package dao;

import java.util.List;

import bean.Account;
import bean.Customer;
import bean.Transaction;
import exception.CustomerException;

public interface CustomerDAO {
	

public Customer LoginCustomer(String username, String password, int accountno)throws CustomerException; 
	
	public int viewBalance(int cACno) throws CustomerException;
	
	public int Deposit(int cACno, int amount) throws CustomerException; 
	
	public int Withdraw(int cACno, int amount) throws CustomerException;
	
	public int Transfer(int cACno, int amount, int cACno2) throws CustomerException; 
	
	public List<Transaction> viewTransaction(int cACno) throws CustomerException;



}
