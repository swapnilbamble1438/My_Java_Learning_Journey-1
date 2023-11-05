package DSA.A1_Array.A1_Linear_Search;

public class A4_Range_search {
	
	public static void main(String[] args) {
		
		
int[] num = {23,45,1,2,8,19,-3,16,-11,28};
		
		int target = 19;
		int ans = linearSearch(num,target, 3,7);
		
		System.out.println(ans);
	}
	


	static int linearSearch(int[] num,int target,int start, int end)
	{
		if(num.length == 0)
		{
			return -1;
		}
		int index = -1;
		
		for(int i = start; i <= end; i++)
		{
			int element = num[i];
			
			if(element == target)
			{
				index = i;
				
			}
		
		
		}
		
			return index;
		
	}
		
	

}
