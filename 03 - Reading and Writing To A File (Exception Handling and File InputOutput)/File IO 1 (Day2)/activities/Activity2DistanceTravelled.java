package activities;
import java.io.*;
import java.util.Scanner;

public class Activity2DistanceTravelled
{

	public static void main(String[] args) throws IOException
	{
		Scanner k = new Scanner (System.in);
		int time;
		int speed;
		
		PrintWriter output = new PrintWriter("SpeedDistanceTable.txt");
		
		output.println("Hour          Distance Traveled");
		output.println("-------------------------------");
		
		System.out.println("Enter the speed of the vehicle: ");
		speed = k.nextInt();
		while(speed <=0)//********************************************  CAN SPEED BE 0?????
		{
			System.out.println("That is not a valid input, Enter the speed of the vehicle: ");
			speed = k.nextInt();
		}
		
		System.out.println("Enter the number of hours it has travelled: ");
		time = k.nextInt();
		while(time<1)
		{
			System.out.println("That is not a valid input, Enter the hours it has travelled: ");
			time = k.nextInt();
		}
		
		for (int i = 1; i <= time; i++)
		{
			output.println(i + "                    " + (speed*i));
			
		}
		
		output.close();

	}

}
