package Collection_Framework.A1_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2_iterating {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		Collections.addAll(list, "Swapnil","Pratik","Yash","Deepak","Omkar","Jeevan");
		
		System.out.println(list);
		
		// using for loop for interation
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		// using for-each loop for iteration
		for(String str : list)
		{
			System.out.print(str + " ");
		}
		
		
		
		
	}

}
