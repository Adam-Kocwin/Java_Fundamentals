package lessons;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

import org.omg.Messaging.SyncScopeHelper;

public class FileWriteDemo2
{

	public static void main(String[] args)throws IOException
	{
		String fileName;
		String friendName;
		int numFriends;
		
		Scanner k = new Scanner (System.in);
		System.out.println("How many friends do you have?: ");
		numFriends = k.nextInt();
		
		
		System.out.println("Enter a file name: ");
		fileName = k.nextLine();
		
		File file = new File(fileName);
		if (file.exists())
		{
			System.out.println("The file " + fileName + " already exists");
		}
		
			System.out.println("Enter the name of friend number " + i + " ");
			friendName = k.nextLine;
		

	}

}
