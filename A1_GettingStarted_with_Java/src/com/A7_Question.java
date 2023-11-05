package com;
/*Q) A book publisher of Information Technology offers discount
      to its customers on the basis of customer type as detailed
      below:
      Customer Type           Discount
      Book Seller               30%
       Library                  20%
      Student                   10%

      Further if number of copies purchased is more than 20, then 
      additional discount of 5% is allowed irrespective of customer type
      Number of books, unit price of each book and customer type are given
      as input.
      Draw a flow chart to calculate the net amount after all discount
      and print customer type, number of copies and net amount. */


//==========================================================================

import java.lang.String;
import java.util.Scanner;
class A7_Question
{ 
	public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Customer Type (1 for Book Seller) (2 for Library) (3 for Student) ");
	float ct = sc.nextFloat(); // ct for Customer Type

	System.out.print("Enter Number of Copies ");
	float nc = sc.nextFloat(); // nc for number of copies

	System.out.print("Enter Unit Price ");
	float up = sc.nextFloat(); // up for Unit Price of each book

	float ga = nc * up; // ga for Gross Amount of Books purchase by Customer
	
	float dis = 0f; // ds for Discount and 0 is taken as initial discount
	
	if(ct ==1f)              // If customer is type 1 (Book Seller)
		dis = ga * 0.30f;  // calculating normal discount of customer type 1

	else if(ct == 2f)
		dis = ga * 0.20f;

	else
		dis = ga * 0.10f;

	if(nc > 20f)                // if no of copies is more than 20 than 5% discount increases
		dis = dis +(ga * 0.05f); // here 0.05 is 5%
      
	// Now displaying output

	System.out.println("Number of Copies " + nc);
	
	if(ct == 1)
		System.out.println("Customer Type Book Seller");
	else if(ct == 2)
		System.out.println("Customer Type Library");
	else if(ct == 3)
		System.out.println("Customer Type Student");
	
	System.out.println("Net Amount " + (ga - dis));
	}
}
        
	
	

 	
	