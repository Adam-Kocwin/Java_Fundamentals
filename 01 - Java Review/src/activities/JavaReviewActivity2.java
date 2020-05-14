package activities;
import java.util.Scanner;
import java.util.Random;

public class JavaReviewActivity2 
{

	// make a game. The computer flips a coin and the user has to guess whether or not it is heads or tails.
	// 0 = heads
	// 1 = tails
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		System.out.println("The computer will flip a coin. Make a guess as to what will happen.");
		System.out.println("Guess: Heads or Tails?");
		System.out.print(" Heads = 0; Tails = 1;");
		int guess = input.nextInt();
		
		System.out.println("The computer said "+coin + "; You guessed " + guess + ".");
		
		if (coin == guess)
		{
			System.out.println("You guessed correctly");
		}
		else
		{
			System.out.println("You guessed incorrectly");
		}
		
		
		
		

	}

}
