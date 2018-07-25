/*Program to use the features of a television*/
public class Televison {

			protected int status;
			private int volume;
			private int channel;
			
			void increaseVolume()    //increase the volume by 1
			{
				volume+=1;
			}
			
			void decreaseVolume()        //decrease the volume by 1
			{
				volume-=1;
			}
			
			void changeChannel(int channel)		//to change the current channel
			{
				this.channel=channel;
			}
			
			void onOff() 						//to turn the tv on or off
			{
				if(status==0)
					status=1;
				else
					status=0;
			
			}
			
			int getVolume() 					//returns the volume
			{
				return volume;
			}
			
			int getChannel()				//returns the current channel
			{
				return channel;
			}
			
}
