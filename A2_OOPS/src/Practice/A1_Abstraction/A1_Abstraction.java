package Practice.A1_Abstraction;

abstract class Animal{
	
	// Abstract method (does not have a body)
	public abstract void animalSound();
	
	// Regular Method
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Pig extends Animal{
	
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}


public class A1_Abstraction {

	public static void main(String args[])
	{
		Pig myPig = new Pig();
		
		myPig.animalSound();
		myPig.sleep();
	}
}
