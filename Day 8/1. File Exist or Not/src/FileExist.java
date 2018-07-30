//Program to check if a file exists or not
import java.io.File;
import java.util.Scanner;

public class FileExist {
	
	public static void main(String args[])
	{
		System.out.println("Enter the complete path: ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		File file = new File(sc.nextLine());
		boolean exist= file.exists();
		System.out.println("The file exists : " +exist);
	}

}
