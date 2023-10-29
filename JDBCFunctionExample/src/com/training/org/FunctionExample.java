package com.training.org;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionExample {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false",
					"root", "root");

//			CallableStatement cs=con.prepareCall("{?=call isPrime(?)}");
//            cs.registerOutParameter(1, Types.BOOLEAN);
//            cs.setInt(2,5);
//            cs.execute();
//            System.out.println("Result : "+cs.getInt(1));
//            
			CallableStatement cs = con.prepareCall("{?=call isPrime(?)}");
			cs.registerOutParameter(1, Types.NVARCHAR);
			cs.setInt(2, 7);
			cs.execute();
			System.out.println("Result : " + cs.getString(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			con.close();
		}
	}

}
