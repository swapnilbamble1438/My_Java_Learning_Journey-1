package com;
/* Q) The Income-Tax for the employees of an organization is calculated on the basis
      of their Gross Income and the Investments made by them under Section 80CCC.
      The taxable income is calculated according to the following rules:
     
      if provided Investments are less than 1 lac then
	Taxable Income = Gross Income - Investments
                        
	otherwise
	Taxable Income = Gross Income - 100,000
      Following rules are applied to calculate the Income-Tax, on the Taxable Income:
	Taxable Income                Income-Tax
     i) 0 - 1,60,000                 Nil
    ii) 1,60,01 - 3,00,000           10% on the excess of 1,60,000
   iii) 3,00,001 - 5,00,000          14,000 + 20% on the excess of 3,00,000
    iv) 5,00,001 and above           54,000 + 30% on the excess of 5,00,000
		
	Also an educational cess of 3% of Income-Tax is levied on all emmployees,
	irrespective of the income.
	Employee number, Name, Gross Income, Investment Amount is given as input.
	Draw a flow chart to calculate the Income-Tax payable by each employee. */
//====================================================================================

import java.lang.String;
import java.util.Scanner;
class A9_Question
{
      public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in); 
	
	System.out.println("Enter Employee Number ");
	float empno = sc.nextFloat();

	System.out.println("Enter Gross Income ");
	float gi = sc.nextFloat();   // gi = Gross Income

	System.out.println("Enter Investment "); 
	float inv = sc.nextFloat();   // inv = Investment Amount

	float ti = 0f;  // ti = Taxable Income

	if(inv < 100000f)
		ti = gi - inv;
	else
		ti = gi - 100000f;

	float it = 0f;  // it = Income Tax

	
	if(ti < 160000)
		it = 0f;

	else if(ti >= 160001 && ti <= 300000)
		it = (ti - 160000) * 0.10f;

	else if(ti >= 3000001 && ti <= 500000)
		it = ((ti - 300000) * 0.20f) + 14000f;

	else
		it = ((ti - 500000) * 0.30f) + 54000f;

	float et = 0f; // et = Educational Tax
	
	et = ti * 0.03f;

	System.out.println("Taxable Income is " + ti);

	System.out.println("The Income Tax is " + it);

	System.out.println("The Educational Tax is " + et);

	System.out.println("The Final Tax Amount is " + (it + et));

	} 
}