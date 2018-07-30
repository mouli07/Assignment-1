//Class implementing tree set on Savings Account objects
package Account;

import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	
	public static void main(String args[])
	{
		Set<SavingsAccount> nameSet=new TreeSet<SavingsAccount>();				
		
		//adding objects of class Savings Account
		nameSet.add(new SavingsAccount(300000.00,103,"Bob",true));
		nameSet.add(new SavingsAccount(300000.00,104,"Hank",false));
		nameSet.add(new SavingsAccount(1200000.00,105,"Mike",true));
		nameSet.add(new SavingsAccount(100000.00,101,"Tom",true));
		nameSet.add(new SavingsAccount(200000.00,102,"Sam",true));
		nameSet.add(new SavingsAccount(300000.00,103,"Bob",true));
		
		System.out.println("The Savings Account are ");
		nameSet.stream().forEach((savingsaccount) -> System.out.println("Account Holder Name- " +savingsaccount.getAccountHoldername() + "\nAccount ID- "
				+savingsaccount.getAcc_ID() + "\nAccount Balance- " +savingsaccount.getAcc_balance() + "\nSalary Account- " +savingsaccount.getIsSalaryAccount() + "\n"));
	}
	
	

}
