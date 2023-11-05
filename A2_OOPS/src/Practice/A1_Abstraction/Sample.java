package Practice.A1_Abstraction;

public class Sample {
	
	public static void main(String args[])
	{
		
		SureshPhone obj = new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		
	}

}

abstract class MaheshPhone{
	
	
	public void call()
	{
		System.out.println("calling...");
	}
	public abstract void move();
	
	public abstract void dance();
	

	
	
}

abstract class RameshPhone extends MaheshPhone
{ 
	
	public void move()
	{
		System.out.println("moving...");
	}
}

class SureshPhone extends RameshPhone     // concrete class
{
	public void dance() {
		
		System.out.println("dancing...");
		
	}
	
}
