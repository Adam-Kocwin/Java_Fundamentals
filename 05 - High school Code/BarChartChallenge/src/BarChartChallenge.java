import java.util.Scanner;

public class BarChartChallenge
{

	public static void main(String[] args)
	{
		int sales;
		int input;
		int sales1 = 0;
		int sales2 = 0;
		int sales3 = 0; 
		int sales4  =0;
		int sales5 = 0;
		
		int count;// for store limit
		int count1;//store1
		int count2;//etc
		int count3;
		int count4;
		int count5;//store 5
		
		Scanner keyboard = new Scanner(System.in);
		
		
		for(count = 1; count <= 5; count++)
		{
			System.out.print("Enter today's sales for Store "+ count +": ");
			sales = keyboard.nextInt();
			sales1 = sales2;
			sales2 = sales3;
			sales3 = sales4;
			sales4 = sales5;
			sales5 = sales;
		}
		
		System.out.println("Sales bar chart");
		System.out.println("------------------------------");
		
		System.out.print("\nStore 1: ");
		for(count1 = 0; count1 < sales1; count1 += 100)
		{
			System.out.print("*");
		}
		////////////////////////////////
		System.out.print("\nStore 2: ");
		for(count2 = 0; count2 < sales2; count2 += 100)
		{
			System.out.print("*");
		}
		/////////////////////////////////
		System.out.print("\nStore 3: ");
		for(count3 = 0; count3 < sales3; count3 += 100)
		{
			System.out.print("*");
		}
		//////////////////////////////////
		System.out.print("\nStore 4: ");
		for(count4 = 0; count4 < sales4; count4 += 100)
		{
			System.out.print("*");
		}
		//////////////////////////////////
		System.out.print("\nStore 5: ");
		for(count5 = 0; count5 < sales5; count5 += 100)
		{
			System.out.print("*");
		}
	
	
	}//main

}//class
