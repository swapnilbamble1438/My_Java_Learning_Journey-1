package DSA.A1_Array.A1_Linear_Search;

// find which row elements has the max total

public class Aa10_find_which_row_elements_has_max_total {
	
	public static void main(String[] args) 
	{
		int[][] accounts = {
				{1,2,3},
				{2,3,5}
		};
		
		// here first row means first customer account
		// so 1 + 2 + 3 = 6
		// and second customer total
		// 2 + 3 + 5 = 10
		
		
		System.out.println(maxwealth(accounts));
		
	}
	
		public static int maxwealth(int[][] accounts)
		{
			int ans = 0;
			int row = 0;
			for(int person = 0; person < accounts.length; person++)
			{
				int max = 0;
				// when you start a new col, take a
				// new sum for that row
				for(int account = 0; account < accounts[person].length;account++)
				{
					max += accounts[person][account];
				}
				
					if(max > ans)
					{
						ans = max;
						row = person + 1;
					}
					
			}
			System.out.println("at " + row + " row total value is max");
			return ans;
			
		}

}
