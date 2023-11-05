package Collection_Framework.A7ii_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Aa22_HashMap_Constructors_n_Methods {

	
	public static void main(String args[])
	{
		//HashMap Constructors
		// 1) HashMap()
		// 2) HashMap(int initialCapacity): HashMap capacity
		//      means the number of buckets in the hash table
		//      (Note that, HashMap underline data-structure is
		//      hash table).
		//      When we create HashMap, initialCapacity will be
		//      16 which we can changed
		// 3) HashMap(Map m)
		// 4) HashMap(int initialCapacity,float loadFactor):
		//      Load Factor is a threshold, When we add the
		//      elements in HashMap and it crosses this threeshold
		//      then the capacity of HashMap will get increased.
		//      Default load factor of HashMap is 0.75
		
		
		HashMap<Integer,String> hm = new HashMap(); 
		hm.put(101, "abc");
		hm.put(102, "pqr");
		hm.put(103, "xyz");
		
		hm.put(101, "jkl"); // Duplicate Key is not allowed
		                   // but if you try to do it 
						   // then the old Key value will be 
						   // updated with the new Key value
		//m.clear();
		
		System.out.println(hm);
		
		
		// We can retrieve HashMap elements by 2 ways:
				// 1. Using Set and Iterator interface
				// 2. Directly i.e. without using Set & 
				//    Iterator interface
				// NOTE: In both cases we use Map.Entry interface
				
				Set set =  hm.entrySet();
				System.out.println(set); // it will return the value in set form with square bracket
				
				System.out.println();
				
				Iterator itr = set.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println();
				
				
				// getting only Keys or values
				Iterator itr2 = set.iterator();
				while(itr2.hasNext())
				{
					Map.Entry entry = (Entry) itr2.next();// it will cast set object into Entry
					System.out.println("Key: "+ entry.getKey() + " , Value: "+ entry.getValue());
				}
				
				System.out.println();
				
				// New way of traversing HashMap
				for(Map.Entry me: hm.entrySet()) // providing generic next to HashMap will resolve the error just like we provide in hm
				{
					System.out.println(me.getKey() + " -> " + me.getValue());
				}
				
		
		System.out.println();
		
		
		HashMap hm2 = new HashMap();
		hm2.put("Name","Swapnil");
		hm2.put("City","Mumbra");
		hm2.put("Pincode","400612");
		hm2.put("Name2", "Swapnil");
		hm2.put(null,null);
		hm2.put(null,"aaa"); // multiple null values are not allowed
		hm2.putAll(hm);
		
		System.out.println(hm2);
		
		System.out.println();
		
		System.out.println(hm2.containsKey(103));
		
		System.out.println(hm2.containsValue("Mumbra"));
		
		System.out.println(hm.get(102));
		
		System.out.println(hm2.isEmpty());
		
		hm2.remove("Name2");
		
		System.out.println(hm2);
		
		hm2.replace("Pincode", "123456");
		
		System.out.println(hm2);
		
		System.out.println(hm2.size());
		
		
	}
	
	
}
