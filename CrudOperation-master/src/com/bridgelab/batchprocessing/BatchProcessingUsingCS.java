package com.bridgelab.batchprocessing;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.bridgelab.repository.DBConnection;


public class BatchProcessingUsingCS {

	public static void main(String[] args) throws SQLException
	{
		BatchProcessingUsingCS batch=new BatchProcessingUsingCS();
		 int a[]= batch.myBatch();
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

	private int [] myBatch() throws SQLException
	{
	   DBConnection connection=new DBConnection();
	   Connection con=connection.getConnection();
	
	   CallableStatement st= con.prepareCall("call insertintoDemo(?,?,?)");
		st.setInt(1, 14);
		st.setString(2, "aaaa");
		st.setString(3, "ddfgg");
		
		st.addBatch();

		st.setInt(1, 15);
		st.setString(2, "bbbb");
		st.setString(3, "jghgghhyh");
		
		st.addBatch();

		   return st.executeBatch();
	   
	}

}
