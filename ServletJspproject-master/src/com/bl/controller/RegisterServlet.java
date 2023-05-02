package com.bl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bl.repository.DBConnection;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet 
{		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=null,email=null,password=null;
	    name=request.getParameter("username");   
	    email=request.getParameter("emailid");                    //get data from user
	    password=request.getParameter("upass");
	    System.out.println("username"+name);                     // get DB connection 
	      DBConnection db=new DBConnection();
	      Connection connection=db.getConnection();
	      try 
	      {
	      PreparedStatement st= connection.prepareStatement("insert into Registration values('0',?,?,?)");
	      st.setString(1, name); 
	      st.setString(2, email);                            
	      st.setString(3, password);
	      st.execute();                                       //insert record  
	      response.sendRedirect("Login.jsp");                 //go for login
	        
	      
	      }
	      catch(Exception e)
	      {
	    	  
	    	  System.out.println(e);							//handle exception
	      }
	      
	      
	    		  
	}
}
