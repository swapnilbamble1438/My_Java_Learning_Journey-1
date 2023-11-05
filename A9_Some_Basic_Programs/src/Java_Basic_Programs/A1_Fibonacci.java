/*
 The Fibonacci numbers are the numbers in the 
 following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..


 */

package Java_Basic_Programs;

public class A1_Fibonacci {
	public static void main(String args[])
	{
	int n = 10; 
	int f = 0;
	
	int cf= 0;
	for(int i = 0,j = 1;  cf <= n-1; i++,j++)
	{
		f= i + j;
		System.out.print(i + " ");
		
		
		i=j-1;  // here we are taking i = j and then subtracting it from 1 because it is in loop it will get increase afterward by 1.
		j=f-1;   // same like above 
		 cf++;
		
	
	}
	System.out.println();
	System.out.print("These are the "+ cf + " Fibonacci numbers.");

	}
}
