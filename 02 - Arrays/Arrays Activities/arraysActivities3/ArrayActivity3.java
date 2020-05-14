package arraysActivities3;
import java.util.Scanner;

public class ArrayActivity3
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		int [] array = new int [10];
		int index=0;
		boolean number;
		int verify = 0;
		System.out.println("Keep entering numbers. The program will stop accepting numbers after the 10th is inputted.");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter a number: ");
			int userNum = k.nextInt();
			
			verify = verify(array,userNum);
			
			if (verify == 0)
			{
				array[index] = userNum;
				index++;
			}
			
		}
		
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < index; i++)
		{
			System.out.print(array[i] + " ");
		}
		
	}
	
	public static int verify(int[] array,int userNum)
	{
		int verify;
		for (int i = 0; i < array.length; i++)
		{
			if(array[i] == userNum)	
			{
				verify =1;
				return verify;
			}
		}
		verify =0;
		return verify;
		
		
	}

}
