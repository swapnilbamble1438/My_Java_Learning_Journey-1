package DSA.A1_Array.A1_Linear_Search;

import java.util.Arrays;

public class A3_Search_in_String {

	public static void main(String[] args) {
		 
		String name = "Swapnil";
		char target = '4';
		System.out.println(search2(name,target));
		
		System.out.println(Arrays.toString(name.toCharArray()));
	}

	static boolean search(String name, char target) {
		
		boolean f = false;
		
		if(name.length() == 0)
		{
			return f;
		}
		
		for(int i = 0; i < name.length(); i++)
		{
			if(target == name.charAt(i))
			{
				
				f = true;
			}
		}

		return f;
	}
	
	
	
static boolean search2(String name, char target) {
		
		boolean f = false;
		
		if(name.length() == 0)
		{
			return f;
		}
		
		
		for(char ch : name.toCharArray())
		{
			if(ch == target)
			{
				f = true;
			}
		}

		return f;
	}
}
