package lessons;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TypeMismatchException
{

	public static void main(String[] args)
	{
		int num=0;
		Scanner k = new Scanner (System.in);
		boolean errorFlag =true;
		
		do
		{
		
			try
			{
				System.out.print("Enter an integer value:");
				num = k.nextInt();
				while(num <1 || num>10 )
				{
					System.out.println("That is not a valid input. Please try again.");
					System.out.print("Enter an integer value:");
					num = k.nextInt();
				}
				errorFlag =false;
			}
			catch(InputMismatchException e)   // catch(Exception e) catches everything
			{
				//System.out.println(e.toString());  // displays the error type
				System.out.println("That is not a valid input. Please enter integers only.");
				k.nextLine();// if this isn't here the thing will loop because num will constantly equal its last value
			}
			
		}while (errorFlag);
		
		System.out.println("The number you entered is " + num);
		

		

	}
}