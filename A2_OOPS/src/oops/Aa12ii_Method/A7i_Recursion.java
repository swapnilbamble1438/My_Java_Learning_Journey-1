package oops.Aa12ii_Method;

public class A7i_Recursion {
	
	static int sum(int k) 
	{
		if(k > 0)
		{
			return k + sum(k - 1);
		}
		else
		{
			return 0;
		}
	}

	public static void main(String args[])
	{
		int result = sum(10);
		System.out.println(result);
	}
}

 /*
  Example Explained
When the sum() function is called, it adds parameter k to the sum of 
all numbers smaller than k and returns the result. When k becomes 0, 
the function just returns 0. When running, the program follows
these steps:

10 + sum(9)
10 + ( 9 + sum(8) )
10 + ( 9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
Since the function does not call itself when k is 0, 
the program stops there and returns the result.
  */
