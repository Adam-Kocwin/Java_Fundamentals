import javax.swing.JOptionPane;
public class WhileLoopChallenge
{

	public static void main(String[] args)
	{
		// prompted user to input number -- gave this a value ( userinput)
		//initialized a value (ex counter) to equal 1
		// initialized another variable as sum ( equal 0) 
		// made a while statement
		// while ( counter <= userinput)
		
		// sum = count + sum
		//count++
		
		// counter will keep increasing in value (and add that value to sum) to equal the digits in the inputted number
		// then show the value of sum 
		
		int userInput;
		int counter = 1;
		int sum = 0;
		String userInput2;
		
		userInput2 = JOptionPane.showInputDialog("Please input a number");
		userInput = Integer.parseInt(userInput2);
		
		while (counter <= userInput)
		{
			sum = counter + sum;
			counter++;
		}
		
		JOptionPane.showMessageDialog(null, "The Sum of the numbers between 1 and " + userInput + "=" + sum);
		

	}

}
