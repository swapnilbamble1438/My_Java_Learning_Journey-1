package Collection_Framework.A9_InOneGo;

import java.util.Iterator;
import java.util.Stack;

public class Aa15ii_Example1 {
	
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("Swapnil");  // added first  .but in stack first element will get the last index
		s.push("Mumbra");   // added second
		s.push(100);        // added third
		s.push(1.8);        // added fourth/last.but in stack index 1 will start from this position
		
		System.out.println(s);
		
		System.out.println(s.pop()); // it will remove the top element
		
		System.out.println(s);
		
		System.out.println(s.peek()); // it will show the top element without removing it
			
		System.out.println(s.search("Swapnil"));// it will show the index of the specified object
		System.out.println(s.search(100));
		System.out.println(s.search("xyz"));// if the element is not present it will show -1
		
		System.out.println(s.empty());// checking Stack whether its empty or not
		
		System.out.println("using iterator");
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
