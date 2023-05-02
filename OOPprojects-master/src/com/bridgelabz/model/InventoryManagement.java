package com.bridgelabz.model;

import java.util.List;

import com.bridgelabz.repository.JsonConnection;
import com.bridgelabz.service.InventoryInmp;

public class InventoryManagement implements InventoryInmp
{

	List<Inventory> listInventories;

	JsonConnection con = new JsonConnection();
	public List<Inventory> getListInventories() 
    {
		return listInventories;
	}

	public void setListInventories(List<Inventory> listInventories)
	{
		this.listInventories = listInventories;
	}
	
	public void writeFile(String filename)
	{
		con.writeFile(filename, listInventories);
	}
	
	public List<Inventory> readFile(String filename)
	{
		listInventories = con.readFile(filename);
		return listInventories;
	}

	@Override
	public void totalPrice(double price, double weight) 
	{
		// TODO Auto-generated method stub
		System.out.println("Total Price is :"+(price*weight));
	}
}
