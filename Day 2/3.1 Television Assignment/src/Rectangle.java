/*Program to calculate area and perimeter of rectangle*/

public class Rectangle {
	
	double length,breadth;
	void getdata(double x,double y)     //method to get the data
	{
		length=x;
		breadth=y;
	}
	
	double area(double x,double y)	 	//method to calculate area
	{
		return x*y;
	}
	
	double peri(double x,double y)		//method to calculate perimeter
	{
		return (2*(x+y));
	}
	

}
