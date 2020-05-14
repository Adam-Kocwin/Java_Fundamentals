package arraysLessons6;

public class Lengths
{
	// 2D ARRAYS ARE LIKE ARRAYS OF ARRAYS
	// Best described as rows and columns
	// uses two subscripts [] [] 

	public static void main(String[] args)
	{
		int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
		 // or like this
		int [] [] list = {{1,2,3},     // [0] []
 				         {4,5,6},      // [1] []
				         {7,8,9}};     // [2] []
		
		System.out.println("The number of rows is " + numbers.length);
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.println("The number of columns in row " + index + " is " + numbers[index].length );
		}

	}

}
