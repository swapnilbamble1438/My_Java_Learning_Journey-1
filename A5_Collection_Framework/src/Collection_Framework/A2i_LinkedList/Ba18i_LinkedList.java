/*
 Java LinkedList
In the previous chapter, you learned about the ArrayList class. 
The LinkedList class is almost identical to the ArrayList:
 */

package Collection_Framework.A2i_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;       // import the LinkedList class
public class Ba18i_LinkedList {
	
	public static void main(String args[])
	{
		LinkedList<String> cars = new LinkedList<String>();
		 cars.add("Volvo");
		 cars.add("BMW");
		 cars.add("Ford");
		 cars.add("Mazda");	
	   	
	   	 
	   	 
	   	 cars.addFirst("Mercedes"); // addFirst() method to add the item to the begining
	   	 System.out.println(cars);
	   	 
	   	 cars.addLast("Mercedes"); // addLast() method to add the item to the end
	   	 System.out.println(cars);
	   	 
	   	 cars.removeFirst();  // removeFirst() method to remove first item
	   	 System.out.println(cars);
	   	 
	   	 cars.removeLast();  // removeLast() method to remove last item
	   	 System.out.println(cars);
	   	 
	   	 System.out.println(cars.getFirst()); // getFirst() method to get the first item
	   	
	   	 System.out.println(cars.getLast()); // getLast() method to get the last item
	
	   	 
	   	 cars.set(1, "Porsche"); // set() method to update element
	   	 System.out.println(cars);

	}
	
}
