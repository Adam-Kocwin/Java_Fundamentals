package activities;

public class JavaReviewActivity5A
{

	public static void main(String[] args)
	{
		System.out.print("Miles          Kilometers    ");
		System.out.println("|  Kilometers         Miles");
		
		for (int i =1; i <= 10; i++)
		{
			double mtk = i*1.609;
			int kilo = (i*5) +15;
			double ktm = kilo*.621;
			System.out.printf("\n%2d             %6.3f        |      %d             %6.3f", i, mtk, kilo, ktm);
			// f= decimal or float point ints
			// d = integers/ whole numbers
			// %#.3(f/d)   
			//# = how many spaces it takes up
			// .3 = number of decimals rounded to
		}
		
		

	}// end of class

}
