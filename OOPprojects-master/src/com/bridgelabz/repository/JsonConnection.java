package com.bridgelabz.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.model.Inventory;

public class JsonConnection 
{

	public void writeFile(String filename, List<Inventory> inventories)
	{
		
		try {
			ObjectMapper mapper = new ObjectMapper();

			mapper.writeValue(new FileOutputStream(filename), inventories);
			
		}
		catch (Exception e) 
		{
			System.out.println("File Not Found");
		}
	}

	public List<Inventory> readFile(String filename)
	{
		List<Inventory> list = null;
			try 
			{
				ObjectMapper mapper = new ObjectMapper();
				list = mapper.readValue(new FileInputStream(filename), new TypeReference<List<Inventory>>() {
				});
			} catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println("File Not Found");
			}
		
		return list;
	}
}
