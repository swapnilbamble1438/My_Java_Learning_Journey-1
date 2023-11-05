/*
 
 */

package Java_Basic_Programs;
// Find if a Given Number is Prime Number or not

import java.util.Scanner;
class A2_Prime_number
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Number ");
	int no = sc.nextInt();

	// start dividing given number from 1 upto given number
	// if number of divisors are only two then given 
	// number is Prime number

	int nodiv = 0; // nodiv is used for storing number of divisors
	
	for(int i = 1; i <= no; i ++)
	{
			if(no % i == 0)
			      nodiv ++;
		
	}
	 System.out.println("Number of Divisors are " + nodiv);
	
	 if(nodiv == 2)
		System.out.println("It is a Prime Number.");
	 else
		System.out.println("It is not a Prime Number.");
    }
}