package com.bridgelabz.model;
import java.util.List;
import com.bridgelabz.repository.JsonStockConnection;
import com.bridgelabz.service.StockImp;

public class StockManagement implements StockImp
{
	JsonStockConnection con = new JsonStockConnection();
	List<Stock> stocklist;

	double total;
	public void setListStock(List<Stock> list)
	{
		  stocklist=list;
	}
	
	public List<Stock> getListStock()
	{
		return stocklist;
	}

	 
	@Override
	public void totalValue(int nofshare, int shareprice)
	{   
		total=(nofshare*shareprice);
		// TODO Auto-generated method stub	
		System.out.println("Total value is"+total);
	}
	
	public void writeFile(String filename)
	{
	         con.writeFile(filename,stocklist);	
	}
	
	public List<Stock> readFile(String filename)
	{
		      
		return con.readFile(filename);
		 
	}
	
	public  double totalPrice()
	{
		return total;
	}
}
