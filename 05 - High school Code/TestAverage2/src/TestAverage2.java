import java.util.Scanner;

public class TestAverage2
{

	public static void main(String[] args)
	{
		int numStudents;
		int numTests;
		int score;
		int total;
		double average;
		
		Scanner input = new Scanner (System.in);
		System.out.print("How many students do you have?");
		numStudents = input.nextInt();
		
		System.out.print("How many test score for student?");
		numTests = input.nextInt();
		
		for (int student=1; student<=numStudents;student++)
		{
			total = 0;
			System.out.println("Student number " + student);
			System.out.println("----------------");
			
			for (int test=1;test<=numTests;test++)
			{
				System.out.print("Enter score" + test + ":");
				score = input.nextInt();
				total+= score;//total = total +score
			}
			
			
			average = total/numTests;
			System.out.printf("The average for student %d is %.1f.\n\n", student,average);
			
		}//end of outer for loop

	}

}
