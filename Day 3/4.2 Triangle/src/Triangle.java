/*Program to find the type of input triangle*/
public class Triangle {
	
	private int side1,side2,side3;
	
	void setVal(int a,int b,int c) {
		
		side1=a;
		side2=b;
		side3=c;
	}
	
	boolean isright()				//Method to find a right angled triangle
	{
		if((side1*side1)==((side2*side2)+(side3*side3)))
			return true;
		else if((side2*side2)==((side1*side1)+(side3*side3)))
			return true;
		else if((side3*side3)==((side2*side2)+(side1*side1)))
			return true;
		else 
			return false;
		
	}
	
	boolean isScalene()				//Method to find a scalene triangle
	{
		if(side1!=side2 && side2!=side3)
		return true;
		else
			return false;
	}
	
	boolean isIsoceles()				//Method to find an isoceles triangle
	{
		if(side1==side2 && side1!=side3)
			return true;
		else if(side1==side3 && side1!=side2)
			return true;
		else if(side2==side3 && side2!=side1)
			return true;
		else
			return false;
	}
	
	boolean isEquilateral()				//Method to find an equilateral triangle
	{
		if(side1==side2 && side2==side3)
			return true;
		else
			return false;
	}
     
	int getValue()
	{
		if(isright())
			return 1;
		else if(isScalene())
			return 2;
		else if(isIsoceles())
			return 3;
		else if(isEquilateral())
			return 4;
		else return 0;
		
		
		
	}
}
