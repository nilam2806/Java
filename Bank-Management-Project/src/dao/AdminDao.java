package dao;

import bean.Admin;
import bean.Customer;
import exception.AccountException;
import exception.AdminException;
import exception.CustomerException;

public interface AdminDao {

   public Admin LoginAdmin(String username, String password)throws AdminException;
	
	public int addCustomer(String cname,String cmail, String cpass, String cmob, String cadd) throws CustomerException;

	public String addAccount(int cbal,int cid) throws AccountException;
	
	public String updateCustomer(int cACno,String cadd) throws CustomerException;

	public  Customer viewCustomer(String cACno) throws CustomerException;
	
	public int getCustomer(String cmail,String cmob) throws CustomerException;
	
	public Customer viewAllCustomer() throws CustomerException;
	
	public String deleteAccount(int cACno) throws CustomerException;
}
