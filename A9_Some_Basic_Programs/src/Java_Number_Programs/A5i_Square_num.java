package Java_Number_Programs;

import java.util.Scanner;

public class A5i_Square_num {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int no = sc.nextInt();
		
		for(int i = 1; i<= no; i++)
		{
			if(i * i == no)
			{
				System.out.println("It is a Square Number");
				break;
			}
			
			else if (i * i != no && i == no)
			{
				System.out.println("It is not a Square Number");
				break;
			}
		}
		
	
	}
}
