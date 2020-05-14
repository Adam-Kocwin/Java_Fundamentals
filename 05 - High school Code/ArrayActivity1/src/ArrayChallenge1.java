import java.util.Scanner;
public class ArrayChallenge1

{

	public static void main(String[] args)
	{
		int[] temperatures = new int[10];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter temperature one");
		temperatures[0] = keyboard.nextInt();
		
		System.out.println("Enter temperature two");
		temperatures[1] = keyboard.nextInt();
		
		System.out.println("Enter temperature three");
		temperatures[2] = keyboard.nextInt();
		
		System.out.println("Enter temperature four");
		temperatures[3] = keyboard.nextInt();
		
		System.out.println("Enter temperature five");
		temperatures[4] = keyboard.nextInt();
		
		System.out.println("Enter temperature six");
		temperatures[5] = keyboard.nextInt();
		
		System.out.println("Enter temperature seven");
		temperatures[6] = keyboard.nextInt();
		
		System.out.println("Enter temperature eight");
		temperatures[7] = keyboard.nextInt();
		
		System.out.println("Enter temperature nine");
		temperatures[8] = keyboard.nextInt();
		
		System.out.println("Enter temperature ten");
		temperatures[9] = keyboard.nextInt();
		
		int averageTemperature = (temperatures[0] + temperatures[2] + temperatures[3] + 
				temperatures[4] + temperatures[5] + temperatures[6] + temperatures[7] +
				temperatures[8] + temperatures[9]) / 10;
		int index = 0;
		
		if(temperatures[0] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[1] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[2] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[3] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[4] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[5] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[6] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[7] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[8] > averageTemperature)
		{
			index++;
		}
		
		if(temperatures[9] > averageTemperature)
		{
			index++;
		}
		
		System.out.println("Out of ten temperatures " + index + 
				" temperatures are above average ");
		
		}//main main

}//class
