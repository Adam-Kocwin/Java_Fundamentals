package javaReview2;
import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNum = new Random();
		int num1 = randomNum.nextInt(10) + 1;  // would go from 0-9 bc zero is the first number
		int num2 = randomNum.nextInt(10) +1;
		
		System.out.print("What is " + num1+ " + " + num2 + "?");  // string literal are the words inside the ""
		
		int answer = keyboard.nextInt();
		System.out.println(num1+ " + " + num2 + " = " + answer + " is " + (num1 + num2 == answer) ); 
		// boolean data type which returns a true or false
		
		
		
	}

}
