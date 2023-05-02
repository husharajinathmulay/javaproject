package com.bridgelabz.model;
import com.bridgelabz.repository.JsonCompanyStockConnection;
import com.bridgelabz.service.StockImp;
import com.bridgelabz.util.Utility.LinkedList;

public class CompanyShareManagment implements StockImp
{
	JsonCompanyStockConnection con = new JsonCompanyStockConnection();
	LinkedList stocklist;
	LinkedList list1;
	int  total;
	public LinkedList setListStock(LinkedList list) 
	{
		  stocklist=list;
		  return stocklist;
	}
	
	public LinkedList getListStock()
	{
		return stocklist;
	}

	 
	@Override
	public void totalValue(int nofshare, int shareprice)
	{   
		total=(nofshare*shareprice);

		System.out.println("Total value is"+ total);
	}
	
	public void writeFile(String filename)
	{
	         con.writeFile(filename,stocklist);	
	}
	
	public LinkedList readFile(String filename)
	{
		list1=(LinkedList)con.readFile(filename);
		return list1;
	}
	
	public  int totalPrice()
	{
		return total;
	}

}
