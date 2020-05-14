package arraysLessons4;
import java.util.Arrays;

public class ReturningAnArrayFromAMethod
{

	public static void main(String[] args)
	{
		int [] list = {1,2,3,4,5,6,7,8,9,10};
		
		int [] returnArray;
		returnArray = reverse(list);
		
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(returnArray));
	}
	
	public static int[] reverse (int[] list)
	{
		int [] result = new int [list.length]; // create a new array with the same length as list
		
		for (int i = 0,j=result.length-1; i < list.length; i++,j--)
		{
			result[j] = list[i];		
			
		}
		return result;
	}

}
