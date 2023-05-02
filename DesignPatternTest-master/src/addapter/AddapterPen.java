package addapter;

public class AddapterPen implements Pen
{
    SelloPen pen =new SelloPen();
	@Override
	public void write(String str) 
	{
	   pen.mark(str);			
	}

}