
/*Test class for multiplication operation*/
package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calc.Calculate;


public class MultiTest {

	//Method to multiply two positive number
	@Test
	public void testMulTwoPositives() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.mul(2, 5);
		Assert.assertEquals(10,ans);
		
	}
	
	//Method to multiply two negative number
	public void testMulTwoNegatives() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.mul(-2, -5);
		Assert.assertEquals(10,ans);
		
	}
	
	//Method to multiply one positive number and one negative number
	public void testMulOnePositiveOneNegative() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.mul(2, -5);
		Assert.assertEquals(-10,ans);
		
	}
	
	//Method to multiply one negative number and one positive number
	public void testMulOneNegativeOnePositive() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.mul(-2, 5);
		Assert.assertEquals(-10,ans);
		
	}
	
	

}
