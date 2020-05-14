package arraysLessons6;
import java.util.*;
public class Processing2DArrays
{

	public static void main(String[] args)
	{
		int [] [] matrix = new int [10] [10];
		
		System.out.println("Example 2: Initializing arrays with random values;");
		
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				matrix [row] [column] = (int) (Math.random() * 100 );
			}
		}
		
		//-------------------------------------------------------------------------
		
		System.out.println("\nExample 3: Printing 2D Arrays");
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				System.out.printf("%4d", matrix[row][column]);
			}
			System.out.println();
		}
		
		
		//-------------------------------------------------------------------------
		
		System.out.println("\nExample 4: Summing all the elements of a 2D ARRAY");
		int total =0;
		
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				total += matrix [row] [column];
			}
		}
		
		System.out.println("The sum of the values of the matrix array is " + total);
		
		
		//-------------------------------------------------------------------------
		System.out.println("\nExample 5: Which row has the largest sum?");
		
		int maxRow =0;
		int indexOfMaxRow =0;
		
		for (int column = 0; column < matrix[0].length; column++)
		{
			maxRow += matrix [0] [column];
		}
		for (int row = 1; row < matrix.length; row++)
		{
			int totalOfThisRow =0;
			for (int column = 0; column < matrix[row].length; column++)
			{
				totalOfThisRow += matrix [row] [column];
			}
			if(totalOfThisRow > maxRow)
			{
				maxRow = totalOfThisRow;
				indexOfMaxRow = row;
			}
		}
		
		System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
//-----------------------------------------------------------------------------------------------		
		System.out.println("\nExample 6: 2D random Shuffling");
		
		for(int i =0; i < matrix.length; i++)
		{
			for(int j =0; i < matrix[i].length; j++)
			{
				int i1 = (int) (Math.random() * matrix.length);
				int j1 = (int) (Math.random() * matrix.length);
				int temp = matrix [i][j];//------------------\\\\\\\\\=---------\\\--------\\\\\\\\\------------
				matrix [i][j] = matrix [i1][j1];
				matrix [i1][j1] = temp;
			}
		}
		
		for ( int row =0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				System.out.printf("%4d", matrix [row][column]);
			}
			
		}

	}
	
}
	


