package Collection_Framework.A2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ba17ii_Loop_through_an_ArrayList {

	public static void main(String args[])
	{
		ArrayList<String> cars = new ArrayList<String>(); // create an ArrayList object
	
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(int i = 0; i < cars.size(); i++)
		{
			System.out.println(cars.get(i));
		}
		
		
		System.out.println("==========================================");
		
		// You can also loop through an ArrayList with the for-each loop:
		
		// Traversing from for each loop
		for(String i : cars) {
			System.out.println(i);
		}
		
		System.out.println("==========================================");

		
		// Traversing from ITERATOR
		
		Iterator<String> itr = cars.iterator();
		
		while(itr.hasNext())
		{
			String next = itr.next();
			System.out.println(next);
		}
		
		
		System.out.println("==========================================");

		// Traversing from ListIterator
		ListIterator<String> litr = cars.listIterator();
		// use Previous instead of Next to get reverse
		
		while(litr.hasNext())
		{
			String next = litr.next();
			System.out.println(next);
		}
		
		System.out.println("========Enumeration For Each Method ================================");
		
		// Enumeration
		// for each method
		
		cars.forEach(e->{
			System.out.println(e);
		});
		
		
	}
}
