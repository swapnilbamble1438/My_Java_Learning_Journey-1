/*
Dont get confused between 
Abstraction & Encapsulation

  Abstraction                     Encapsulation
  
1. Abstraction is detail        1. Encapsulation is data
   hiding(implementation           hiding (information
   hiding)                         hiding)
  
2. Data Abstraction deals       2. Encapsulation groups
   with exposing the               together data and
   interface to the user           methods that act 
   and hiding the details of       upon the data.
   the implementation.
   
   
   
   
   
Abstraction:
Abstraction is hiding internal implementatin
& just highlighting the setup services
that we are offering.
  OR
  showing features and hiding internal details(implementation)
In abstraction, it displays only the important information
 by hiding the implementation part.

E.g:
	1) In car we can see steering, brake
	   and we can use it without knowing
	   its internal functionality.
	   
	2) on/off button of CPU 
	   if we on the button of CPU computer gets
	   started but we dont know inside CPU
	   what process is going on to on the Computer
	   so here we can see that 
	   our feature is visible
	   but implementation is not visible to user. 
	   
	3) Let's take the ATM machine. In an ATM machine, 
       we can perform functions like withdraw cash, deposit cash, 
       check balance, print bills, and so on. Even though it performs 
       a lot of actions it doesn’t show us the process. It has hidden
       its process by showing only the main things like getting 
       inputs and giving the output.
 
    4) The next example is the most commonly used mobile
	   phones. On a mobile phone, we can perform so many actions 
	   like making a call, sending messages, take pictures, 
	   download software and etc. We perform a lot of things
	   but here also we don't know the inside process of these 
	   things. Which means the implementation parts are hidden.    
			
Abstraction can be achieved by using:
1) Abstract class:
		  By using Abstract class 
		  we can achieve abstraction 
	          (0 - 100%)
2) Interfaces:
	          By using interfaces we can
	          achieve abstraction (100%)
			  
  E.g:
  public class Main {

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
																
	public void move()		         // we can use selective methods of original abstract class
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
-------------------------------------------------
 1) A method without body(no implementation)
    is known as abstract method.
 2) If a class has an abstract method,
	then class should also be declared 
	abstract as well.
 3) But abstract class can have 
    both abstract and non-abstract methods.	
 4) If a regular class extends an abstract class,
 	then the class must have to implement all
 	the abstract methods of abstract parent
 	class or it has to be declared abstract as well.
 5) Abstract class object cannot be created
 6) But we can create reference
 
 
 
 
*/

package oops.A5_abstraction;


public class A6_Abstraction {

}
