package lessons;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SpecifyingFileLocation
{

	public static void main(String[] args)throws FileNotFoundException
	{
		
		PrintWriter outputFileA = new PrintWriter("E:\\Names.txt");//windows way  or E:/Names.txt
		
		PrintWriter outputFileB = new PrintWriter("C:\\MyData\\Data.txt"); // windows way
		
		PrintWriter outputFileC = new PrintWriter("/home/pettir/names.txt");// generic way that works on windows,linux and Mac
		
	}

}
