package Collection_Framework.A2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A9_Example1 {

	public static void main(String[] args) {
		
		// three types of constructors in arraylist
		
		// 1)ArrayList() constructor
		ArrayList al1 = new ArrayList();// if we use this constructor of arraylist 
		   // it will create arraylist whose initial capacity
		// to store element will be 10 
		// and its size will be zero because it is empty
	
				al1.add(10);   
				al1.add("Swapnil");
	
				
	System.out.println("==========================================================================");			
				
				// 2) ArrayList(int capacity) constructor
				ArrayList al2 = new ArrayList(6);// in this constructor, 
				// capacity to store elements will be 6
				// and size will be zero
				
				al2.add(20);  // adding data
				al2.add("Yash");  //it is index base DataStructure
				
				al2.add("Yash"); // also duplicate values are allowed
				al2.add(null);
				al2.add(null); // multiple null values are allowed
				al2.add(5);  // does not follow sorting order
				
				al2.addAll(al1); // can also add all elements of other arraylist
				System.out.println(al2);
				al2.remove("Yash");
				
				System.out.println(al2);
				System.out.println(al2.contains(5)); // it will check whether the element is present or not
				System.out.println(al2.size());
				System.out.println(al2.get(1));
				al2.set(1, "Updated");
				System.out.println(al2);
				System.out.println(al2.indexOf("Updated"));
		
	System.out.println("==========================================================================");			

				
		// 3) ArrayList(Collection c) constructor
		ArrayList al3 = new ArrayList(al2); // this is Collection constructor 
		// use to store whole data of another 
		// arraylist in itself
		
		System.out.println(al3);
		
		// Using Iterator
	    Iterator itr =	al3.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		
		al3.removeAll(al2);
		System.out.println(al3);
		
		
	}
}
