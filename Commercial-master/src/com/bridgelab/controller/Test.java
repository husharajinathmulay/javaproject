package com.bridgelab.controller;

import java.util.ArrayList;
import java.util.List;


import com.bridgelab.model.StockReport;
import com.bridgelab.repository.StockAccountConnection;

public class Test 
{
  public static void main(String[] args)
  {List<StockReport> list=new ArrayList<>();
   StockReport report =new StockReport();	
  report.setSellerName("kailas");
  report.setBuyername("BRIDGEIT");
  report.setBuyshares(5);
  list.add(report);
   StockAccountConnection con=new StockAccountConnection();
   con.writeStockReport("StockReport1.json",list);
 }
}
