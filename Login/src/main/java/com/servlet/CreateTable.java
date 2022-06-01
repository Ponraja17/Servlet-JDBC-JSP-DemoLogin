package com.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import jakarta.servlet.RequestDispatcher;

public class CreateTable {
	public static  int Processing(Bean B) {
		
	Connection connection=null;
	Statement statement=null;
	ResultSet rs=null;
	int result = 0;
	
	ConnectDB objConnectDB=new ConnectDB();
	connection = objConnectDB.getConnection();
	
	
	
	
	try {
		String query,query2;
		//statement=connection.createStatement();
		
//		// create,insert,update,delete
//		query ="create table employees(id SERIAL PRIMARY KEY,name varchar(20));";
//		query= "insert into employees(name) values ('roja');";
//		query="update employees set name='king' where name='raja'";
//	    query ="delete from employees where name='roja'";
//		 statement.executeUpdate(query);
		 
		 
        // For fetch data
		
//		while(rs.next()) {
//		System.out.println(rs.getString("name"));
//	}
//	System.out.println("Finished");

		//query="select * from employees";
		query2="select * from users where name=? and password=?";
			
		
		//PreparedStatement pst =connection.prepareStatement(query);
		PreparedStatement pst2 =connection.prepareStatement(query2);
		

		
		pst2.setString(1,B.getN());
	     
	
       	
    	pst2.setString(2,B.getP());
		
	
    	rs=pst2.executeQuery();
		if(rs.next()) {
			
System.out.println(rs.getString("name"));
 result=1;
		}
		else {
			result=0;
		}
	
		
		System.out.println("Finished");		
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	return result;

}
}
