//Program to remove extra space
import java.io.*;
class RemFrmSentnc {
	
	public static void main(String ags[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String result = "";
		String spceRemd = "";
		int count = 0;
		
		//Accepting inputs from user
		System.out.println("Enter The Sentence :: ");
		String sentence  = in.readLine();
		System.out.println("Enter The Word To be Removed :: ");
		String remWord = in.readLine();
		System.out.println("Enter The Word Position In The P:osition :: ");
		int pos = Integer.parseInt(in.readLine());
		
		sentence = sentence.trim(); //removing front and trailing spaces
		sentence+=" "; //add a trailing space
		
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)!=' ')
				spceRemd += sentence.charAt(i);
			else if(sentence.charAt(i)==' ' && sentence.charAt(i-1)!=' ')
				spceRemd += " ";
		}
		
		System.out.println("Sentence With Space Removed :: "+spceRemd);
		
		int i;
		for(i=0;i<sentence.length() && count!=pos-1;i++)
		{
			result += spceRemd.charAt(i);
			
			if(spceRemd.charAt(i)==' ');
				count++;
		}
		
		while(spceRemd.charAt(i)!=' ')
			i++;
		
		i++;
		
		for(;i<spceRemd.length();i++)
			result +=  spceRemd.charAt(i);
		
		System.out.println("Sentence With Word Removed :: "+result);
	}
}
