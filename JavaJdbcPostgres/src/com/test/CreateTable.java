package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CreateTable {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
	Connection connection=null;
	Statement statement=null;
	ResultSet rs=null;
	
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

		query="select * from employees";
		query2="update employees set name=? where name='Raja'";
			
		
		PreparedStatement pst =connection.prepareStatement(query);
		
		rs=pst.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getString("name"));
		}
		PreparedStatement pst2 =connection.prepareStatement(query2);
		System.out.println("Enter the name you want to change");
		String a=input.nextLine();
		pst2.setString(1,a);
		System.out.println("New name : ");
		String b=input.nextLine();
		pst2.setString(2, b);
		int i=pst2.executeUpdate(); 
		
		System.out.println(i+"Finished");		
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}

}
}