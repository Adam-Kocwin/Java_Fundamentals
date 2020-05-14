package lessons;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Account
{

	public static void main(String[] args)
	{
		String input;
		DecimalFormat dollar = new DecimalFormat("#,###.00");
				// telling computer how we want to format stuff[display thousands /w/ commas & rounded to 2 decimal places
		
		input  = JOptionPane.showInputDialog("What is your account's starting balance?");
		BankAccount account = new BankAccount(input);
		input = JOptionPane.showInputDialog("How much were you paid this month?");
		account.deposit(input);
		JOptionPane.showMessageDialog(null, "Your pay has been deposited. "
				+ "Your current balance is $ " +dollar.format(account.getBalance()));
		
		input = JOptionPane.showInputDialog("How much would you like to withdraw?");
		account.withdraw(input);
		
		JOptionPane.showMessageDialog(null, "Now your balance is $" + dollar.format(account.getBalance()));
		System.exit(0);
				

	}

}
