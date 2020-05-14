package javaReview1;
import java.util.Scanner;

public class DeisplayTime {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter an Integer for seconds: ");// used print so that the mouse enter thing would be at the end of the statement
		int seconds = keyboard.nextInt();
		int minutes = seconds/60;          // the slash (/) means divide
		int remainingSeconds = seconds % 60;    // Modulus (%) divides but only gives the remainder
		                                       // Ex. 12 % 9 = 3  
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
		
	}

}
