package DSA.A1_Array.A1_Linear_Search;

// check if number exist or not in array
public class A2_linearSearch_using_foreach {

public static void main(String[] args) {
		
		int[] num = {23,45,1,2,8,19,-3,16,-11,28};
		
		int target = 193;
		boolean ans = linearSearch(num,target);
		
		System.out.println(ans);
	}
	
static boolean linearSearch(int[] num,int target)
{
	 boolean f = false ;
	
	if(num.length == 0)
	{
		return false;
	}
	
	for(int elem : num)
	{
		
		if(elem == target)
		{
			f = true;
		
			
		}
	
	
	}
	
		return f;
	
}

}
