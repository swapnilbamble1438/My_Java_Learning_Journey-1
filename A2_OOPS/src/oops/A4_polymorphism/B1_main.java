// compile time polymorphism
// it is achieved by method overloading

package oops.A4_polymorphism;

public class B1_main {

	public void area(String Circle)
	{
		System.out.println("Circle ");
		
	}
	
	public void area(String Circle, String Triangle) 
	{
		System.out.println("Circle and Triangle");
	}
	
	public void area(String Circle,String Triangle, String Rectangle)
	{
		System.out.println("Circle,Triangle and Rectangle");
	}
	
	public static void main(String args[])
	{
		B1_main obj = new B1_main();
		obj.area("Circle");
		obj.area("Circle","Tringle");
		obj.area("Circle","Tringle","Rectangle");
		
	}
}
