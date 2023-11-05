package oops.A5_abstraction;

public class Practice {

	public static void main(String[] args) {
		
		
		Gulab ob = new Gulab();
		
		ob.call();
		ob.move();
		
	}
}

abstract class Abhay{
	
	public void call()
	{
		System.out.println("calling...");
	}
	
	public abstract void move();
	
	
}

class Gulab extends Abhay{


	public void move() {
		System.out.println("moving...");
		
	}

	
	
	
}


