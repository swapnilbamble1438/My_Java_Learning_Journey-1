package Collection_Framework.A1_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A1_List {
	
	public static void main(String[] args) {
		
		 // Creating an object of List interface
        // implemented by the ArrayList class
		List<Integer> list = new ArrayList<Integer>();
		
		// Adding elements to object of List interface
		// Custom inputs
		list.add(0,1);
		list.add(1,2);
		
		
		//add list elements through index
		list.add(2,3);
		
		// remove list elements through index
		list.remove(2);
		
		//update elements
		list.set(1, 10);
		
		// view specific element using get() method
		System.out.println(list.get(1));
		
		// adding multiple elements at a time using Collections
		Collections.addAll(list, 3,4,5,6,7,8,9);
		
		System.out.println(list);
		
	
		
		
		
		
		
	}

}
