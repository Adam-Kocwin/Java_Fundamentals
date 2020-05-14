package activities;
import java.util.Scanner;


public class JavaReviewActivity1 {

	public static void main(String[] args) 
	{
		//1. Declare a variable suitable for holding the number of bottles in a case.
		int bottles;
		
		//2. What is wrong with the following variable declaration?
		    // int ounces per litres = 28.35
		double ouncesPerLitres = 28.35;
		// not a double data type and can't name it with spaces in between
		
		//3. Declare and initialize two variables, unitPrice and quantity, to contain the unit
		//   price of a single bottle and the number of bottles purchased. Use reasonable initial values.
		
		double unitPrice = 1;
		int quantity = 12;
		
		//4. Use the variables declared in question 3 to write a statement that displays the total purchase price.
		
		double purchasePrice = (unitPrice*quantity);
		
		//5. What is wrong with this?
		    // double canVolume = 0.355; /* Litres in a 12-ounce can //
		// the comment should end with "*/" not "//"
		
		
		//6. write a program to convert 8.5 and 11 inches into millimeters
		Scanner kb = new Scanner (System.in);
		// imported scanner to use for user input
		
		
		System.out.print("Enter the first dimension, in inches: "); // asked user for the first dimension and stored it into 'width' as a double
		double width = kb.nextDouble();
		
		System.out.print("Enter the second dimension, in inches: "); // asked user for second dimension and stored it in 'length' as double
		double length = kb.nextDouble();
		
		double widthNew = width*(25.4); // calculations to convert the dimensions from inches into mm
		double lengthNew = length*(25.4);
		
		System.out.printf(width + " inches is %.2f millimeters.", widthNew );// displaying first dimension in millimeters
		System.out.printf(length + " inches is %.2f millimeters.", lengthNew); // displaying second dimension in millimeters
		
		//7.
		
		System.out.println("\nEnter an amount, for example 11.56: ");
		double amount = kb.nextDouble();
		int dollars = (int) amount;
		double remain = amount - dollars;
		
		double remain2 = remain/.25;
		int quarter = (int) remain2;
		
		double remain3 = remain - quarter*.25;
		double remain4 = remain3/.10;
		int dimes = (int) remain4;
		
		double remain5 = remain3 - dimes*.10;
		double remain6 = remain5/.05;
		int nickels = (int) remain6;
		
		double remain7 = remain5 - nickels*.05;
		double remain8 = remain7/.01;
		int pennies = (int) remain8;
		
		// Code checks
		//System.out.print(dollars + "----" + quarter + "---" + dimes + "---" + nickels + "---" + pennies);
		//System.out.println(remain + "----" + remain2 + "---" + remain3+ "---" + remain4 + "---" + remain5);
		
		System.out.println("Your amount of " + amount + " consists of:");
		System.out.println(dollars + " dollars");
		System.out.println(quarter + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
	

	}

}
