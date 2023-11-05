package DSA.A1_Array.A1_Linear_Search;

// find numbers of digits in given number

public class A9_find_num_of_digits_in_num {


	public static void main(String[] args) {
		
		int[] num = {12,345,2,6,7896};
		
		System.out.println(digits(0));
		
		
		
	}


	
	static int digits(int n) 
	{
		
		if(n < 0)
		{
			n = n * -1;
		}
		
		if(n == 0)
		{
			return 1;
		}
		
		int count = 0;
		
		while(n>0)
		{
			n = n / 10;
			count++;
		}
		
			
		return count;
	}

	
}
