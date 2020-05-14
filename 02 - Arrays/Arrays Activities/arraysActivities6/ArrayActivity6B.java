package arraysActivities6;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayActivity6B
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		double [][] list = new double [3][4];
		System.out.println("Enter a 3 by 4 matrix row by row:");
		
		for (int row = 0; row < list.length; row++)
		{
			for (int column = 0; column < list[row].length; column++)
			{
				list [row] [column] = k.nextDouble();
			}
		}
		
		
		double sum;
		for (int col = 0; col< 4; col++)
		{
			int columnMax =3;
			sum =0;
		
			for (int row = 0; row <columnMax;row++)
			{
				sum = sum + list [row][col];
				
			}
		System.out.print("\nSum of the elements for column " + col+ " equals ");
		System.out.printf("%.2f",sum);
		
		}

	}
}


