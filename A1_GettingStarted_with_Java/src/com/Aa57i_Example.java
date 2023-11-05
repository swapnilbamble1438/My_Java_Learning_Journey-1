package com;
/*
   Single Inheritance
   In single inheritance, a sub-class is derived from only one super class.
   It inherits the properties and behaviour of a single-parent class.
   Sometimes it is also known as simple inheritance.
 */
    
class Employee
{
	int salary = 34534;
}

public class Aa57i_Example extends Employee
{
	int bonus = 3000;
	
	public static void main(String args[])
	{
		Aa57i_Example obj = new Aa57i_Example();
		
		System.out.println("Total salary credited: " + obj.salary);
		
		System.out.println("Bonus of six months: " + obj.bonus);
		
	}

}
