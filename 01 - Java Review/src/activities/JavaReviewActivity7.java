package activities;
import java.util.Scanner;

public class JavaReviewActivity7
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		System.out.print("How many prime displaybers would you like to display:");
		
		int display = k.nextInt();
		
		int counter=2; // current # iterating through ---- 2 is the first prime number
		
		int tenPerLine = 1; // used for the 10 per line display
		
		int primeCount = 1; // used for tracking how many primes are displayed

		
		while (primeCount <= display)
		{
			int primeChecker = prime(counter); // send the value of counter to the method prime
			
			if (primeChecker == 1) // if its prime... do this
			{
				System.out.print(counter + " ");
				tenPerLine++;
				primeCount++;
			}// end if
			
			else if (tenPerLine == 11) // used for the 10 numbers per line display case
			{
				System.out.print("\n");
				tenPerLine =1;
			}
			
			counter++; // add to counter so that when it itterates, it checks for 3,4,5,6......
		}// end while
	}
	
	public static int prime (int counter)  // tells you if its prime or not
	{
		// 1 == prime ///  0 == not prime
		int display = 1; 
		
		for (int j = 2; j < counter; j++)
		{
			if (counter%j == 0)
			{
				display =0;
			}
			
		}
		
		return display;
	}// end of Prime

}
