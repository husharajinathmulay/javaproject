package builder;

public class Phone 
{
	private String os;
	private int ram;
	private String processor;
	private String  battery;

	@Override
	public String toString()
	{
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", batter=" + battery + "]";
	}

	public Phone(String os, int ram, String processor, String batter)
	{
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = batter;
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              