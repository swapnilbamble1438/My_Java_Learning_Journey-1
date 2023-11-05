package DSA.A4_Recursion;

import java.util.Scanner;

public class A4ii_nth_Fibonacci_num {

	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter which fibonacci num you want: ");
	int n = sc.nextInt();
	
	 find(n,0,0,1,1);
	
	

	}
	
	public static void find(int n,int f,int i,int j,int count)
	{
		
	
		if(count <= n)
		{
			
			f = i + j;	
		
				if(count == n)
				{
			
					System.out.println(n+"th fibonnacci num is: " + i);
	
				}
			
		//	System.out.print(i + " ");
			
			i = j;
			j = f;	
			
			count++;
			
			find(n,f,i,j,count);
				
		}
			
		
		
		
			
		
		
	}

	
}
