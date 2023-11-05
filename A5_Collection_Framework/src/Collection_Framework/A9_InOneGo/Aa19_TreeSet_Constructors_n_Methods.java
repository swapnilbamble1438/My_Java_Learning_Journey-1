package Collection_Framework.A9_InOneGo;

import java.util.TreeSet;

public class Aa19_TreeSet_Constructors_n_Methods {

	public static void main(String args[])
	{
		
		// TreeSet Constructors:
		// TreeSet()
		// TreeSet(Collection c)
		// TreeSet(Comparator comparator)
		// TreeSet(SortedSet s)
		
		TreeSet ts1  = new TreeSet();
		ts1.add(10);
		ts1.add(40);
		ts1.add(20);
		ts1.add(30);
		
		System.out.println(ts1); // it will give the result in sorted order
		
//		ts1.add("Swapnil"); // TreeSet does not allow different data-types
//		ts1.add("Yash");
//		ts1.add("Pratik");
//		System.out.println(ts1);
 
//      ts1.add(null); // 
		
		// ts1.clear(); //for clearing whole Collection data
		ts1.remove(40);
		
		System.out.println(ts1);
		
		
		
	}
}

// Here our Collection is over
