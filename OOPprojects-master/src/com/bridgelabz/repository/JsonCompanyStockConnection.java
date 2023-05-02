package com.bridgelabz.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.util.Utility.LinkedList;

public class JsonCompanyStockConnection
{  

 
	public LinkedList readFile(String filename)
	{
		LinkedList list=null;
	    File file=new File(filename);
	    if(file.exists())
	    {
	    	try
	    	{
	    		ObjectMapper mapper = new ObjectMapper();
	    		list = mapper.readValue(new FileInputStream(filename), new TypeReference<LinkedList>() {
				});
	    	} catch (Exception e) 
	    	{
	    		System.out.println("File not found");
	    	}
	    }
	    return list;
	}
	
	public void writeFile(String filename,LinkedList stock)
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
