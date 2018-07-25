/*CLass containing main function for controlling television features*/
import java.util.*;


public class TelevisionTest {
	
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		Televison tele=new Televison();
		int ch,volume,channel;
		
		do 
		{
			if(tele.status==0)
			{
				System.out.println("Press 1 to Switch the television set");
				ch=sc.nextInt();
				tele.onOff();
			}
			else
			{
				
				System.out.println("Please select from the option");
				System.out.println("1. Switch Television OFF\n2. Increase Volume \n3. Decrease Volume \n4. Change Channel \n5. Get Information");
				System.out.println("Enter your choice :: ");
				ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
					System.out.println("TV is switched off");
					tele.onOff();
					break;
					
				case 2:
					volume=0;
					do {
					System.out.println("Volume ::" +tele.getVolume());
					tele.increaseVolume();
					System.out.println("Press 1 to exit volume mode \nPress 0 to continue increase");
					volume=sc.nextInt();
					}
					while(volume==0);
					break;
					
				case 3:
					volume=0;
					do {
						System.out.println("Volume :: " +tele.getVolume());
						tele.decreaseVolume();
						System.out.println("Press 1 to exit Volume mode \n Press 0 to continue decrease");
						volume=sc.nextInt();
					}
					while(volume==0);
					break;
					
				case 4:
					System.out.println("Current channel number :: " +tele.getChannel());
					System.out.println("Enter the channel number ::");
					channel=sc.nextInt();
					tele.changeChannel(channel);
					break;
					
				case 5:
					System.out.println("Information");
					if(tele.status==0)
						System.out.println("Television State :: OFF");
					else
					{
						System.out.println("Television State :: ON");
						System.out.println("Channel Number :: " +tele.getChannel());
						System.out.println("Current Volume :: " +tele.getVolume());
					}
					break;
					
				default:
					System.out.println("Wrong input");
				}
			}
		}
		while(tele.status==1);
		
	}

}
