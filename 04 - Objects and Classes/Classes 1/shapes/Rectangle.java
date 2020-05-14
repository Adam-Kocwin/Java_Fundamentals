package shapes;

public class Rectangle // class is a blueprint; a definition on how to create an object
{
	private double length;// hiding our fields so it can't be manipulated
	private double width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle (double len, double w)
	{
		length = len;
		width = w;
	}
	
	public void setLength (double len)
	{
		length = len;
	}
	
	public void setWidth (double w)
	{
		width =w;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getArea()
	{
		return length*width;
	}

}
