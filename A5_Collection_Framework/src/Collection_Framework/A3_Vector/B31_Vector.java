package Collection_Framework.A3_Vector;
import java.util.*;
public class B31_Vector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		
		// adding element
		v.add("Swapnil");
		v.add("Rakesh");
		System.out.println(v);
		
		
		// adding list to vector
		ArrayList<String> a = new ArrayList<String>();
		a.add("Yash");
		a.add("Deepak");
		a.add("Pratik");
		
		v.addAll(a);
		
		System.out.println(v);
		
		// updating element
		v.set(1, "Harsh");
		
		// removing element
		v.remove(3);
		
		System.out.println(v.get(1));
		System.out.println(v);
		
		
		
		
	
	}
}
