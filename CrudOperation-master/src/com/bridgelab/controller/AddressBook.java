package com.bridgelab.controller
;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelab.repository.DBConnection;
import com.bridgelab.util.Utility;



public class AddressBook {
	public static void main(String[] args) throws SQLException {
		int choice;
		do {

			System.out.println("Select options=======================");
			System.out.println("1:    Add User");
			System.out.println("2:	  Delete User data");
			System.out.println("3:	  Update ");
			System.out.println("4:	  Print All Users");
			System.out.println("5:	  Quit");
			System.out.println("Enter your choice");
			choice = Utility.inputInt();
			switch (choice) {

			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				update();
				break;
			case 4:
				print();
				break;
			case 5: System.exit(0);
				break;
			default:
				System.out.println("Enter Proper choice");
				choice = Utility.inputInt();
			}
		} while (choice <= 5 && choice > 0);
	}

	private static void print() throws SQLException 
	{
		DBConnection db = new DBConnection();
		Connection connection = db.getConnection();
		Statement st = connection.createStatement();
		String query = "select * from AddressBook";
		String query1 = "insert into AddressBook values('vishnu','shelke','mh','latur','latur',123432,32)";
//		ResultSet rs = st.executeQuery(query);
		for (int i = 0; i < st.executeBatch().length; i++)
		{
			System.out.println(st.executeBatch()[i]);
		}
//		System.out.println(st.executeBatch());;
		st.addBatch(query);
		st.addBatch(query1);
//		while (rs.next()) {
//			System.out.println("User Id		 : " + rs.getInt(7));
//			System.out.println("Name 		 : " + rs.getString(1));
//			System.out.println("Last Name 	 : " + rs.getString(2));
//			System.out.println("State 		 :" + rs.getString(3));
//			System.out.println("City  		 :" + rs.getString(4));
//			System.out.println("Address 	 :" + rs.getString(5));
//			System.out.println("Zipcode		 :" + rs.getString(6));
//			System.out.println(
//					"-----------------------------------------------------------------------------------------------------");
//
//		}

	}

	private static void update() throws SQLException 
	{
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		PreparedStatement st;
		int choice;
		int userid;
		do
		{
			System.out.println("Select option======================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("1: 	Last Name");
			System.out.println("2: 	State");
			System.out.println("3: 	City");
			System.out.println("4: 	Address");
			System.out.println("5: 	Zipcode");
			System.out.println("6: 	Exit");
			System.out.println("Enter your choice");
			choice = Utility.inputInt();
			
			switch (choice)
			{
			
			case 1:
				st = con.prepareStatement("update AddressBook set lastname=? where userid=? ");
				System.out.println("Enter Last Name");
				st.setString(1, Utility.inputString());
				System.out.println("Enter User Id  :");
				userid = Utility.inputInt();
				st.setInt(2, userid);
				st.execute();
				break;
			case 2:
				st = con.prepareStatement("update AddressBook set state=? where userid=? ");
				System.out.println("Enter  State Name");
				st.setString(1, Utility.inputString());
				System.out.println("Enter User Id  :");
				userid = Utility.inputInt();
				st.setInt(2, userid);
				st.execute();
				break;
			case 3:
				st = con.prepareStatement("update AddressBook set city=? where userid=? ");
				System.out.println("Enter City Name");
				st.setString(1, Utility.inputString());
				System.out.println("Enter User Id  :");
				userid = Utility.inputInt();
				st.setInt(2, userid);
				st.execute();
				break;
			case 4:
				st = con.prepareStatement("update AddressBook set address=? where userid=? ");
				System.out.println("Enter Address ");
				st.setString(1, Utility.inputString());
				System.out.println("Enter User Id  :");
				userid = Utility.inputInt();
				st.setInt(2, userid);
				st.execute();
				break;
			case 5:
				st = con.prepareStatement("update AddressBook set zipcode=? where userid=? ");
				System.out.println("Enter Zipcode");
				st.setInt(1, Utility.inputInt());
				System.out.println("Enter User Id  :");
				userid = Utility.inputInt();
				st.setInt(2, userid);
				st.execute();
				break;
			case 6:
				break;
			default:
				System.out.println("Enter Proper Choice");
			}

		} while (choice > 0 && choice < 6);
	}

	private static void delete() throws SQLException {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		System.out.println("Enter user id");
		CallableStatement stm = con.prepareCall("call deletePersonInfo(" + Utility.inputInt() + ")");
		boolean status = stm.execute();
		if (status)
		{
			System.out.println("user deleted");
		} else {
			System.out.println();
		}
	}

	private static void insert() throws SQLException {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		PreparedStatement st = con.prepareStatement("insert into AddressBook values(?,?,?,?,?,?,?)");
		System.out.println("Enter User id");
		st.setInt(7, Utility.inputInt());
		System.out.println("Enter User Name");
		st.setString(1, Utility.inputString());
		System.out.println("Enter User Last Name");
		st.setString(2, Utility.inputString());
		System.out.println("Enter State");
		st.setString(3, Utility.inputString());
		System.out.println("Enter User City");
		st.setString(4, Utility.inputString());
		System.out.println("Enter User Address");
		st.setString(5, Utility.inputString());
		System.out.println("Enter User Zipcode");
		st.setString(6, Utility.inputString());
		int status = st.executeUpdate();
		System.out.println(status + " record inserted");
	
		con.close();

	}

}
