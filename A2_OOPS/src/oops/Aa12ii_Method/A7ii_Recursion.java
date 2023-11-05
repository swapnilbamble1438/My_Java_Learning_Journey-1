package oops.Aa12ii_Method;

public class A7ii_Recursion {

	public static int sum(int start, int end)
	{
		if(end > start)
		{
			return end + sum(start, end - 1);
		}
		else
		{
			return end;
		}
	}
	
	public static void main(String args[])
	{
		int result = sum(4,10);
		System.out.println(result);
	}
	
}
