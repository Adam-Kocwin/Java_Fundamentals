import java.util.Random;

public class EvenOddCounterChallenge
{

	public static void main(String[] args)
	{

		Random rdm = new Random();
		int intCounter = 1;
		int matchTime = 0;
		
		while (intCounter < 100)
		{//1st while loop
			int number = rdm.nextInt(100) + 1;
		    int even = isEven(number);
        if(even == 1)
	    {
		    matchTime++;
	    }//if loop
	    
        intCounter++;
		while(intCounter == 100)
		{
			System.out.println(matchTime + " evens");
			System.out.println((100 - matchTime) + " odds");
			intCounter++;
		}
		
	}//1st while loop
		

		
	}
	public static int isEven(int x)
	{
		int even = 0;
		int odd = 0;
		
		if((x % 2)==0)
		{
			even = even + 1;	
		}//if loop
		
		else
		{
			odd = odd + 1;
		}//else loop
		
		return even;
	}//isEven method

}//class
