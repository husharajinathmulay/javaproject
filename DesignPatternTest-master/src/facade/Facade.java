package facade;

public class Facade 
{
	private Square squre;
	private Circle circle;
	
	public Facade() 
	{
		this.squre = new Square();
		this.circle = new Circle();
	}
	
	public void drawSquare()
	{
		squre.draw();
	}
	public void drawCircle()
	{
		circle.draw();
	}
	

}
