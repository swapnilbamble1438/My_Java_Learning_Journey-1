package DSA.A1_Array.A1_Linear_Search;

public class A9ii {

		
		public static void main(String[] args) 
		{
			
			int[] num = {12,345,2,6,7896};
			
			System.out.println(digits(-8));
			
			
			
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
			
			
			int result = (int)(Math.log10(n)) + 1;
			
				
			return result;
		}

		
		
	

}
