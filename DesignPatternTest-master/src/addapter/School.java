package addapter;

public class School
{
  public static void main(String[] args)
  {   AddapterPen pen=new AddapterPen();
	  Assignment work =new Assignment();
	  work.setP(pen);
      work.writeAssigment("I am bit tired");
  }
}
