package arraysActivities5;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayActivity5Attempt3
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int[] array = new int [10];
		System.out.println("Enter ten numbers:");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Number " + (i+1) + ": ");
			array[i] = k.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		int [] ed = ed(array);
		System.out.println(Arrays.toString(ed));
		

	}
	
	public static int [] ed (int [] list)
	{
		int [] newList = new int [list.length];
		
		for (int i = 0; i < list.length-1; i++)
		{
			int num = list[i];
			
			for (int j = 0; j < newList.length;j++)// problem here ------------------
			{
				if(list[j] != num)
				{
					newList[j] = num; //           switch between j and i	
				
				}
				else
				{
					
				}
				if(j == newList.length-1)
				{
				return newList;
				}
				
			}//Second
			//return newList;
		}// First loop ends-----------------
		
		return newList;
	}// end of method

}
