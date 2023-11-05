package Collection_Framework.A2i_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Ba18ii_iterating {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		Collections.addAll(ll, "Swapnil","Yash","Pratik","Nitin","Deepak");
		
		System.out.println(ll);
		
		// for loop
		for(int i = 0; i< ll.size(); i++)
		{
			System.out.print(ll.get(i) + " ");
		}
		
		System.out.println();
		
		//for each
		for(String str : ll)
		{
			System.out.print(str + " ");
		}
		
		
		
	}

}
