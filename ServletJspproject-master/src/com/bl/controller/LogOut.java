package com.bl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOut
 */
@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  HttpSession session= request.getSession(false);
	  session.invalidate();
		response.setContentType("text/html"); 
		
	  PrintWriter pw= response.getWriter();     
	  
	  pw.print("<form action='LogOut.jsp'>");          //after log out go for home page 
	  pw.print("<button>Go to Home</button>");
	  pw.print("</form>");
	  
	}

}
