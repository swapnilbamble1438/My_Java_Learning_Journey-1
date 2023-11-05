package Collection_Framework.A5_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Aa17_HashSet_Practical_Example1 {
	
	public static void main(String args[])
	{
		
		// HashSet constructors
		// 1) HashSet()
		// 2) HashSet(Collection c)
		// 3) HashSet(int initialCapacity)
		// 4) HashSet(int initialCapacity,float loadFactor)
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add("Swapnil");
		hs.add("Mumbra");
		hs.add("Mumbra"); // Duplicate elements are not allowed
		hs.add(null);
		hs.add(null); // multiple null values are not allowed 
		hs.add(30);
		hs.add(20); // does not support sorting order
		
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		
		hs.addAll(al);
		
		System.out.println(hs);// does not follow insertion order
		
		System.out.println();
		
		// using iterator
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		System.out.println(hs.contains("two"));
		System.out.println(hs.size());
		
		
		
		
	}

}
