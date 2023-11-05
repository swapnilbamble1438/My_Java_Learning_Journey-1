package Collection_Framework.A9_InOneGo;

import java.util.Vector;

public class Aa13ii_Example1 {
	
	public static void main(String[] args) {
		
	//There are four types of constructors in vector
		
	// 1) Vector(): Constructs an empty vector so that
	//	         its internal data array has size 10
	//               and its standard capacity increment is zero.	
		
	// 2) Vector(Collection c): Constructs a vector containing 
	//                          the elements of the specified collection, 
        //                          in the order they are returned by the 
	//                          collection's iterator.
		
	// 3) Vector(int initialCapacity): Constructs an empty vector 
        //	                           with the specified initial capacity and 
	//	                           with its capacity increment equal to zero.
	
		
	// 4) Vector(int inititalCapacity,int capacityIncrement):
	//
        //    Constructs an empty vector with the specified 
        //    initial capacity and capacity increment.
        //    Parameters:
        //    initialCapacity: the initial capacity of the vector 
        //    capacityIncrement: the amount by which the 
        //                       capacity is increased when the vector overflows
		
		Vector v = new Vector();
		v.add(100); // it is from Collection interface
		v.add(1,"Swapnil");  // it is from list interface
		v.addElement("Mumbra"); // it is from vector class
		v.add("Mumbra");
		v.add(null);
		v.add(null);
		System.out.println(v);
		
		v.removeElement("Mumbra");
		System.out.println(v);
		
		System.out.println(v.capacity()); // by default it capacity will be 10
		
		v.setElementAt("updated", 2);
		System.out.println(v);
		
		
		
		
	}

}
