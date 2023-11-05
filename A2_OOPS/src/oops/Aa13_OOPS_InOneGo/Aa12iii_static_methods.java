/*

static methods:
static methods belongs to class, not object

simple methods can be called using objects
but static methods can be directly by class name
as follows:
ClassName.methodName();

e.g: without using static

class Test
{
	void display()
	{
		System.out.println("1");
	}	
}
class Main
{
	public static void main(String args[])
	{
		Test t = new Test();
		t.display()
	}	
}
	output: 1
	
-----------------------------------------------------

	e.g: using static
	
class Test
{
	static void display()
	{
		System.out.println("1");
	}	
}
class Main
{
	public static void main(String args[])
	{
		Test.display();
	}	
}	
	output: 1;
------------------------------------------------------	
	if static method is within class
	then without clasname also we can directly 
	call it using only method name
	
	e.g:
	
class Main
{
	static void display()
	{
		System.out.println("1");
	}	
	
	public static void main(String args[])
	{
		display();
	}	
}	
	output: 1
-----------------------------------------------------
Q) why static method is use?
   static methods are used for memory management.
   
   By using static method we dont need to create
   any object to call the method and thus 
   no object has occupied any memory and 
   program becomes memory efficient program becomes
   fast also
   Static methods are for class and not for objects
----------------------------------------------------
   Rules for "static" methods:
   
 1. "static" methods belongs to the class,
    not to the object.
    
 2. A "static" method can be accessed directly
    by class name and does'nt need any object.
    
 3. A "static" method can access only static data.
    It cannot access non-static data (instance data).
    
 4. A "static" method can call only other static
    methods and cannot call a non-static method.
    
 5. A "static" method cannot refer to "this" or
    "super" keyword in anyway.            
---------------------------------------------------------
 Rule 3:
 E.g:
 
 class StaticDemo
 {
 	int i = 10;
 	
 	static void display()
 	{
 		System.out.println(i); // it is not possible
 					// it will show error
 					// because i is not a 
 					// static variable
 	}	
 }	
 
 
 
 class StaticDemo
 {
 	static int i = 10;
 	
 	static void display()
 	{
 		System.out.println(i); // it is possible							
 	}	
 }
 	output: 10
 
 
 
----------------------------------------------------------------- 
 Rule 4:
 E.g:
 
 class StaticDemo
 {
 	static void display()
 	{
 		show();   // it is not possible
 			 // it will show error
 			 // because static method can call
 			 // only other static method 
 			// and cannot call non-static method
 		System.out.println("1");
 	}	
	
	void show()
	{
		System.out.println("2");
	}	
}



 class StaticDemo
 {
 	static void display()
 	{
 		show();   // it is possible
 				
 		System.out.println("1");
 	}	
	
	static void show()
	{
		System.out.println("2");
	}	
}

	output: 2
		1
------------------------------------------------------
  Rule 5:
  e.g:
  
  class StaticDemo
  {
  	int i = 10;
  	
  	static void display()
  	{
  		System.out.println(this.i); // it is not possible
  					// it will show error
  					// because non-static variable
  					// this cannot be reference from
  					// static context
  	}
   } 		


	class StaticDemo
  {
  	int i = 10;
  	
   void display()
  	{
  		System.out.println(this.i); // it is possible
  			     	           // with the instance method
  									
  	}
   } 
   
   output: 10


*/

package oops.Aa13_OOPS_InOneGo;


public class Aa12iii_static_methods {
	static void show() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		show();
	}

}
