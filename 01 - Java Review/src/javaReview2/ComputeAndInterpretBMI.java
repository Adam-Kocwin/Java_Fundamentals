package javaReview2;
import java.util.Scanner;

public class ComputeAndInterpretBMI 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner (System.in);
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METRES_PER_INCH = 0.0254;
		
		System.out.print("Enter weight in pounds: ");
		double weight = keyboard.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = keyboard.nextDouble();
		
		double weightInKilograms = weight*KILOGRAMS_PER_POUND;
		double heightInMetres = height*METRES_PER_INCH;
		
		double bmi = weightInKilograms/(heightInMetres*heightInMetres);
		// double bmi = weightInKilograms/Math.pow(heightInMetres,2);
		
		System.out.println("BMI is " + bmi);
		
		if (bmi< 18.5)
		{
			System.out.println("Underweight");
		}
		
		else if(bmi<25)
		{
			System.out.println("Normal");
		}
		else if (bmi<30)
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
		

	}// end of class

}//end of main
