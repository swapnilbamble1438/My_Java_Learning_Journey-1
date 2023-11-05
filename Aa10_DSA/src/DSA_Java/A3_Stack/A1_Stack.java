package DSA_Java.A3_Stack;


class Stack
{
	private int size;
	private int[] stackArray;
	private int top;
//-------------------------------------------------	
	
	public Stack(int size)
	{
		stackArray = new int[size];
		top = -1;
	}
//-------------------------------------------------	
	
	public void push(int value)
	{
		stackArray[++top] = value;
	}
//-------------------------------------------------	
	public int pop()
	{
	
		return stackArray[top--];
	}
//-------------------------------------------------	
	public int peek()
	{
		return stackArray[top];
	}	
//-------------------------------------------------	
	public boolean isEmpty()
	{
		return(top == -1);
	}
//-------------------------------------------------	
	public boolean isFull()
	{
		return(top > -1);
	}
//---------------------------------------------------
	public void display()   // display elements
	{
		for(int j= 0; j <= top;j++)   // display items
		{
			System.out.print(stackArray[j] + " ");
		}
	}
	
}
//////////////////////////////////////////////////////////////

public class A1_Stack {
	
	public static void main(String[] args) {
		
		Stack stackArray;                 // reference
		stackArray = new Stack(10);     // create LowArray object
		
		stackArray.push(20);
		stackArray.push(40);
		stackArray.push(60);
		stackArray.push(80);
		
		stackArray.display();
		
		System.out.println();
		
		System.out.println("Peek: " + stackArray.peek());
		
		System.out.println("Pop: " + stackArray.pop());
		
		System.out.println("Peek: " +stackArray.peek());
		
		stackArray.display();
		
		System.out.println();
		
		System.out.println("Stack is Empty: "+ stackArray.isEmpty());
		
		System.out.println("Stack is Full: "+ stackArray.isFull());
		
		
		
	}

}
