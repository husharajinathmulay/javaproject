package Prototype;



public class BookShopMain
{
   public static void main(String[] args) throws CloneNotSupportedException 
   {
	  BookShop bookShop= new BookShop();
	  bookShop.load();
	  
	  	 
	 
	  BookShop clone =(BookShop)bookShop.clone();
	  bookShop.getList().remove(1);
	  System.out.println(bookShop);
	  System.out.println(clone);
	
   }
}