package oops.A5_abstraction;


abstract class MyClass
{
	public void cal()
	{
		System.out.println("calculating results");
	}
	
	abstract public void launchRocket();
	
}

 class MyChild extends MyClass
{

	@Override
	public void launchRocket() {
		
		System.out.println("launching Rocket");
	}
	
}


public class B2 {

	
	public static void main(String[] args) {
		
	MyChild mychild = new MyChild();
	mychild.launchRocket();
	mychild.cal();
		
	MyClass myclass = new MyChild();
	myclass.launchRocket();
	
		
	}
}
