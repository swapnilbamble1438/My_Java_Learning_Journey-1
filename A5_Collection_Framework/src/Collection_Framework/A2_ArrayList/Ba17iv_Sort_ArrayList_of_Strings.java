package Collection_Framework.A2_ArrayList;

import java.util.ArrayList;
import java.util.Collections; // Import the Collections class

public class Ba17iv_Sort_ArrayList_of_Strings {
	
	public static void main(String args[])
	{
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    Collections.sort(cars); // Sort cars
	    
	    for(String i : cars) {
	    	System.out.println(i);
	    }
	}
}
