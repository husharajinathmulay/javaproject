package com.bl.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bl.repository.DBConnection;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{  System.out.println("main");
			DBConnection db = new DBConnection();
			Connection con = db.getConnection();
			Statement st;
			ResultSet rs;
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			String name=request.getParameter("name");
			st = con.createStatement();
	
			rs = st.executeQuery("select * from  Registration where email_ID='"+email +"'"); // fetch data from registration table
			if (rs.next())
			{
				
				String password = rs.getString("user_password");     //get password from result set
				if (password.equals(pass)) 
				{				 
					  HttpSession session =request.getSession();
					  session.setAttribute("user",name);
					  response.sendRedirect("Welcome.jsp");           //if password match go for welcome page
				}
				else
				{  
				
					  PrintWriter out = response.getWriter();
						response.setContentType("text/html");
						out.println("<script type=\"text/javascript\">");
						out.println("alert('  login fail..');");            //if password not match go for login
						out.println("location='Login.jsp';");
						out.println("</script>");
				
			    
					
				}
			}
			else
			{ 		
				
				
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");        // if you are not registered go for Registration
				out.println("alert('  Go for registration');");
				out.println("location='Registration.jsp';");
				out.println("</script>");
		
	
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
