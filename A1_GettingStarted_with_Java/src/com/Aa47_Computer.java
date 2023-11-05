package com;
public class Aa47_Computer
{
	Aa47_Computer()
	{
		System.out.println("Constructor of Computer class. ");
		
	}
	void show() // we can also write "void show()"
	{
		System.out.println("Computer Battery is about to run out. ");
		
	}
	public static void main(String[] args) 
	{
		Aa47_Computer c= new Aa47_Computer(); 
		Laptop l = new Laptop();
		
		c.show(); 
		l.show();
		
	}
}
	 class Laptop
	 {
		 Laptop()
	 {
		 System.out.println("Constructor of Laptop class. ");
		 
	 }
	 void show()
	 {
		 System.out.println("Laptop has 99% Battery available. ");
	 }
	 }


