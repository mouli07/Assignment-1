/*Test class for subtraction operation*/
package in.co.capgemini.test;


import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calc.Calculate;

public class SubTest {

	
	//Method to subtract two positive number
	@Test
	public void testSubTwoPositives() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.sub(6,7);
		Assert.assertEquals(-1,ans);
		
	}
	
	//Method to subtract two negative number
	public void testSubTwoNegatives() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.sub(-6,-7);
		Assert.assertEquals(-13,ans);
		
	}
	
	//Method to subtract one positive number and one negative number
	public void testSubOnePositiveOneNegative() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.sub(6,-7);
		Assert.assertEquals(13,ans);
		
	}
	
		//Method to subtract one negative number and one positive number 
		public void testSubOneNegativeOnePositive() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.sub(-6,7);
		Assert.assertEquals(-13,ans);
		
	}

}
