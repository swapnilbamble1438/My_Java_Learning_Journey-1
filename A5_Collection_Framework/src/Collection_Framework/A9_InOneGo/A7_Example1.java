package Collection_Framework.A9_InOneGo;

import java.util.Enumeration;
import java.util.Vector;

public class A7_Example1 {
	
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(10);
		v.add("Swapnil");
		v.add(20.5);
		
		// retriving elements in vector 
		// using enumeration 
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
	}

}
