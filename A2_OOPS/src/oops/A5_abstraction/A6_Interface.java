/*
 Interface:
 Interfaces are similar to Abstract Class
 but having all the methods of abstract type.
 
 In interface all methods must be abstract only
 and concrete methods are not allowed
 But it is allowed in Java 8 and its
 future versions
 
 Interface objects cannot be created
 
 Interfaces are the blueprint of the class.
 It specify what a class must do and
 not how.
 
 Use of Interface:
 1) It is used to achieve abstraction
 2) We can achieve multiple inheritance using Inheritance
 3) It can be use to achieve loose coupling
 4) Methods in interface are by default 
    public abstract methods
 5) Fields in interface are by default
    public static final keyword
 	
    And after Java 8
 	
 6) In interface concrete methods are also
    allowed but its access modifier should
    be default
 7) Static method are also created in interface
 
     And after Java 9
  8) Private methods are also allowed in interface
  
-------------------------------------------------
e.g:

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

public class A3
{
	public static void main(String[] args)
	{
		
		Circle c = new Circle();
		c.calculateArea(2);
		
	}
}
----------------------------------------------------------------------

   
   
   
   
 */


package oops.A5_abstraction;


public class A6_Interface {

}
