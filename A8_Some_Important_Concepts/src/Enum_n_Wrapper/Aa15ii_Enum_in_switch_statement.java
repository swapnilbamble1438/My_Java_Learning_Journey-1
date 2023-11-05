/*
 Enum in a Switch Statement
Enums are often used in switch statements to check for
 corresponding values:
 */

package Enum_n_Wrapper;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class Aa15ii_Enum_in_switch_statement {

	public static void main(String args[])
	{
		Level myVar = Level.MEDIUM;
		
		switch(myVar) {
			case LOW:
				System.out.println("Low Level");
				break;
			case MEDIUM:
				System.out.println("Medium Level");
				break;
			case HIGH:
				System.out.println("High Level");
				break;		
		}
	}
}
