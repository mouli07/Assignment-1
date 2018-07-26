/*Test class for addition operation*/
package in.co.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import in.co.capgemini.calc.Calculate;


public class AddTest {

	
	//Method to add two positive number
	@Test
	public void testAddTwoPositive() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.add(3,4);
		Assert.assertEquals(7, ans, 0);
	}
	
	
	//Method to add two negative number
	@Test
	public void testAddTwoNegatives() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.add(-3,-4);
		Assert.assertEquals(-7, ans, 0);
	}
	
	
	//Method to add one negative and one positive
       public void testAddOneNegativeOnePositive() {
		
		Calculate calculate=new Calculate();
		int ans=calculate.add(-3,4);
		Assert.assertEquals(1, ans, 0);
	}
       
       //Method to add one positive and one negative
       public void testAddOnePositiveOneNegative() {
   		
   		Calculate calculate=new Calculate();
   		int ans=calculate.add(3,-4);
   		Assert.assertEquals(-1, ans, 0);
   	}

}
