package activities;

public class JavaReviewActivity5B
{
	public static void main(String[] args)
	{
		System.out.println("The numbers divisible by 5 and 6 are:");
		int numberMin = 100;
		int counter = 0;
		while (numberMin <= 1000)
		{
			if(numberMin%5 ==0 && numberMin%6 == 0)
			{
				System.out.print(numberMin + " ");
				counter++;
			}
			if (counter == 10)
			{
				System.out.print("\n");
				counter =0;
			}
			
			
			numberMin++;
		}// end of while
	}

}
