package lessons;
import java.util.Scanner;
import shapes.Rectangle;

public class RoomAreas
{

	public static void main(String[] args)
	{
		double num;
		double totalArea;
		Scanner k = new Scanner (System.in);
		
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		
		//Get dimensions of kitchen
		System.out.print("What is the kitchens length? ");
		num = k.nextDouble();
		kitchen.setLength(num);
		System.out.print("What is the kitchens width? ");
		num = k.nextDouble();
		kitchen.setWidth(num);
		
		// Get dimensions of bedroom
		System.out.print("What is the bedrooms length? ");
		num = k.nextDouble();
		bedroom.setLength(num);
		System.out.print("What is the bedrooms width? ");
		num = k.nextDouble();
		bedroom.setWidth(num);
		
		//Get dimensions of den
		System.out.print("What is the dens length? ");
		num = k.nextDouble();
		den.setLength(num);
		System.out.print("What is the dens width? ");
		num = k.nextDouble();
		den.setWidth(num);
		
		//Calculate the total area of the room
		totalArea = kitchen.getArea() + den.getArea() + bedroom.getArea();
		System.out.println("The total area of the rooms is " + totalArea);
		
		
	}

}
