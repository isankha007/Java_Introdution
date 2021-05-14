package com.sankha.learning;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseOracleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			  con.setAutoCommit(false);
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("INSERT INTO SANKHA.EMPLOYEE (EMPID, NAME, ADDRESS) VALUES ('104', 'Farhan', 'Bangalore')");
			con.commit();  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from sankha.Employee");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  
			//step5 close the connection object  
			con.close();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
