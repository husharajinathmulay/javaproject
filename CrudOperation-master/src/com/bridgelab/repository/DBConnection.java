package com.bridgelab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	Connection connection;

	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDatabase", "root", "root");
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("connection not established");
		}

		return connection;
	}
}
