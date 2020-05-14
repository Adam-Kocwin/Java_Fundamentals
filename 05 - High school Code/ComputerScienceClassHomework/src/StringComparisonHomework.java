import java.util.Scanner;

public class StringComparisonHomework
{

	public static void main(String[] args)
	{
		// question 1 with question 3 to perform case sensitive
		String name;
		String userInput;
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is my name?");
		userInput =input.nextLine();
		
		if (userInput.equalsIgnoreCase("TIMOTHY"))
		{
			System.out.println("Do I know you?");
		}
		else
		{
			System.out.println("Thats not my name");
		}
		
		//question 2
		String firstName;
		String secondName;
		String thirdName;
		
		System.out.println("enter name one");
		firstName  = input.nextLine();
		
		System.out.println("enter name two");
		secondName  = input.nextLine();
		
		System.out.println("enter name three");
		thirdName  = input.nextLine();
		
		if (firstName.compareTo(secondName)>0 && firstName.compareTo(thirdName)<0)
		{
			System.out.println(secondName + "\n" + firstName + "\n" + thirdName);
		}
		if (firstName.compareTo(secondName)<0 && firstName.compareTo(thirdName)>0)
		{
			System.out.println(thirdName + "\n" + firstName + "\n" + secondName);
		}
		if (secondName.compareTo(firstName)>0 && secondName.compareTo(thirdName)<0)
		{
			System.out.println(firstName + "\n" +secondName + "\n" + thirdName);
		}
		if (secondName.compareTo(firstName)<0 && secondName.compareTo(thirdName)>0)
		{
			System.out.println(thirdName + "\n" + secondName + "\n" + firstName);
		}
		if (thirdName.compareTo(firstName)>0 && thirdName.compareTo(secondName)<0)
		{
			System.out.println(firstName + "\n" +thirdName + "\n" + secondName);
		}
		if (thirdName.compareTo(firstName)<0 && thirdName.compareTo(secondName)>0)
		{
			System.out.println(secondName + "\n" +thirdName + "\n" + firstName);
		}
		
		System.exit(0);
		
		

	}

}
