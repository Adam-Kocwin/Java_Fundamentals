import java.util.Random;

public class DiceGame
{

	public static void main(String[] args)
	{
		int computerDie;
		int computerWin=0;
		int playerDie;
		int playerWin=0;
		int draws=0;
		int gameTime = 10;
		
		Random RNG = new Random ();
		
		
		for (int count =1; count <= gameTime; count++)
		{
			computerDie = RNG.nextInt(6)+1;
			playerDie = RNG.nextInt(6)+1;
			
			System.out.println("The computers roll for game " + count+ " is: " + computerDie);
			System.out.println("The players roll for game " + count+ " is: " + playerDie);
			
		if (computerDie > playerDie)
		{
			System.out.println("The computer wins the round\n");
			computerWin++;
			
		}
		
		else if (playerDie > computerDie)
		{
			System.out.println("The Player wins the round\n");
			playerWin++;
			
		}
		
		else if ( playerDie == computerDie)
		{
			System.out.println("The round is a draw\n");
			draws++;
		}
		
		}// end of for loop
		
		if (playerWin >computerWin)
		{
			System.out.print("The player wins the game");
		}
		
		else if ( computerWin > playerWin)
		{
			System.out.print("The computer wins the game");
		}
		
		else
		{
			System.out.print("The game is a draw");
		}
		
		
		

	}//end of main

}//end of class
