package com.bridgeit.fellowship.datastructure;
import com.bridgeit.fellowship.utility.Utility;

public class UnorderdList 
{
public static void main(String[] args) throws Exception
{
        LinkedList list=new LinkedList();		
		
		String words[] = Utility.readFile("Hello.txt");
      
        int len=words.length;
        for(int i=0;i<len;i++)
        {
        	list.insert(words[i]);
        }
        list.show();
        System.out.println("Enter the search String");
        String search=Utility.inputString();
          
        boolean found=list.search(search);
        if(found)
        {
        	list.delete(search);
        System.out.println("found  ");
        }else
        	System.out.println("Not found");
        list.show();
        Utility.writeToFile("Hello.txt", list);
        //Closing Scanner
        
        
        Utility.closeScanner();
        
	}
}
