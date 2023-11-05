package Collection_Framework.A7iii_TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class Aa24_TreeMap_Constructors_n_Methods {

	public static void main(String[] args) {
		
	
		
		// using default constructor
		TreeMap tm = new TreeMap();
		
		tm.put(106, "Swapnil");
		tm.put(103, "Yash");
		tm.put(107, "Pratik");
		tm.put(102, "Deepak");
		tm.put(108, "Omkar");
		tm.put(101, "Zurez");
		
		System.out.println(tm); // it will give result in sorted order
		                        // Default sorting order
		
		System.out.println(tm.ceilingEntry(104)); // it will give the entry with Key=103 if present
									//else it will give the entry with Key > 103
		
		System.out.println(tm.ceilingKey(104));
		
		System.out.println(tm.floorKey(105));
		
		
		// tm.clear(); // clear whole TreeMap
		
		System.out.println(tm.containsKey(103));
		System.out.println(tm.containsValue("Raj"));
		
		System.out.println(tm.firstEntry());
		
		Set set =  tm.entrySet();
		
		System.out.println(set); // it will return the result in set format with square bracket
		
		System.out.println(tm.keySet());
		
		System.out.println(tm.get(107)); // if value is not present then it will return null value
	
		System.out.println(tm.headMap(103));
		
		System.out.println(tm.higherKey(103)); // it will return greater than given key
				
		System.out.println(tm.pollFirstEntry()); // it will remove the first entry
		System.out.println(tm);
		
		System.out.println(tm.pollLastEntry()); // it will remove the last entry
		System.out.println(tm);
		
		tm.remove(102);
		System.out.println(tm);
		
		tm.replace(107, "Jayesh");
		System.out.println(tm);
		
		System.out.println(tm.size());
		
		System.out.println(tm.subMap(103, 106));// it will return the submap between given Key
		 
		
		
		
	}
}
