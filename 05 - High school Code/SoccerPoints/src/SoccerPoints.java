import java.util.Scanner;

public class SoccerPoints
{

	public static void main(String[] args)
	{
		/*dsadas
		*/
		int points,totalPoints = 0;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("enter the number of points your team");
		System.out.println("has earned for each game this season.");
		System.out.println("Enter \"-1\" when finished");// backslash quote " thing" backslash quote to show quotes when outputting
		System.out.println();
		
		System.out.println("Enter game points or -1 to the end:");
		points = userInput.nextInt();
		
		while (points!= -1)
		{
			totalPoints += points;
			System.out.print("Enter game points or -1 to end");
			points = userInput.nextInt();
		}
		
		System.out.println("\n the total points are " + totalPoints);
		
		

	}

}
