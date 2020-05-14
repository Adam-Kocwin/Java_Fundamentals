
public class UsingMultipleStatements {

	public static void main(String[] args) 
	{
		// example 1
		int a,b;
		for(a=1,b=1; a<=5;a++)
		{
			System.out.println(a + " plus " + b + " equals " + (a+b));
		}
		
		// example 2
		
		int c,d;
		for (c=1,d=1;c<=5;c++,d++);
		{
			System.out.println(c+ " plus " + d + " equals " + (c+d));
		}

	}

}
