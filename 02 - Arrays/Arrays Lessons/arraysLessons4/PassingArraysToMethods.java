package arraysLessons4;

public class PassingArraysToMethods
{

	public static void main(String[] args)
	{
		int x =1;
		int [] y = new int [10]; // arrays y and numbers are referencing the same array
		y[0] = 2222;
		m(x,y);                  // when y was sent to the method it changed to 5555 b/c they both reference the same array
		System.out.println("X is " + x);
		System.out.println("Y[0] is " + y[0]);
		
	}
	
	public static void m(int num, int[]numbers)
	{
		num = 1001;
		numbers[0] = 5555; // replaces 2222 /w/ 5555
	}

}
