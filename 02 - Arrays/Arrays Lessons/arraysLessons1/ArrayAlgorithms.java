package arraysLessons1;


public class ArrayAlgorithms
{

	public static void main(String[] args)
	{
		double [] myList = new double [10];
		java.util.Scanner k = new java.util.Scanner(System.in);
		
		System.out.println("Example 1: initializing arrays with input values:");
		System.out.println("Please enter " + myList.length + " values....");
		for (int i = 0; i < myList.length; i++)
		{
			System.out.print("Enter value " + (i+1) + ":");
			myList[i] = k.nextDouble();
		}
		System.out.println();
		//=========================================================================================
		System.out.println("Example 2: Initializing arrays with random values.... processed internally");
		for (int i = 0; i < myList.length; i++)
		{
			myList[i] = Math.random()*100;
		}
		System.out.println();
		//=========================================================================================
		System.out.println("Example 3: Displaying arrays");
		for (int i = 0; i < myList.length; i++)
		{
			System.out.println(myList[i]);
		}
		System.out.println();
		//=========================================================================================
		System.out.println("Example 4: Summing all Elements");
		double total = 0;
		for (int i = 0; i < myList.length; i++)
		{
			total += myList[i];
		}
		System.out.println("The sum of the myList array is " + total);
		System.out.println();
		
		//=========================================================================================
		System.out.println("Example 5: Finding the largest element");
		
		double max = myList[0];
		for (int i = 1; i < myList.length; i++)
		{
			if (myList[i] > max)
			{
				max = myList[i];
			}
		}
		System.out.println("The largest element is "+ max);
		
		//=========================================================================================

		System.out.println("Example 6: Finding the smallest index of the Largest Element");
		
		int [] myListArray = {1,5,3,4,5,5};
		int maxTwo = myListArray[0];
		int indexOfMax =0;
		
		for (int i = 1; i < myListArray.length; i++)
		{
			if (myListArray[i] > maxTwo)
			{
				maxTwo = myListArray[i];
				indexOfMax =i;
			}
		}
		System.out.println("THe index of the largest number is " + indexOfMax);
		System.out.println();
		//=========================================================================================
		
		System.out.println("Example 7: Random Shuffling");
		
		for (int i = 0; i < myList.length; i++)
		{
			int j = (int) (Math.random() * myList.length);
			double temp = myList[i]; // temp hold the value in I and then will give it to J
			myList[i] = myList[j];
			myList[j] = temp;
		}
		//=========================================================================================
		
		System.out.println("Example 8: Shifting elements");
		double temp = myList[0];
		
		for (int i = 1; i < myList.length; i++)
		{
			myList[i-1] = myList[i];
		}
		myList[myList.length -1] = temp;
		
		for (int i = 0; i < myList.length; i++)
		{
			System.out.println(myList[i]);
		}
		
		
	}

}
