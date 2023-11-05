package Collection_Framework.A4_Stack;

// Stack is a subclass of Vector class

import java.util.Stack;

public class B1_Stack {
	
	public static void main(String[] args) {
		
		
		// Default initialization of Stack
		Stack st = new Stack();
		
		
		// Initialization of Stack
		//usin Generics
		Stack<String> stack = new Stack<String>();
		
		
		// pushing the elements
		stack.push("Swapnil");
		stack.push("Yash");
		stack.push("Pratik");
		stack.push("Deepak");
		stack.push("Zurez");
		
		
		// get first element of Stack
		System.out.println(stack.firstElement());
		
		// get last element of Stack
		System.out.println(stack.peek());
		
		// removing element using pop()method
		// it will remove last element of stack
		stack.pop();
	
		// search
	System.out.println(stack.search("Pratik"));
		
		System.out.println(stack);
		
		
		
		
		
		
		
	}

}
