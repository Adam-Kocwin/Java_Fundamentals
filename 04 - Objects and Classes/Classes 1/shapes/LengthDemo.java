package shapes;

public class LengthDemo
{

	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(10,20);
		Rectangle box2 = new Rectangle(5,25);
		
		System.out.println("Sending value 10 to the setLength method and the value 20 to the setWidth method.");
		
//		box.setLength(10.0);
//		box.setWidth(20.0);
		
		System.out.println("Done");
		System.out.println("The box's length is " +box.getLength());
		System.out.println("The box's width is " + box.getWidth());
		
		System.out.println("The box's area is " + box.getArea());
	}

}
