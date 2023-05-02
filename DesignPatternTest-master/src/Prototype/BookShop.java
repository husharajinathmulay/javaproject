package Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
   private String shopName;
   List<Book> list =new ArrayList<>();
   
	@Override
public String toString() {
	return "BookShop [shopName=" + shopName + ", list=" + list + "]";
}

	public String getShopName() 
	{
		return shopName;
	}

	public void setShopName(String shopName) 
	{
		this.shopName = shopName;
	}

	public List<Book> getList() 
	{
		return list;
	}

	public void setList(List<Book> list) 
	{
		this.list = list;
	}  
	
    public void load()
    {  
    	for(int i=1;i<5;i++)
    	{ Book book=new Book();
    		book.setBookId(i);
    		book.setBookName("Book "+i);
    		list.add(book);
    	}
    }

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		 BookShop bookShop=new BookShop();
		 for(Book book:this.getList())
		 { 
			 bookShop.getList().add(book);
			 
		 }
		return bookShop;
	}
	
    
  
}
