package com.bridgelab.model;



import java.util.ArrayList;
import java.util.List;

import com.bridgelab.service.StockAccountImp;
import com.bridgelab.utility.Utility;

public class StockAccount implements StockAccountImp {
	List<StockHolder> list;
	List<Stock> stocklist;
	List<StockReport> stockrecord;                                  //for store buyer user data
	List<StockReport> stockrecord1;							       // for store buyer company data

	public List<StockReport> getStockrecord1() {
		return stockrecord1;
	}

	public void setStockrecord1(List<StockReport> stockrecord1) {
		this.stockrecord1 = stockrecord1;
	}

	public List<StockHolder> getList() {
		return list;
	}

	public void setList(List<StockHolder> list) {
		this.list = list;
	}

	public List<Stock> getStocklist() {
		return stocklist;
	}

	public void setStocklist(List<Stock> stocklist) {
		this.stocklist = stocklist;
	}

	public List<StockReport> getStockrecord() {
		return stockrecord;
	}

	public void setStockrecord(List<StockReport> stockrecord) {
		this.stockrecord = stockrecord;
	}

	@Override
	public void buy() {
		System.out.println("Enter User Name");
		String name = Utility.inputString();
		String symbol = null;
		int amount;
		int newamount;

		list = getList();
		int j = 0, flag = 0, flag1 = 0,flag2=0;
		int share;
		int shareprice, nofshares;
		for (StockHolder holder : list) // search in holder list
		{
			if (name.compareToIgnoreCase(holder.getName()) == 0) {
				flag = 1;
				List<String> companylist = holder.getCompanylist(); // get list of company name
				List<Integer> sharslist = holder.getSharslist(); // get list of user shares

				System.out.println("Enter Company Name");
				symbol = Utility.inputString();
				for (int i = 0; i < stocklist.size(); i++) // search in stock
				{
					if (symbol.compareToIgnoreCase(stocklist.get(i).getStockname()) == 0) // check company name
					{
						flag1 = 1;

						System.out.println("Enter amount");
						amount = Utility.inputInt();
						share = stocklist.get(i).getShare();

						shareprice = stocklist.get(i).getShareprice();

						nofshares = (amount / shareprice);

						newamount = nofshares * shareprice;

						if (holder.getBalance() > newamount) // compare new amount with user balance
						{
							if (share >= nofshares) {
								holder.setBalance(holder.getBalance() - newamount); // deduct balance user
                                for(int l=0;l<companylist.size();l++)
                                {    if(companylist.contains(symbol))
                                        {   int s=sharslist.get(l);
                                        	sharslist.set(l,s+nofshares);
                                	           flag2=1;
                                        }
                                 }
                                if(flag2==0)
                                {       
								  companylist.add(symbol);
								  sharslist.add(nofshares);	  													// add company to user list
                                }
								  holder.setCompanylist(companylist);

								
								holder.setSharslist(sharslist);
								list.set(j, holder); // set user

								StockReport report = new StockReport();
								report.setBuyername(name);
								report.setSellerName(symbol);
								report.setBuyshares(nofshares);
								// update stock record
								stockrecord.add(report);
								stocklist.get(i).setShare(share - nofshares);

							} else {
								System.out.println(" insufficient shares");
							}
						} else {
							System.out.println("your balance is not sufficient");
						}
					}

				}
				if (flag1 == 0) {
					System.out.println("Invalid Company Name");
				}

			}
			j++;

		}
		if (flag == 0) {
			System.out.println("User name invalid");
		}

	}
		
	
	@Override
	public void sell() 
	{  int flag = 0, flag1 = 0,flag2=0;
	  int amount,newamount,shareprice,nofshares;
		System.out.println("Enter Seller name");
		String sellerName=Utility.inputString();
		for(int i=0;i<list.size();i++)
		{
		          
			if(sellerName.compareToIgnoreCase(list.get(i).getName())==0)
			{ 	flag=1;  
				List<String> companylist = list.get(i).getCompanylist(); // get list of company name
				List<Integer> sharslist =list.get(i).getSharslist(); // get list of user shares
                 System.out.println("Enter buyer Name");
                 String companyName=Utility.inputString();
                 boolean status=companylist.contains(companyName);
                    if(status==true)
                    {
                    	for(int j=0;j<companylist.size();j++)
                    	{    
                    		if(companyName.equals(companylist.get(j)))
                    		{
                    			flag1=1;
                    			
                    			System.out.println("Enter amount");
                    			amount=Utility.inputInt();                   		    
                    		      for(int k=0;k<stocklist.size();k++)
                    		      {
                    		    	  if(companyName.equals(stocklist.get(k).getStockname()))
                    		    	  {
                    		    		  shareprice=stocklist.get(k).getShareprice();
                    		    		  nofshares=(amount/shareprice);                    		    		  
                    		    		  newamount=(nofshares*shareprice);
                    		    		  
                    		    		  if(sharslist.get(j)>=nofshares)
                    		    		  {  flag2=1;
                    		    			  sharslist.set(j,sharslist.get(j)-nofshares);					//update share
                    		    			  list.get(i).setBalance(list.get(i).getBalance()+newamount);   //update seller balance              		    			  
                    		    			  stocklist.get(k).setBalance(stocklist.get(k).getBalance()-newamount); //update stock balance                  		    	
                    		    		  }                    		    		                     		    		  
                    		    	  }
                    		      }
                    		      if(flag2==0)
                    		      {
                    		    	  System.out.println("Seller shares are less");
                    		      }
                    		}
                    		
                    	}
                    	if(	flag1==0)
                		{
                			
                		}
                    }
                    else
                    {
                    	System.out.println("Company not found");
                    }
                  
				
			}
		}
		if(flag==0)
		{
			System.out.println("seller name is incorrect");
		}
				
	}

	public void printrecord() 
	{
 
		
		for (Stock stock : stocklist) 
		{
			System.out.println("Stock Name:	" + stock.getStockname());
			System.out.println("Stock Share:	" + stock.getShare());
			System.out.println("Stock price:	" + stock.getShareprice());
			System.out.println("--------------------------------------------------------------------");

		}				
	}
	

	public void createUser(List<StockHolder> list)
	{		
		StockHolder stockholder=new StockHolder();
		
	    System.out.println("Enter StockHoder Name :");	
       	stockholder.setName(Utility.inputString());   
	    System.out.println("Enter StockHoder Balance :");	
       	stockholder.setBalance(Utility.inputFloat());
       	List<Integer> listInt = new ArrayList<Integer>();
       	List<String> listString = new ArrayList<String>();
       
       	stockholder.setCompanylist(listString);
       	stockholder.setSharslist(listInt);
		list.add(stockholder);
		
	}
	@Override
	public String valueOf(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

}



