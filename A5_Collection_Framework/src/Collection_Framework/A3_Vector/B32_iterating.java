package Collection_Framework.A3_Vector;

import java.util.Collections;
import java.util.Vector;

public class B32_iterating {

	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		
		Collections.addAll(v, "Swapnil","Yash","Omkar","Pratik");
		
		// using for loop for iterating
		for(int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println();
		
		// using for each loop for iterating
		for(String str : v)
		{
			System.out.print(str + " ");
		}
		
		
	}
	
}
