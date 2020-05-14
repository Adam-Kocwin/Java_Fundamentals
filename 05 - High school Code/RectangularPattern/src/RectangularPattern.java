import java.util.Scanner;

public class RectangularPattern
{

	public static void main(String[] args)
	{
		int rows,cols;
		Scanner input = new Scanner (System.in);
		
		System.out.print("How many rows?");
		rows = input.nextInt();
		
		System.out.print("How many columns?");
		cols = input.nextInt();
		
		for (int r=0; r<rows; r++)
		{
			for(int c=0; c<cols;c++)
			{
				System.out.print("*");
			}//end of inner loop
			
			
			System.out.println();
			
		}// end of outer for loop
		

	}//end of main

}//end of class
