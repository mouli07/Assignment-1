/*Test class for division operation*/
package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calc.Calculate;


public class DivTest {

	//Method to divide two positive number
	@Test
	public void testDivTwoPositives() {
		
		Calculate calculate=new Calculate();
		double ans=calculate.div(42,42);
		Assert.assertEquals(1, ans,0);
		
	}
	
	//Method to divide two negative number
	public void testDivTwoNegativestives() {
		
		Calculate calculate=new Calculate();
		double ans=calculate.div(-42,-7);
		Assert.assertEquals(6, ans,0);
		
	}
	
	//Method to divide one positive number and one negative number
	public void testDivOnePositiveOneNegative() {
		
		Calculate calculate=new Calculate();
		double ans=calculate.div(42,-7);
		Assert.assertEquals(-6, ans,0);
		
	}
	
	//Method to divide one negative number and one positive number
	public void testDivOneNegativeOnePositive() {
		
		Calculate calculate=new Calculate();
		double ans=calculate.div(-42,7);
		Assert.assertEquals(6, ans,0);
		
	}
	
	//Method to divide a number by zero
	public void testDivByZero() {
		
		Calculate calculate=new Calculate();
		double ans=calculate.div(42,0);
		Assert.assertEquals(Double.POSITIVE_INFINITY, ans,0);
		
	}
	
	

	
	

}
