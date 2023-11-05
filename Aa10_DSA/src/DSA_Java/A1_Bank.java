package DSA_Java;

 class BankAccount {
	
	private double balance;  // account balance
	
	public BankAccount(double openingBalance) // constructor
	{
		balance = openingBalance;
	}
	
	public void deposit(double amount) // makes deposit
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public void display()  // display balance
	{
		System.out.println("balance: " + balance);
	}

}
 //------------------------------------------------------------------
 public class A1_Bank
 {
	 public static void main(String[] args) {
		
		 BankAccount bal = new  BankAccount(100.00); //  creating account
		 
		 System.out.println("Before Transaction, ");
		 bal.display();    // display balance
		 
		 bal.deposit(74.35);    // make deposit
		 bal.withdraw(20.00);   // make withdrawal
		 
		 System.out.println("After Transaction, "); 
		 bal.display();
		 
		 
		 
	}
 }
