import java.util.Scanner;

public class NestedLoopsChallengeHomework1
{

	public static void main(String[] args)
	{
final int BASE_SIZE=0;
		
		for(int r=7;r>=BASE_SIZE;r--)
		{
			for(int c =0;c<(r+1); c++)
			{
				System.out.print("*");
			}//end of C inner loop
			System.out.println();
		}// end of R outer loop

	}//end of main

}//end of class
