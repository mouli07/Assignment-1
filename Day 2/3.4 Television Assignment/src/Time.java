
public class Time {
	
	int hour,minute;
	
	void setTime(int hr,int min)
	{
		hour=hr;
		minute=min;
	}
	
	void showTime()
	{
		System.out.println(hour+ "hr " +minute+ "min");
	}
	
	Time sum(Time t1, Time t2, Time addresult)				//Method to find the summation
	{
		addresult.hour= t1.hour + t2.hour;
		addresult.minute=t1.minute + t2.minute;
		if(addresult.minute>=60)							//1hr = 60 min
		{
			addresult.hour+=(addresult.minute/60);
			addresult.minute%=12;
		}
		
		return addresult;
	}

}
