package DSA.A1_Array.A1_Linear_Search;

// find numbers which have even digits

public class A8_find_num_with_even_num_of_digits_in_array {
	
	public static void main(String[] args) {
		
		int[] num = {12,345,2,6,7896};
		
		System.out.println(findNumbers(num));
		
		
		
	}

	static int findNumbers(int[] num)
	{
		int count = 0;
		for(int n : num)
		{
			if(even(n))
			{
				count++;
			}
		}
		
		return count;
	}

	static boolean even(int n) 
	{
		
		boolean f = false;
		int c = 0;
		
		while(n>0)
		{
			n = n/10;
			c++;
		}
		if(c % 2 == 0)
		{
			f = true;
		}
			
		return f;
	}
}
