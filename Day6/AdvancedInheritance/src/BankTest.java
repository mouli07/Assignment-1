
public class BankTest {

	public static void main(String[] args) {
		
		MMBankFactory alfaiz = new MMBankFactory();
		
		MMBankFactory saif = new MMBankFactory();
		
		SavingAcc alfaizSavings = alfaiz.getNewSavingAccount("Alfaiz", 15200, 54000, true);//initailization of saving account
		System.out.println("After Initialization");
		System.out.println(alfaizSavings);
		System.out.println("");
		
		
		CurrentAcc saifCurrent = saif.getNewCurrentAccount("saif", 15420, 54796, 10000);//initailization of Current account
		System.out.println("After Initialization");
		System.out.println(saifCurrent);
		System.out.println("");
		
		
		alfaizSavings.withdraw(42000);
		System.out.println("After Withdrawal from savings"); //Withdrawal
		System.out.println(alfaizSavings);
		System.out.println("");
		
		
		alfaizSavings.deposit(14520);
		System.out.println("After Deposit in Savings");//Deposit in saving account
		System.out.println(alfaizSavings);
		System.out.println("");
		
		
		saifCurrent.withdraw(15640);
		System.out.println("After Withdrawal from Current");
		System.out.println(saifCurrent);
		System.out.println("");

		saifCurrent.withdraw(15640);
		System.out.println("After Deposit from Current");
		System.out.println(saifCurrent);
		System.out.println("");
		
	}

}
