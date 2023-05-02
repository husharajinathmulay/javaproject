package com.bl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bl.repository.DBConnection;


@WebServlet("/PasswordChangeServlet")
public class PasswordChangeServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{     Statement st=null;
	      ResultSet rs=null;
	      PreparedStatement pst=null;
	       DBConnection db=new DBConnection();                         // get connection object
	          Connection con =db.getConnection();
	          String email= request.getParameter("email");	          //get data from user
	           String pass= request.getParameter("pass");
	          try 
	          {
	        	     st =con.createStatement();
	                 rs= st.executeQuery("select * from  Registration where email_ID='"+email+"'");
	        	if(rs.next())
	        	{
	        		pst=con.prepareStatement("update Registration set user_password=? where email_ID=?");
	                pst.setString(1,pass);
	                pst.setString(2,email);
	                pst.execute();	 
	               
	                PrintWriter out = response.getWriter();               //change password 
	    			response.setContentType("text/html");
	    			out.println("<script type=\"text/javascript\">");
	    			out.println("alert('   your password change successfully...');");
	    			out.println("location='ChangePassword.jsp';");
	    			out.println("</script>");
	        	}
	        	else
	        	{   
	        		PrintWriter out = response.getWriter();                //go for registration
	    			response.setContentType("text/html");
	    			out.println("<script type=\"text/javascript\">");
	    			out.println("alert('    you are not register user');");
	    			out.println("location='Registration.jsp';");
	    			out.println("</script>");
	        	}       	  
	          }
	          catch(Exception e)
	          {
	        	  System.out.println(e);                                  //handle exception
	          }
	}

}
