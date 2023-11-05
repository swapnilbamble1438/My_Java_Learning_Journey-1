package DSA_Java.A3_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class BracketChecker
{
	private String input;
//--------------------------------------------------
	public BracketChecker(String input) {
		this.input = input;
	}
//---------------------------------------------------
	public void check()
	{
		int stackSize = input.length();
		
		Stack2 stackArray = new Stack2(stackSize);
		
		for(int j = 0; j< input.length(); j++)
		{
			char ch = input.charAt(j);
			
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
				stackArray.push(ch);
				break;
			
			case '}':
			case ']':
			case ')':
				if(!stackArray.isEmpty())
				{
					char chx = stackArray.pop();  // pop
					if((ch == '}' && chx != '{') ||
					   (ch == ']' && chx != '[') ||
					   (ch == ')' && chx != '(') )
						System.out.println("Error: " + ch + " at "+j);
					
				}
				else
					System.out.println("Error: " + ch + " at "+j);
				break;
			default: // no action on other characters
				break;
			} // switch end
		} // end for
		// at this point, all characters have been processed
	if(!stackArray.isEmpty())
		System.out.println("Error: missing right delimiter");
	}
	
//-------------------------------------------------------------------------
		
}



public class A3_Check_Brackets {
	
	public static void main(String[] args) throws IOException {
		
		String input;
		
		while(true)
		{
			System.out.println("Enter String containing delimiters: ");
		//  System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			BracketChecker checker = new BracketChecker(input);
			checker.check();
		
		} // end while
		
		
		
	}
	

	private static String getString() throws IOException
	{
		
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String s = br.readLine();
				return s;
		
	}
	

}


