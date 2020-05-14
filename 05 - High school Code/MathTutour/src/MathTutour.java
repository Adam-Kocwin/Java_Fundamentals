import java.util.Scanner;
import java.util.Random;

//java.util.*
// this will import everything from the util library
// this is called a wild card

public class MathTutour
{

	public static void main(String[] args)
	{
		int number1, number2,sum, userAnswer;
		String JC = "JOHN CENA";
		Scanner input = new Scanner(System.in);
		
		Random randomNumbers = new Random();
		number1 = randomNumbers.nextInt(100)+1;
		number2 = randomNumbers.nextInt(100)+1;
		
		System.out.println("What is the answer to the following problem?");
		System.out.println(number1 + " + " + number2 + " = ");
		sum = number1+ number2;
		userAnswer = input.nextInt();
		
		if(userAnswer == sum)
		{
			System.out.println("Correct!");
		}
		
		else
		{
			System.out.println("Sorry, wrong answer. The correct answer is " + sum);
		}

	}

}
