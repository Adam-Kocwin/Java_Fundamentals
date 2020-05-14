package javaReview6;

public class GlobalVariable
{
	public static int y =1;

	public static void main(String[] args)
	{
		System.out.println(y);
		increment();
		System.out.println(y);
		

	}

	public static void increment()
	{
		y++;
		System.out.println(y);
	}
}
