
import java.io.*;

public class WordSearch {

	public static void main(String[] args) 
	{
		String srchWrd = args[0];
		String path = args[1];
		
		File file = new File(path);
		
		if(file.exists() && !file.isDirectory())
		{
			try {
				
				FileInputStream fln = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fln);
				BufferedReader br = new BufferedReader(isr);
				
				String line = null;
				int lnCnt = 0, flag = 0;
				
				while((line = br.readLine()) != null)
				{
					lnCnt++;
					
					if (line.contains(srchWrd))
					{
						flag = 1;
						System.out.println(srchWrd+" is present in line number "+lnCnt);
					}
					
					//line = br.readLine();
				}
				
				if(flag == 0)
					System.out.println(srchWrd+" not Found");
				
				br.close();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Does not Exist !!");
		}
	}

}