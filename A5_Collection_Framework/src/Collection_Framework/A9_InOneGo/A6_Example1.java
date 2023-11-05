package Collection_Framework.A9_InOneGo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A6_Example1 {
	
	public static void main(String[] args) {
		
		// Iterator
		
		List l = new ArrayList();
		l.add("Swapnil");
		l.add("Bamble");
		l.add("Mumbra");
		l.add("Developer");
		
	 Iterator itr =	l.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
	 l.remove("Developer");
	 System.out.println(l);
	 
	
	 
	 System.out.println("===========================================================================");
		
		// ListIterator
	 
	 List l2 = new ArrayList();
	 l2.add("Yash");
	 l2.add("More");
	 l2.add("Thane");
	 
	 
	 ListIterator litr = l2.listIterator(); 
//	 while(litr.hasNext()) {                    //_____ 
//		 System.out.println(litr.next());   //     |--You can use this way 
//		                                    //     |
//	 }                                          //     |
	                                            //     |
	 litr.next();                               //     |--or You can use this way 
	 litr.next();                               //_____|     for moving cursor to next index or last index
	 litr.next();                               //  
	 
	     System.out.println();                   // when we directly try to traverse elements using previous()
	 while(litr.hasPrevious()) {                 // it will show nothing
		 System.out.println(litr.previous());// because its cursor is present already at index one
		                                     // so we have to first move cursor to last index
	 }                                           // so first before using previous() we have to use next()
	
	 
	 
	 litr.set("Updated");      // it will update the value of element of index 
	System.out.println(l2);    // at which cursor is present
	 
	 
	 
	}
	

}
/*
output:   Swapnil
          Bamble
          Mumbra
          Developer
          [Swapnil, Bamble, Mumbra]
          ===========================================================================

          Thane
          More
          Yash
          [Updated, More, Thane]

*/
