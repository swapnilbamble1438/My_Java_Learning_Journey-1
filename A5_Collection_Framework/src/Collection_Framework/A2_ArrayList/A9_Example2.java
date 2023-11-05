package Collection_Framework.A2_ArrayList;

import java.util.ArrayList;
import java.util.Collection;


public class A9_Example2 {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(100); //100 will add as a object not int
		a1.add("Swapnil");
		a1.add("B");
		
		
		
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(200); //100 will add as a object not int
		a2.add("Pratik");
		a2.add("S");
		
		System.out.println(a2.add("check"));
		
		a2.addAll(a1);
		System.out.println(a2);
		
		System.out.println(a1.contains(100)); //does a1 contains 100
		
		System.out.println(a1.isEmpty());
		System.out.println(a2.size());
		
		a2.remove(0);
		a2.remove("S");
		System.out.println(a2);
		
		a2.removeAll(a1);
		System.out.println(a2);
		
		a1.clear();
		System.out.println(a1);
		
	}

}
