/*
 Fascinating number Example:
 Num = 327
 327 * 2 = 654
 327 * 3 = 981
 Now concatenate the above results
 "327" + "654" + "981" = 327654981
 we observe that the result contains all the digits from
 1 to 9, Hence it is a fascninating number. 
 */

package Java_Number_Programs;

import java.util.Scanner;

public class A7_Fascinating_num {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Three Digit Number: ");
		int no = sc.nextInt();
		
		int no2 = no * 2;
		
		int no3 = no * 3;
		
		String s = "" + no + no2 + no3;
		
		int count = 0;
		for(char c = '1' ; c <= '9'; c++)
		{
			int countin = 0;
			for(int i = 0; i< s.length(); i++)
			{
				
				
				char ch = s.charAt(i);
			
				if(ch == c)
					countin ++;
			
			}	
			if(countin == 0)
			{
				// System.out.println("It is Not a Fascinating Number.");
				break;
			}
			
			if(countin == 1)
			{
				count ++;
			}
			
			
		}
		if(count == 9)
			System.out.println("It is a Fascinating Number.");
		else 
			System.out.println("It is Not a Fascinating Number.");
		
	
		
	}
}
