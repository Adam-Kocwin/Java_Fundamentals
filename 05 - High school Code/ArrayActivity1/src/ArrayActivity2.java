import java.util.Scanner;
public class ArrayActivity2
{

	public static void main(String[] args)
	{
		double[]numbers = new double[10];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		numbers[0] = keyboard.nextDouble();
		
		System.out.println("Enter number 2");
		numbers[1] = keyboard.nextDouble();
		
		System.out.println("Enter number 3");
		numbers[2] = keyboard.nextDouble();
		
		System.out.println("Enter number 4");
		numbers[3] = keyboard.nextDouble();
		
		System.out.println("Enter number 5");
		numbers[4] = keyboard.nextDouble();
		
		System.out.println("Enter number 6");
		numbers[5] = keyboard.nextDouble();
		
		System.out.println("Enter number 7");
		numbers[6] = keyboard.nextDouble();
		
		System.out.println("Enter number 8");
		numbers[7] = keyboard.nextDouble();
		
		System.out.println("Enter number 9");
		numbers[8] = keyboard.nextDouble();
		
		System.out.println("Enter number 10");
		numbers[9] = keyboard.nextDouble();
		
		System.out.println(numbers[0] +" differs from the last number by " + (numbers[0] - numbers[9]));
		
		System.out.println(numbers[1] +" differs from the last number by " + (numbers[1] - numbers[9]));
		
		System.out.println(numbers[2] +" differs from the last number by " + (numbers[2] - numbers[9]));
		
		System.out.println(numbers[3] +" differs from the last number by " + (numbers[3] - numbers[9]));
		
		System.out.println(numbers[4] +" differs from the last number by " + (numbers[4] - numbers[9]));
		
		System.out.println(numbers[5] +" differs from the last number by " + (numbers[5] - numbers[9]));
		
		System.out.println(numbers[6] +" differs from the last number by " + (numbers[6] - numbers[9]));
		
		System.out.println(numbers[7] +" differs from the last number by " + (numbers[7] - numbers[9]));
		
		System.out.println(numbers[8] +" differs from the last number by " + (numbers[8] - numbers[9]));
		
		System.out.println(numbers[9] +" differs from the last number by " + (numbers[9] - numbers[9]));
	}//main main

}//class
