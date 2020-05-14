
public class NestedLoopsChallengeHomework2
{

	public static void main(String[] args)
	{
		final int NUM_STEPS=6;
		
		for (int r =0;r<NUM_STEPS;r++)
		{
			System.out.print("#");
			for (int c =0;c<r;c++)
			{
				System.out.print(" ");
			}//end of inner loop
			System.out.println("#");
		}//end of outer loop

	}//end of main

}//end of class

