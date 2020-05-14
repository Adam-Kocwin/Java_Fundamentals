
public class TheForLoop {

	public static void main(String[] args) 
	{
		int numberOne;
		System.out.println("number          number Squared");
		System.out.println("------------------------------");
		
		for (numberOne = 1; numberOne <=10;numberOne++)
		{
			// control variable-----test variable-------update variable
			System.out.println(numberOne+"\t\t" + numberOne * numberOne);
		}
		
		
		// example 2
		for(int numberTwo = 2; numberTwo<= 100; numberTwo+=2)
		{
			System.out.print(numberTwo);
		}

	}

}
