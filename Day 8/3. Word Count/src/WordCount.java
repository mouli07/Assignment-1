//Program to count the number of words in a file
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String path;
			System.out.println("Enter file path");
			path=sc.nextLine();
			File file=new File(path);
			Scanner scn=new Scanner(new FileInputStream(path));
			int wordC=0;
			while(scn.hasNext()) {
				scn.next();
				wordC++;
			}
			scn.close();
			sc.close();
			System.out.println("No. words in file are: "+ wordC);
		}
	
}
