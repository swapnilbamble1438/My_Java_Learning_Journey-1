package com;
/*Q) Top down Muncipality, is levying annual House Tax, as per
     following rules:
	Size of House in Sq.             House Tax rate per
            Metre                         Square Metre
       less than 100                          Nil
	   upto next 400                         Rs 10
       upto next 500                         Rs 20
       more than 1000                        Rs 25

      There is a Surcharge of 5% of the value of House Tax. Taking into
      account the above functions, draw a flow chart to compute appropriate
      total House Tax including Surcharge for any one house. */
//==========================================================================
import java.lang.String;
import java.util.Scanner;
class A8_Question
{
      public static void main(String args[])
     {
      Scanner sc = new Scanner(System.in); 

	System.out.print("Enter size of house in sqmt ");
	float sqmt = sc.nextFloat();

	float tax = 0f;
	
	if(sqmt >= 100 &&  sqmt < 500) 
		tax = sqmt * 10;

	else if(sqmt >= 500 && sqmt < 1000)
		tax = sqmt * 20;            
	
	else if(sqmt >= 1000)
		tax = sqmt * 25; 

	/* it can be also written in this way
	
	if(sqmt >= 100 && sqmt < 500)
		tax = sqmt * 10;
      else
	 {
	  if(sqmt >= 500 && sqmt < 1000)
		 tax = sqmt * 20;
	  else
	   {
	    if(sqmt >= 1000)
		tax = sqmt * 25;
	   }
	  } */
	

	float surcharge = tax * 0.05f;  // here 0.05 is 5%
	
	System.out.println("Surcharge " + surcharge);

	System.out.println("Final Amount to be paid " + (tax + surcharge));
	}
}