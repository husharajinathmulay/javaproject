package com.bridgelab.repository;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelab.model.Stock;
import com.bridgelab.model.StockHolder;
import com.bridgelab.model.StockReport;


public class StockAccountConnection 
{
	   public  void writeStockHolderFile(List<StockHolder> list)
	   {
			// TODO Auto-generated method stub
			 try 
			 	{
				 ObjectMapper mapper=new ObjectMapper();
			 	
				 mapper.writeValue(new FileOutputStream("StockHolders.json"),list);
			 	}
			    catch(Exception e)
			    { 
			    	System.out.println("File not found");
			    }
			}

		public  List<StockHolder> readStockHolders()
		{  List<StockHolder> list=null;
	 		try
			{
			ObjectMapper mapper=new ObjectMapper();
		 	list=mapper.readValue(new FileInputStream("StockHolders.json"), new TypeReference<List<StockHolder>>() {});
		
			}
		catch(Exception e)
		 {
			System.out.println("File not  found");
		 }
			return list;
		}
		public List<Stock> readStockFile()
		{ String filename="stockdata.json";
			List<Stock> list=null;
		   
		   
		    	try
		    	{
		    		ObjectMapper mapper = new ObjectMapper();
		    		list = mapper.readValue(new File(filename), new TypeReference<List<Stock>>() {
					});
		    	} catch (Exception e) 
		    	{
		    		System.out.println("File not found");
		    	}
		        return list;
		}	
		
		public void writeStockReport(String filename,List<StockReport> stockreport)
		{
			 ObjectMapper mapper=new ObjectMapper();
			 try
			 {
				 mapper.writeValue(new FileOutputStream(filename),stockreport);
			 }
			 catch(Exception e)
			  {
				 System.out.println("File not created");
			  }
		}
		
		public void printAllUserDetails()
		{
			List<StockHolder> stockHoldersList = readStockHolders();
			
			for(StockHolder holder: stockHoldersList)
			{
				System.out.println("Name : "+holder.getName());
				System.out.println("Balence : "+holder.getBalance());
				for(int i=0;i<holder.getCompanylist().size();i++)
				{
					System.out.println("Company Name :"+holder.getCompanylist().get(i));
					System.out.println("Share "+holder.getSharslist().get(i));
					System.out.println("--------------------------------------------------------------------");
				}
			}
			
		}
		

		public List<StockReport> readReportFile(String filename)

		{
			List<StockReport> list=null;
			 ObjectMapper mapper=new ObjectMapper();
			 try
			 {
			  
			 	list= mapper.readValue(new FileInputStream(filename),new TypeReference<List<StockReport>>(){});
			 }
			 catch(Exception e)
			 {
				 System.out.println("file not found");
			 }
			 	
		 return list;
		}
	public void WriteStockFile(List<Stock> list)
	{
		ObjectMapper mapper =new ObjectMapper();
		try
		{
		mapper.writeValue(new FileOutputStream("stockdata.json"),list);
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	}
}
