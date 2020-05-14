package javaReview1;
import java.util.Scanner;

//Write a program that converts a Fahrenheit temp to a Celsius temp

public class FahrenheitToCelsius {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit: ");
		double fahrenheit = keyboard.nextDouble(); // double can handle decimals
		double celsius = (5.0/9) * (fahrenheit-32);   // * is multiplication
		// double celsius = ((double)5/9).........      This is casting the 5 as a double instead of doing the 5.0
		System.out.printf("fahrenheit%.2f is %.2f in Celsius",fahrenheit ,celsius); // will display to two decimal points b/c of "%.2f"

	}

}
