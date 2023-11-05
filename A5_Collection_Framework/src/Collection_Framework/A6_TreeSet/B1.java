package Collection_Framework.A6_TreeSet;
import java.util.*;

import java.util.HashSet;

public class B1 {

	
	public static void main(String[] args) {
	
		HashSet<Double> nms = new HashSet<>();
		nms.add(14.233);
		nms.add(34.132);
		nms.add( 234.5300);
		nms.add(33.2);
		
		// we will get unsorted list
		System.out.println(nms);
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		
		// we will get sorted list
		System.out.println(tset);
		
		
	}
}
