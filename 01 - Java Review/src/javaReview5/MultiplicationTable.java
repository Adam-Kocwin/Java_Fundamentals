package javaReview5;

public class MultiplicationTable
{

	public static void main(String[] args)
	{
		System.out.println("           Multiplication Table\n");
		System.out.print("    ");
		
		for (int j = 1; j <= 9; j++)
		{
			System.out.print("   " + j);
			
		}// end of for
		
		System.out.println("\n-----------------------------------------");
		
		for (int i = 1; i <= 9; i++)
		{
			System.out.print(i + " | ");
			
			for (int j = 1; j <=9; j++)
			{
				System.out.printf("%4d", i*j);
				
			}//end of for 1 
			
			System.out.println();
			
		}// end of for main

		
	}

}
