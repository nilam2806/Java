package com.training.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCOnnectionExample {
	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/org?autoReconnect=true&useSSL=false";
		String username="root";
		String password="root";
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,username,password);
			System.out.println(con);
			if(con!=null) {
				System.out.println("Connection is successfuly...");
			}else {
				System.out.println("Not able to connect.....");
			}
		}
		catch(Exception e) {
				System.out.println("ERROR"+e.getMessage());		}
		finally {
			if(con!=null) {
			con.close();
			System.out.println("Closing Connection....");
			}else {
				System.out.println("Can't able to close connection...");
			}
		}
	}

}
