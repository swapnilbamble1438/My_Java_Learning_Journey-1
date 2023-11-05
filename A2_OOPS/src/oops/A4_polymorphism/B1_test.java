// run time polymorphism
// it is achieved by method overriding



package oops.A4_polymorphism;

class Shape
{
	public void area()
	{
		System.out.println("Area1");
	}
	
}

public class B1_test extends Shape
{
	public void area()
	{
		System.out.println("Area2");
	}
	
	public static void main(String[] args)
	{
		Shape obj1 = new Shape();
		obj1.area();
		
		Shape obj2 = new B1_test();
		obj2.area();
	}
}