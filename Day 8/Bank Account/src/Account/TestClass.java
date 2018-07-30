//Class containing main method implementing ArrayList on Savings account objects
package Account;
import java.util.*;

public class TestClass {
	
	public static void printSavingsAccount()
	{
		List<SavingsAccount> listOfAccount=new ArrayList<SavingsAccount>();
		
		//adding elements to savings account objects
		listOfAccount.add(new SavingsAccount(100000.00,101,"Tom",true));
		listOfAccount.add(new SavingsAccount(200000.00,102,"Sam",true));
		listOfAccount.add(new SavingsAccount(300000.00,103,"Bob",true));
		listOfAccount.add(new SavingsAccount(300000.00,104,"Hank",false));
		listOfAccount.add(new SavingsAccount(1200000.00,105,"Mike",true));
		
		System.out.println("The Savings Account are ");
		listOfAccount.stream().forEach((savingsaccount) -> System.out.println("Account Holder Name- " +savingsaccount.getAccountHoldername() + "\nAccount ID- "
				+savingsaccount.getAcc_ID() + "\nAccount Balance- " +savingsaccount.getAcc_balance() + "\nSalary Account- " +savingsaccount.getIsSalaryAccount() + "\n"));
	}
	
	
	public static void main(String args[])
	{
		printSavingsAccount();
	}
	
	

}
