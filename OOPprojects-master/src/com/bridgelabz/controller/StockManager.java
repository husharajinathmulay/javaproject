package com.bridgelabz.controller;


import com.bridgelabz.model.*;
import com.bridgelabz.util.Utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class StockManager
{
     public static void main(String[] args)
     {
	    List<Stock> list=new ArrayList<Stock>();
	    List<Stock> list1;
	    
	     String stockname;
	     int share;
	     int  shareprice;
	     String filename="stockdata.json";
	    StockManagement stockmanagement= new StockManagement();
	    System.out.println("Enter n number of stock  data");
	    int n=Utility.inputInt();
	    for(int i=0;i<n;i++)
	    {	     Stock stock = new Stock(); 

			System.out.println("Enter the sock name, share and shareprice");
			stockname = Utility.inputString();
			share = Utility.inputInt();
			shareprice = Utility.inputInt();
			
			stock.setStockname(stockname);
			stock.setShare(share);
			stock.setShareprice(shareprice);
			list.add(stock);
	    }
	    stockmanagement.setListStock(list);	    
	    stockmanagement.writeFile(filename); 
	    list1=stockmanagement.readFile(filename);
	    StockManagement managementimp=new StockManagement();
	    for(Stock s:list1)
	    {
	    	System.out.println("Stock Name:	"+s.getStockname());
	    	System.out.println("Stock Share:	"+s.getShare());
	    	System.out.println("Stock price:	"+s.getShareprice());
	    	managementimp.totalValue(s.getShare(),s.getShareprice());
	    }
	    
	    
 	 }
}
