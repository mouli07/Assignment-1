//Program to count the number of lines in a file
package Line;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LineCount {
	
	public static void main(String args[]) throws IOException
	{
		int count=0;
		System.out.println("Enter the complete path: ");
		Scanner sc=new Scanner(System.in);
		File file=new File(sc.nextLine());
		
		if(file.exists())
		{
			FileReader fr=new FileReader(file);
			LineNumberReader lnr=new LineNumberReader(fr);
			
			
			while(lnr.readLine()!=null)
			{
				count++;
			}
			
			
			
		}
		
	
		System.out.println("The number of lines in the file is : " +count);
		
	}

}
