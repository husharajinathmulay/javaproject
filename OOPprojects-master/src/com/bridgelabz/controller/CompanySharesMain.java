package com.bridgelabz.controller;
/*
 *@purpose: To store stock holder shares in json file
 *@author:
 *@Date:
 * */
import com.bridgelabz.model.CompanyShareManagment;
import com.bridgelabz.model.Stock;
import com.bridgelabz.util.Utility.LinkedList;
import com.bridgelabz.util.Utility.Utility;

public class CompanySharesMain 
{
  public static void main(String[] args)
  {
	 LinkedList list=new LinkedList();                      
	 LinkedList list1;
     String stockname;
     int share;
     int  shareprice;
     String filename="stockdata.json";
     CompanyShareManagment managment=new CompanyShareManagment();     //create object
    System.out.println("Enter n number of stock holder data");        
    int n=Utility.inputInt();
    for(int i=0;i<n;i++)
    {	     Stock stock = new Stock();                                    //create Stock object

		System.out.println("Enter the sock name, share and shareprice");
		stockname = Utility.inputString();
		share = Utility.inputInt();
		shareprice = Utility.inputInt();
		
		stock.setStockname(stockname);
		stock.setShare(share);
		stock.setShareprice(shareprice);
		list.insert(stock);												//add stock object in list
    }
    System.out.println(list.toString());
    managment.setListStock(list);	
    managment.writeFile(filename);
    
    list1=(LinkedList)managment.readFile(filename);
    list1.show();
  }
}
