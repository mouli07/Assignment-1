
public class Test {

	public static void main(String[] args) {
		
		MMBankFactory factory1 = new MMBankFactory();
		
		MMBankFactory factory2 = new MMBankFactory();
		
		SavingsAccount savings = factory1.getNewSavingAccount("Tom", 15200, 54000, true);//initialization of saving account
		System.out.println("After Initialization");
		System.out.println(savings);
		System.out.println("");
		
		
		CurrentAccount current = factory2.getNewCurrentAccount("Harry", 15420, 54796, 10000);//initialization of Current account
		System.out.println("After Initialization");
		System.out.println(current);
		System.out.println("");
		
		
		savings.withdraw(42000);
		System.out.println("After Withdrawal from savings"); //Withdrawal
		System.out.println(savings);
		System.out.println("");
		
		
		savings.deposit(14520);
		System.out.println("After Deposit in Savings");//Deposit in saving account
		System.out.println(savings);
		System.out.println("");
		
		
		current.withdraw(15640);
		System.out.println("After Withdrawal from Current");
		System.out.println(current);
		System.out.println("");

		current.withdraw(15640);
		System.out.println("After Deposit from Current");
		System.out.println(current);
		System.out.println("");
		
	}

}

