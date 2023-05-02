package com.bridgelabz.controller;
import java.util.ArrayList;


import java.util.List;


import com.bridgelabz.model.Inventory;
import com.bridgelabz.model.InventoryManagement;
import com.bridgelabz.service.InventoryInmp;
import com.bridgelabz.util.Utility.Utility;
/*
 *@purpose: To manage inventory details
 *@author:
 *@Date:
 * */
public class InventoryManager 
{

	public static void main(String[] args)
	{
		InventoryManagement inventoryManagement=new InventoryManagement();
		
		String filename = "InventoryData.json";
		String item;
		double weight=0;
		double price=0;
		boolean status;
		List<Inventory> list =  new ArrayList<Inventory>();        		//create list for Inentory object
		
		
		System.out.println("Enter n number of items");
		int n=Utility.inputInt();
		for(int i=0;i<n;i++)
		{
			Inventory inventory = new Inventory();                    	// create inventory object
			System.out.println("Enter item name,weight and price ");
			item = Utility.inputString();
			status = Utility.nameValidation(item);                    	//check validation
			if (status == false) 
			{
				System.out.println("Enter item name as String");       
				item = Utility.inputString();
				i = i - 1;
			}
			try 
			{
				weight = Utility.inputDouble();
				price = Utility.inputDouble();
			} catch (Exception e)
			{
				System.out.println("Do not enter any string , characher or any symbol");
				i = i - 1;
			}
		inventory.setNameOfInventory(item);                            	//add details in inventory object														
		inventory.setWeight(weight);
		inventory.setPrice(price);
		list.add(inventory);											//set inventory object in list
		}
		inventoryManagement.setListInventories(list);
		inventoryManagement.writeFile(filename);
		
		list = inventoryManagement.readFile(filename);
		InventoryInmp imp = new InventoryManagement();
		
		
		for(Inventory inventory2 : list)								//print list of inventory objects and it's detail
		{
			System.out.println(inventory2.getNameOfInventory());
			System.out.println(inventory2.getPrice());
			System.out.println(inventory2.getWeight());
			imp.totalPrice(inventory2.getPrice(), inventory2.getWeight());
		}
		
		
		
	}
}
