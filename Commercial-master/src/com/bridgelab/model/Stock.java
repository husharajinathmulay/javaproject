package com.bridgelab.model;

public class Stock
{
	private String stockname;
	private  int share;
	private int shareprice;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getStockname()
	{
		return stockname;
	}

	public void setStockname(String stockname) 
	{
		this.stockname = stockname;
	}

	public int  getShare() 
	{
		return share;
	}

	public void setShare(int share2)
	{
		this.share = share2;
	}

	public int getShareprice()
	{
		return shareprice;
	}

	public void setShareprice(int shareprice2) 
	{
		this.shareprice = shareprice2;
	}

}
