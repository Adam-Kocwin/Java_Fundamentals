package activities;
import java.util.Scanner;

public class CellPhoneTest
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		
		System.out.print("Enter the manufacturer: ");
		String man = k.nextLine();
		
		System.out.print("Enter the model number: ");
		String modelNum = k.nextLine();
		
		System.out.print("Enter the retail price: $");
		double price = k.nextDouble();
		
		CellPhone cell = new CellPhone(man,modelNum,price);
		infoDisplay(cell);

	}
	
	public static void infoDisplay (CellPhone cell)
	{
		System.out.println();
		System.out.println("Here is the data that you provided:");
		System.out.println("Manufacturer: " + cell.getManufact());
		System.out.println("Model Number: " + cell.getModel());
		System.out.println("Retail Price: $" + cell.getRetailPrice());
		
	}

}
