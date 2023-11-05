/*
 Interfaces
Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "abstract class" that is used to
 group related methods with empty bodies:
 
 -----------------------
 
 To access the interface methods, the interface must be
  "implemented" (kinda like inherited) by another class with 
  the implements keyword (instead of extends). The body of the
   interface method is provided by the "implement" class:
 */


package oops.A5_abstraction;

interface Animal{
	
	public void animalSound(); //interface method (does not have body)
	
	public void sleep(); 
}


// Pig implements the Animal interface
class Pig implements Animal{
	
	public void animalSound() {
		// the body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	
	public void sleep() {
		System.out.println("Zzz");
	}
}

public class A6i_Interface_Example {

	public static void main(String args[])
	{
		Pig myPig = new Pig();
		
		myPig.animalSound();
		myPig.sleep();
	}
}
