package com.bridgelab.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnection
{
	private String driver = "com.mysql.jdbc.Driver"; 
	private String url="jdbc:mysql://localhost:3306/MyDatabase";
	private String userName="root";
	private String password="root";
	
	public void selectAllRows() throws SQLException, ClassNotFoundException
	{
		  Class.forName(driver);
		  
		  Connection con=DriverManager.getConnection(url,userName,password);
		  
		  Statement stmt=con.createStatement();
		  
		  ResultSet rs=stmt.executeQuery("select * from Registration");
		while(rs.next())
		{
			System.out.println(""+rs.getInt(1));
			System.out.println(""+rs.getString(2));
			System.out.println(""+rs.getString(3));
			System.out.println(""+rs.getString(4));
					
		}
		  
	}
	public void deleteRow() throws SQLException, ClassNotFoundException
	{
		  Class.forName(driver);
		  Scanner sc =new Scanner(System.in);
		 
				  Connection con=DriverManager.getConnection(url,userName,password);
		  
		  Statement stmt=con.createStatement();
          System.out.println("Enter id");
         int id= sc.nextInt(); 
		 int a=stmt.executeUpdate("delete from Registration where id="+id);
		 System.out.println("row is deleted "+a);
        		
         sc.close();
		  
	}
	
	public void insertRow() throws SQLException, ClassNotFoundException
	{
		  Class.forName(driver);
		  Scanner sc =new Scanner(System.in);
		 
				  Connection con=DriverManager.getConnection(url,userName,password);
		  
				  PreparedStatement st = con.prepareStatement("insert into Registration values(?,?,?,?)");
			System.out.println("Enter User id");
			st.setInt(1, sc.nextInt());
			System.out.println("Enter User userName ");
			st.setString(2, sc.next());
			System.out.println("Enter User email_ID ");
			st.setString(3, sc.next());
			System.out.println("Enter user_password");
			st.setString(4,sc.next());
		    int status = st.executeUpdate();
			System.out.println(status + " record inserted");
			sc.close();
			con.close();
            
		  
	}
	
	
	
	
	
	
 
}











//public static void main(String[] args) throws ClassNotFoundException, SQLException {
//	 String driver = "com.mysql.jdbc.Driver"; 
//	 String url="jdbc:mysql://localhost:3306/MyDatabase";
//	 String userName="root";
//	 String password="root";
//	 
//	  Class.forName(driver);
//	  System.out.println("driver loaded");
//	  Connection con=DriverManager.getConnection(url,userName,password);
//	  
//	  Statement stmt=con.createStatement();
//	  
//	  ResultSet rs=stmt.executeQuery("select * from Registration");
//	while(rs.next())
//	{
//		System.out.println(""+rs.getInt(1));
//		System.out.println(""+rs.getString(2));
//		System.out.println(""+rs.getString(3));
//		System.out.println(""+rs.getString(4));
//				
//	}
//	
//}