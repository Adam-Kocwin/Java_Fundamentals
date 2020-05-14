package javaReview6;

public class TestMax
{

	public static void main(String[] args)
	{
		int i =5;
		int j =2;
		int k = max(i,j);
		System.out.println(max(i,j)); // or System.out.println(k);

		
	}// end of class
//------------------------------------------------------------------------------------------------------	
	public static int max(int num1, int num2)   // gives error b/c return statement is not in yet
	{
		int result;
		if (num1>num2)
		{
			result = num1;
		}
		else
		{
			result = num2;
		}
		return result;
		
	}// end of method
//------------------------------------------------------------------------------------------------------
}
