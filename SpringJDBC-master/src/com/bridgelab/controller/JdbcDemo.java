package com.bridgelab.controller;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo 
{
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
   ApplicationContext context	=new ClassPathXmlApplicationContext("beans.xml");
   JdbcConnection con=  context.getBean("connection",JdbcConnection.class);
//   con.selectAllRows();
//   con.deleteRow();
   con.insertRow();
}
}
