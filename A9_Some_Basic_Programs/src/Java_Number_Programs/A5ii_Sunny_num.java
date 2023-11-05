/*
 Sunny number
 A number N will be a sunny number if N+1 
 is a perfect square.
 
 Example:
 Num = 80 
 80 + 1 = 81 which is square of 9 
 hence 80 is a sunny number.
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A5ii_Sunny_num {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int no = num + 1;
		
		for(int i = 1; i<= no; i++)
		{
			if(i * i == no)
			{
				System.out.println("It is a Sunny Number");
				break;
			}
			
			else if (i * i != no && i == no)
			{
				System.out.println("It is not a Sunny Number");
				break;
			}
		}
	
	}
}
