package com;
/*
 Q)Define a class which has three function with the same
   name "Square".
   []The First function Will take a value as an argument.
   []The Second function will take reference as an argument.
   []And The Third function will take out parameter as an
     argument to the function.
   []Use main method to call all the functions. 
 */

class Aa54_val_ref_par
{    
	
		int a= 10;
		Aa54_val_ref_par()
		{
		  a=change(a);	
		}
		 int change(int x)
		 {
			 x = 1;
			 return x;
		 }
		 void display()
		 {
			 System.out.println("a after "+ a);
		 }
		 public static void main(String args[])
		 {
			 Aa54_val_ref_par q = new Aa54_val_ref_par();
			 q.display();
			 
		 }
		
}
