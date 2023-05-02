package com.bl.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection 
{
	
 public  Connection  getConnection()
 {
	 Connection connection=null;
	 System.out.println("in connection");
	
	 try 
	 {
	 Class.forName("com.mysql.jdbc.Driver");
	 System.out.println("Driver loaded");
	 connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase","root","root");
	 System.out.println("connected");
	 }
	 catch(Exception e)
	 {
		 System.out.println("connecton is not  established"+e);
	 }
	 return connection;
 }	
}
