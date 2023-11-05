/*
 Buzz Number 
 Buzz number is a number that ends with digit 7
 or divisible by 7
 
 Example :
 1) 42 is a Buzz number because it is divisible by 7.
 2) 17 is a Buzz number because it ends with 7.
 3) 147 is a Buzz number because it ends with 7.
 */

package Java_Number_Programs;

import java.util.Scanner;

public class Aa15_Buzz_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		
		int num = no;
		
		int rem = 0;
		
		if(no % 7 == 0)
			System.out.println(num + " is a Buzz number.");
		
		else if(no % 10 == 7)
			System.out.println(num + " is a Buzz number.");
		else
			System.out.println(num + " is not a Buzz number.");
	}
}
