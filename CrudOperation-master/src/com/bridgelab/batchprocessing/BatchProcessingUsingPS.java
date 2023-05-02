package com.bridgelab.batchprocessing;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bridgelab.repository.DBConnection;

public class BatchProcessingUsingPS 
{
   public static void main(String[] args) throws SQLException
   {
	 BatchProcessingUsingPS batch=new BatchProcessingUsingPS();
	 
	    int a[] = batch.executeBatch();
	    for(int i=0;i<a.length;i++)
	    {
	    	 System.out.println(a[i]);
	    }	   
   }

	private int[] executeBatch() throws SQLException {

		DBConnection db = new DBConnection();

		Connection con = db.getConnection();
		String name = "mukesh";
		String lastname = "rathod";
		String state = "maharastra";
		PreparedStatement stmnt = con.prepareStatement("insert into AddressBook(name,lastname,state) values(?,?,?)");
		stmnt.setString(1, name);
		stmnt.setString(2, lastname);
		stmnt.setString(3, state);
		stmnt.addBatch();

		stmnt.setString(1, "rajat");
		stmnt.setString(2, "pande");
		stmnt.setString(3, "maharastra");

		stmnt.addBatch();

		return stmnt.executeBatch();

	}
}
