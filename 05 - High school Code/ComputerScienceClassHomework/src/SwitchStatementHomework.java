import javax.swing.JOptionPane;

public class SwitchStatementHomework
{

	public static void main(String[] args)
	{
		// question1
		String userInput;
		int input;
		
		userInput = JOptionPane.showInputDialog("please input 1, 2, or 3");
		input = Integer.parseInt(userInput);
		
		switch (input)
		{
		case 1:
			JOptionPane.showMessageDialog(null, "one");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "two");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "three");
			break;
		}
		
		//question 2
		
		String "selection";
		
		switch (selection)
		{
		case "A":
			JOptionPane.showMessageDialog(null, "you selected A");
			break;
		case "B":	
		}

	}

}
