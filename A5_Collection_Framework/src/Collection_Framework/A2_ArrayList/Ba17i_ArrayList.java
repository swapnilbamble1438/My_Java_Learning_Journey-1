package Collection_Framework.A2_ArrayList;

import java.util.ArrayList; ///import the ArrayList class
import java.util.Collections;
public class Ba17i_ArrayList {
	
	public static void main(String args[])
	{
		ArrayList<String> cars = new ArrayList<String>(); // create an ArrayList object
	
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		Collections.addAll(cars, "E","F","G","H");

		
		cars.get(0);        // to access an item
		cars.set(1,"Opel"); // to change an item
		cars.remove(2);     // to remove an item at index
	//	cars.clear();       // to remove all items
		cars.size();        // to get the ArrayList Size
		System.out.println(cars);
	}
	
}
