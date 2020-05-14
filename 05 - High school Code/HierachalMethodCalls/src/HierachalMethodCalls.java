
public class HierachalMethodCalls
{

	public static void main(String[] args)
	{

		System.out.println("i am starting out in main");
		levelOne();
		System.out.println("back in main");
	}
	
	public static void levelOne()
	{
		System.out.println("I am now in level one");
		levelTwo();
		System.out.println("I am now back in level one");
	}
	
	public static void levelTwo()
	{
		System.out.println("i am now in level two");
	}

}
