package DSA_Java.A3_Stack;

import java.util.Scanner;

class Stack2
{
	private int size;
	private char[] stackArray;
	private int top;
//-------------------------------------------------	
	
	public Stack2(int size)
	{
		stackArray = new char[size];
		top = -1;
	}
//-------------------------------------------------	
	
	public void push(char value)
	{
		stackArray[++top] = value;
	}
//-------------------------------------------------	
	public char pop()
	{
	
		return stackArray[top--];
	}
//-------------------------------------------------	
	public char peek()
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


class Reverse{
	
	private String input;
	private String output;
//---------------------------------------------------------	
	public Reverse(String input)
	{
		this.input = input;
	}
//---------------------------------------------------------	
	public String doRev()
	{
		int strSize = input.length();
		Stack2 stackArray = new Stack2(10);
		
		for(int j = 0; j < strSize;j++)
		{
			char ch = input.charAt(j);
			stackArray.push(ch);
		}
		output = "";
		while(!stackArray.isEmpty())
		{
			char ch = stackArray.pop();
			output = output + ch;
		}
		return output;
	}
	
	
}

public class A2_ReversingString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Word: ");
		String str = sc.next();
		
		Reverse rev = new Reverse(str);
		
		System.out.println(rev.doRev());
		
		
		
		
	}

}
