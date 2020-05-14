package lessons;

public class BankAccount
{
	private double balance;
	
	public BankAccount ()// constructor methods need to have the same name as the class
	{
		balance = 0.0;
	}
	
	public BankAccount (double startBalance)
	{
		balance = startBalance;
	}
	
	public BankAccount(String str)
	{
		balance = Double.parseDouble(str);//-------------------*********************
	}
	
	public void deposit(double amount)
	{
		balance +=amount;
	}
	
	public void deposit(String str)
	{
		balance+=Double.parseDouble(str);//----
	}
	
	public void withdraw(double amount)
	{
		balance -=amount;
	}
	
	public void withdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double b)//mutator method ---- setter
	{
		balance =b;
	}
	
	public void setBalance(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	public double getBalance()//accessor------ getter
	{
		return balance;
	}
	
	

}
