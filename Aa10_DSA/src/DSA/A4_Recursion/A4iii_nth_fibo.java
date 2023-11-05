package DSA.A4_Recursion;

import java.util.Scanner;

public class A4iii_nth_fibo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter which fibonacci number you want:");
		int num = sc.nextInt();
		
		
		
		System.out.println(fibo(num-1));
	}
	
	static int fibo(int n) {
		
		
		
		if(n <= 1) {
		//	System.out.println("n: "+n + " in if condition");
			return n;
		}
//		else
//		{
//				System.out.println("n: " + n);
//		}
//		
//		
//		int n_minus_1 = n-1; int n_minus_2 = n-2;
//		System.out.println("fibo(" + n_minus_1 + ") + fibo("+ n_minus_2 + ") :" + (fibo(n_minus_1) + fibo(n_minus_2)) );
		return fibo(n-1) + fibo(n-2);
	}

}
