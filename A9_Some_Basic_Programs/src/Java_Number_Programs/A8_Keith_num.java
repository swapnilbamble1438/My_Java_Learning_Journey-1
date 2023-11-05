/*
 Keith Number Example:
 Example 1)		           Example 2)
 	 19                       742
   1  9 				   7   4   2
  1 + 9 = 10  		     7 + 4 + 2 = 13
 9 + 10 = 19			4 + 2 + 13 = 19
 19					   4 + 2  + 19 = 34
					   2 + 19 + 34 = 66
					  19 + 34 + 66 = 119
					  34 + 66 + 119 = 219
					  66 + 119 + 219 = 404
					  119 + 219 + 404 = 742
					           742
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A8_Keith_num{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a three digit number: ");
		int no = sc.nextInt();
		
		int num = no;
		int rem = 0;
		int sum = 0;
		int f,i,j,k = 0;
		for(int m = 0; m <= no; m++)
		
		while(no > 0)
		{
			rem = no % 10;
			f = rem;
			sum = sum + rem;
			no = no / 10; 
			k = f;
			
			
		}
		System.out.println(sum);
		 
		
		 
		 
		 
		 
		 
		 
	}
}
