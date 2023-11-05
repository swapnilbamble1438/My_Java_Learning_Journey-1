package oops.A5_abstraction;

public class B1_Main {

	public static void main(String args[])
	{
	
		// we cannot instantiate the abstract class 
		// means we cannot create object of abstract class through respective abstract class
	
		SureshPhone obj = new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	
	
	}
}

abstract class MaheshPhone{
	
	public void call()
	{
		System.out.println("calling...");
	}
	
	public abstract void move();  // this method is only declared and not define
	
	public abstract void dance();
	
	public abstract void cook(); 
}

abstract class RameshPhone extends MaheshPhone{   //if we use abstract class here
																
	public void move()							// we can use selective methods of original abstract class
	{
		System.out.println("moving..."); 
	}
	
}

class SureshPhone extends RameshPhone{  // it is concrete class
										// if we use simple class
										// we have to implement all remaining methods of
										// of abstract class
	
	public void dance() {
		System.out.println("dancing...");
	}

	public void cook() {
		System.out.println("cooking...");
	}
	
}