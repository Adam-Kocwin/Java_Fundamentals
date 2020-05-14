package javaReview3;
import java.util.Scanner;

public class Seasons
{

	public static void main(String[] args)
	{
		String answer;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the name of the season:");  // Syso + control + enter
		answer = input.nextLine();
		
		
		switch (answer.toLowerCase())
		{
		case "spring":
		System.out.println("La Primavera");
		break;
		
		case "summer":
		System.out.println("El Varano");
		break;
			
		case "autumn":
		case "fall":
			System.out.println("El Otono");
			break;
			
		case "winter":
			System.out.println("El Inverino");
			break;
			
		default:
			System.out.println("Please enter one of these words:\n" +" spring,summer,fall, autumn, or winter" );
		
		
		
		}//switch 1
		
  
	}

}
