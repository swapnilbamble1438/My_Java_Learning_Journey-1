package oops.A5_abstraction;

interface Shape {

	
	
	// public static final
	// will by default will be attach to 
	// any variable we declare
	
	int i = 34;
	
	// public abstract 
	// will by default will be attach to
	// any method we declare
	
	void calculateArea(int r);
	

}

class Circle implements Shape
{

	@Override
	public void calculateArea(int r) {
		System.out.println("Area of Circle is " + Math.PI * r* r);
	}
	
}

public class B3
{
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.calculateArea(2);
		
	}
}