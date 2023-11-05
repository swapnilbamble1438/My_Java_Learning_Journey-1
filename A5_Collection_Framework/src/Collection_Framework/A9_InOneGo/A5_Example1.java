package Collection_Framework.A9_InOneGo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class A5_Example1{
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("Swapnil");
		l.add(1,"Mumbai");  // here 1 is the index
		  // and no need to mention index while
		 // adding elements in list it will automatically
		// add element
	
		
		// It follows insertion order
		// means it display the elements in same order
		// as same as we inserted elements
		
		l.add("Mumbai"); // it will store duplicate elements
		l.add(null);
		l.add(null); // it will store multiple null values
		
		System.out.println(l);
		
		 Iterator itr =  l.iterator();
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
		
//		ListIterator litr = l.listIterator();
//		while(litr.hasNext());
//		{
//			System.out.println(litr.next());
//		}
		
		System.out.println("=============================================================");
		
		Set s = new HashSet();
		s.add("Yash");
		s.add("Thane");
		s.add("Thane");  // it will not store duplicate elements
		l.add(null);
		l.add(null); // it will store one null value
				
		System.out.println(s);
		
		 Iterator itr2 =  s.iterator();
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }
		
		
		
	}

}
