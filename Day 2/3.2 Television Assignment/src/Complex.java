/*Program to add two Complex number*/

public class Complex {
	
	 float real,imaginary;
			
	void set(float rl,float im)
	{
		real=rl;
		imaginary=im;
	}
	
	void disp()
	{
		System.out.println(real+ "+" +imaginary+ "i");
	}
	
	Complex sum(Complex num1,Complex num2,Complex addresult)   /*Method to add the two complex number*/
	{
		addresult.real=num1.real + num2.real;
		addresult.imaginary=num1.imaginary + num2.imaginary;
		return addresult;
	}
}
