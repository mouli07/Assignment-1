
public class Country {
	
	private String Cname[]=new String[100];
	private int population[]=new int[100];
	private int area[]=new int[100];
	private int i,j,num;
	private int populationdensity[]=new int[100];
	
	void setValue(int n,String cname[],int popula[],int ar[])
	{
		Cname=cname;
		population=popula;
		area=ar;
		num=n;
	}
	
	void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
	
	void swap(String a,String b)
	{
		String temp=a;
		a=b;
		b=temp;
	}
	void calculateLargestarea()
	{
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<num-i-1;j++)
			{
				if(area[j]<area[j+1])
				{
					swap(area[j],area[j+1]);
					swap(population[j],population[j+1]);
					swap(Cname[j],Cname[j+1]);
				}
				
			}
		}
		System.out.println("The country with the largest area: " +Cname[0]);
	}
	
	
	void calculateLargestpopu()
	{
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<num-i-1;j++)
			{
			if(population[j]<population[j+1])
			{
				swap(area[j],area[j+1]);
				swap(population[j],population[j+1]);
				swap(Cname[j],Cname[j+1]);
			}
			
		    }
		}
		System.out.println("The country with the largest population: " +Cname[0]);
	}
	
	void calculatelargestdensity()
	{
		for(i=0;i<num;i++)
		{
			populationdensity[i]=population[i]/area[i];
		}
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<num-i-1;j++)
			{
			if(populationdensity[j]<populationdensity[j+1])
			{
				swap(area[j],area[j+1]);
				swap(populationdensity[j],populationdensity[j+1]);
				swap(population[j],population[j+1]);
				swap(Cname[j],Cname[j+1]);
			}
			
		    }
		}
		System.out.println("The country with the largest Population Density: " +Cname[0]);
		
	}
	
	void display()
	{
		calculateLargestarea();
		calculateLargestpopu();
		calculatelargestdensity();
	}
	

}
