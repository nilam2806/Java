package dao;

import java.math.BigDecimal;
import java.util.List;

import bean.Account;
import bean.Transaction;

public interface TransactionDao {

public List<Transaction> getTransactionsOfAccount(Account account);
	
	public String getTransactionDetails(Transaction transaction);	

	
	public boolean withdraw(Account account, BigDecimal amount);
	
	
	public boolean deposit(Account account, BigDecimal amount);

	
	public boolean transfer(Account from, Account to, BigDecimal amount);
}


