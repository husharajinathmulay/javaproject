package com.bridgelab.controller;

import java.util.ArrayList;
import java.util.List;

import com.bridgelab.model.StockAccount;
import com.bridgelab.model.StockHolder;
import com.bridgelab.model.StockReport;
import com.bridgelab.repository.StockAccountConnection;
import com.bridgelab.utility.Utility;



public class StockAccountMain {

public static void main(String[] args)
 
{   List<StockHolder> stockholderlist=new ArrayList<StockHolder>();
    List<StockReport> StockReport=new  ArrayList<StockReport>();
  
	int ch;
	
    do
    {  StockAccount account=new StockAccount();
        StockAccountConnection connection= new StockAccountConnection();
       System.out.println("Select Opetion");
       System.out.println("1 : Create User ");
       System.out.println("2 : Buy Share");
       System.out.println("3 : Sell share");
       System.out.println("4 : Print Stock record");
       System.out.println("5 : Print all StocK Holder Details");
       System.out.println("6 : Exit");
       System.out.println("Enter your choice");
        ch=Utility.inputInt();
       switch(ch)
       {
       case 1:stockholderlist= connection.readStockHolders();    	   	 
    	      account.createUser(stockholderlist);    	   
    	      account.setList(stockholderlist);
    	      connection.writeStockHolderFile(stockholderlist);	      
    	   break;
       case  2 : 
    	        
                account.setList(connection.readStockHolders());                  
                account.setStocklist(connection.readStockFile());           //read and set      
                account.setStockrecord(connection.readReportFile("StockReport.json"));      
           													
    	        account.buy();                                          //call buy function
    	        
    	        connection.writeStockHolderFile(account.getList());   //get and write
    	        connection.WriteStockFile(account.getStocklist());
    	        connection.writeStockReport("StockReport.json", account.getStockrecord());
    	        
    	   break;
       case 3:
    	      account.setList(connection.readStockHolders());
    	      System.out.println(1);
    	      account.setStocklist(connection.readStockFile());
    	      System.out.println(2);
    	      System.out.println(connection.readReportFile("StockReport1.json"));
    	      account.setStockrecord1(connection.readReportFile("StockReport1.json"));
    	      System.out.println(3);
    	      account.sell();
    	     connection.writeStockHolderFile(account.getList());
    	     connection.WriteStockFile(account.getStocklist());
    	     connection.writeStockReport("StockReport1.json",account.getStockrecord1());
    	   break;
       case 4:  account.setStocklist(connection.readStockFile());
                account.printrecord();
    	   break;
       case 5:connection.printAllUserDetails();
    	   break;
    	   default :System.out.println("Enter proper choice");
       }
    }while(ch<6&& ch>0);  

}
}
//
//StockAccount account = new StockAccount();
//account.printrecord();
//
//String reportfile = "StockReport.json";

//List<Stock> list1;
//list1 = account.readFile(filename);
//
//String sellername = "Tmc";
//String buyername = "Milind";
//	account.buy(100, sellername);
//List<Stock> stockfilteredlist = list1.stream().filter(e -> e.getStockname().contains(sellername)).collect(Collectors.toList());			
//StockReport stockreport =new StockReport();              
//stockreport.setList(stockfilteredlist);
//stockreport.setList1(buyername);
//account.writeFile(reportfile,stockreport);