package com;
/*
Q) Design a class to represent a bank account, include
the following members:
Data members:
i. Name of the depositor.
ii. Account number.
iii. Type of account.
iv. Balance amount in the account.
Methods:
i. To assign initial values.
ii. To deposit an amount.
iii. To withdraw an amount after checking balance.
iv. To display the name and balance.
Create one bank account to implement the above methods.

==============================================================*/

class Bank
{
	String dname;
	int accno;
	String actype;
	int balance;
	Bank()
	{
		dname="No name";
		accno= 420;
		actype= "Saving";
		balance= 0;		
		}
	Bank(String dname, int accno, String actype, int balance)
	{
		this.dname= dname;
		this.accno = accno;
		this.actype = actype;
		this.balance = balance;		
	}
	public void deposit(int amount)
	{
		this.balance += amount;
	}
	public void withdraw(int amount)
	{
		if(amount > balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			this.balance -= amount;
		}
		
	}
	public void display()
	{
		System.out.println("Depositor Name is " + dname);
		
		System.out.println("Balance Amount " + balance);
		
	}
	
}
class Aa52_Bank
{
	public static void main(String args[])
	{
		Bank b1 = new Bank("Komal", 24, "Saving", 50000);
		
		b1.deposit(5000);
		System.out.println("After deposit");
		b1.display();
		
		b1.withdraw(75000);
		System.out.println("After withdraw");
		b1.display();
		
		b1.withdraw(7850);
		System.out.println("After withdraw");
		b1.display();
		
		
	}
}