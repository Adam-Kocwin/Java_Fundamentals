import javax.swing.JOptionPane;
public class InputValidationHomework
{

	public static void main(String[] args)
	{
		//question 1
		//Write an input validation loop that asks the 
		//user to enter a number in the range of 10 through 24.
		String input;
		int number;
	
		input = JOptionPane.showInputDialog("Please input a number between 10 and 24");
		number = Integer.parseInt(input);
		
		while (number <10 || number>24)
		{
			JOptionPane.showInputDialog("Please input again");
			number = Integer.parseInt(input);
		}
		
		JOptionPane.showMessageDialog(null," the number is goosds");
		
		// MR.PETTI SAYS NOT TO DO NUMBER 2
		
		// question 3
		
		String userInput;
		
		userInput = JOptionPane.showInputDialog("Please Input yes or no");
		
		while (userInput.equalsIgnoreCase("no"))
		{
			userInput = JOptionPane.showInputDialog("Please Input yes");
		}
		
		JOptionPane.showMessageDialog(null, "Thank you for saying yes");
		
		
		System.exit(0);
		

	}

}
