package com.bridgelab.batchprocessing;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.bridgelab.repository.DBConnection;

public class BatchProcess 
{
	public static void main(String[] args) throws SQLException
	{
		BatchProcess b= new BatchProcess();
		int[] result = b.executeAllQuery();
		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}

	public int[] executeAllQuery() throws SQLException
	{
		Statement st;
		DBConnection con = new DBConnection();
		String query = "insert into AddressBook values('vishnu','shelke','mh','latur','latur',123432,32)";
		
		String queryDelete = "delete from AddressBook where userid=2";
		
		String queryUpdate = "update AddressBook set name='priyanka' where userid=1";
			
		Connection	connection = con.getConnection();
		//connection.setAutoCommit(false);
		
		st = connection.createStatement();
		st.addBatch(query);
		st.addBatch(queryDelete);
		st.addBatch(queryUpdate);
		//connection.commit();
		return st.executeBatch();
	}


}
