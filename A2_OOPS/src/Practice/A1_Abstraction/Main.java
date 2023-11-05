/* Abstract
An abstract method belongs to an abstract class, 
and it does not have a body. The body is provided by the 
subclass:
*/


package Practice.A1_Abstraction;

// abstract class
abstract class Main {
	
	public String fname = "Swapnil";
	  public int age = 25;
	  public abstract void study(); // abstract method	
	  
	  public void view()
	  {
		  System.out.println("view");
	  }
}

// Subclass (inherit from Main)
class Student extends Main{
	
	public int graduationyear = 2019;
	public void study() { // the body of abstract method is provided here
		System.out.println("Studying all day long");
	}
}
