package com.bridgelabz.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.model.Stock;


public class JsonStockConnection
{  

 
	public List<Stock> readFile(String filename)
	{
		List<Stock> list=null;
	    File file=new File(filename);
	    if(file.exists())
	    {
	    	try
	    	{
	    		ObjectMapper mapper = new ObjectMapper();
	    		list = mapper.readValue(new FileInputStream(filename), new TypeReference<List<Stock>>() {
				});
	    	} catch (Exception e) 
	    	{
	    		System.out.println("File not found");
	    	}
	    }
	    return list;
	}
	
	public void writeFile(String filename,List<Stock> stock)
	{
		ObjectMapper mapper=new ObjectMapper();
		try
		{
		mapper.writeValue(new FileOutputStream(filename),stock);
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
	}
	
	
	
}
