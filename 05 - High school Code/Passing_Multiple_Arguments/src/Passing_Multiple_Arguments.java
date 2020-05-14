
public class Passing_Multiple_Arguments
{

	public static void main(String[] args)
	{
	// example 1
		System.out.println("Example 1:");
		short s = 1;
		displayValue(s);
		
	
		System.out.println("Example 2: ");
		byte b = 2;
		displayValue(b);
		
		System.out.println("Example 3: ");
		double k = 1.0;
		// can send the k value, but you have to cast as an int. this means data/information will be lost (1 vs 1.0)
		displayValue((int)k);
		
		//example 4
		System.out.println("example 4: ");
		showSum(5,10);
		
		double value1 = 2.5, value2 = 3.5;
		showSum(value1,value2);

		
	}
	
	public static void displayValue(int x)
	{
		System.out.println("The value of argument is " + x);
	}
	
	public static void showSum(double num1,double num2)
	{
		double sum;
		sum = num1 + num2;
		System.out.println("The sum is " + sum);
		
	}

}
