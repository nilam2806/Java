package com.training.org;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoreProcedureExample {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false",
					"root", "root");
//			CallableStatement cs=con.prepareCall("{call updateEmpSalary(?,?)}");
//			cs.setInt(1, 102);
//			cs.setInt(2, 1);
//			cs.executeUpdate();
//			System.out.println("Salary Updated Successfully....");

//			CallableStatement cs= con.prepareCall("{call countEmp(?)}");
//			cs.registerOutParameter(1, Types.INTEGER);
//			cs.execute();
//			System.out.println("Number of Employees: "+cs.getInt(1));

//			CallableStatement cs= con.prepareCall("{call incCounter(?)}");
//			cs.registerOutParameter(1, Types.INTEGER);
//			cs.setInt(1, 3);
//			cs.execute();
//			System.out.println("Counter: "+cs.getInt(1));

//			
			CallableStatement cs = con.prepareCall("{call incSalary(?, ?, ?, ?)}");

			cs.setInt(1, 103);

			cs.setDouble(2, 20);

			cs.registerOutParameter(3, Types.INTEGER); // Old Salary

			cs.registerOutParameter(4, Types.INTEGER); // New Salary

			cs.execute();

			System.out.println("Old Salary: " + cs.getInt(3));

			System.out.println("New Salary: " + cs.getInt(4));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			con.close();
		}
	}

}
