/*Junit test class for tax calculator*/
package in.co.capgemini.test;


import org.junit.Test;
import org.junit.Assert;

import in.co.capgemini.calc.TaxCalculator;

public class TestTaxAmount {


	//Method for isIndian False
	@Test
	public void testIsIndianFalse() throws Exception {
		
		TaxCalculator calculator=new TaxCalculator();
		double ans=calculator.calculateTax("Ron",false,34000);
		Assert.assertEquals(0, ans, 0);
		
	}

	//Method for tax not eligible
	@Test
	public void testTaxNotEligible() throws Exception {
		
		TaxCalculator calculator=new TaxCalculator();
		double ans=calculator.calculateTax("Tim",true,1000);
		Assert.assertEquals(0, ans, 0);
		
	}
	
	//Method for valid case
	@Test
	public void testValidCase() throws Exception {
		
		TaxCalculator calculator=new TaxCalculator();
		double ans=calculator.calculateTax("Jack",true,30000);
		Assert.assertEquals(1500, ans, 0);
		
	}
	
	//Method for name is null or not valid
	@Test
	public void testNullName() throws Exception {
		
		TaxCalculator calculator=new TaxCalculator();
		double ans=calculator.calculateTax("",true,30000);
		Assert.assertEquals(0,ans, 0);
		
	}

}
