
/*
 Polymorphism:
 having many forms
 Polymorphism is the ability to exist in many forms.
 

 	
====Real World Examples ====================================== 	
 	
 	Example 1: water can have multiple forms
 	it can be solid,liquid,gas
 	
 	Example 2: We can take a boy as a real-world example. 
 	This boy can be a student, a player, and a writer. 
 	So that this boy can exist in different ways in different 
 	situations.
 	
 	Example 3: Sound of animals. different animals
 	 make different sounds. 
 ====================================================
 
  there are two type of polymorphism
 1) Compile Time : static binding

 	We can achieve compile time polymorphism
 	through method Overloading
 	
 	Method Overloading:
 	in Method overloading both methods name are 
 	same but have different parameter therefore
 	so during compile time only it get detected
 	which method has to be called
 		obj(int i)
 		obj(double j)
 	Compile time polymorphism is handle by 
 	compiler	
 	
 
 2) Runtime : Dynamic Binding

 	We can achieve Runtime time polymorphism
 	through method Overriding
 	in overriding both methods have same name
 	and same parameter
 	so here compiler will get confuse which method
 	is to be called
 	so during runtime only by interpreter it 
 	get detected which method has to be called
 	
 		obj()
 		obj()
 	Runtime polymorphism is handle by JVM
 	
===================================================
 
 	Method Overloading              Method Overriding

1) Methods can have same name      1) Methods can have same name

2) Both methods should be in       2) Methods with same name should
   same class                         be in different class
	
3) Each method arguments should    3) Each methods arguments 
   be different in:                   can be same in:
   Numbers or sequence or             Numbers or sequence or
   type                               type
   	                        
   	                           4) Inheritance must be establish
   	                              between class (there should be
   	                              Is-A Relationship) between
   	                              multiple classes
=========================================================================
    Method Overloading
=========================================================================    


   	Method Overloading
   	
   	e.g:
   	
   public class Overloading {
	
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String args[])
	{
		System.out.println(1,2); // so here it will 
		                         // detect method with two argument
		                         // and call that method
		
		System.out.println(1,2,3); // same here also
		                         // it will detect by 
		                        number of arguments
	}													

}

-----------------------------------------------------------

Method Overloading - Case 1:

Automatic promotion is allowed in
Method Overloading

    Automatic Promotion
 One type is promoted to another implicitly if
 no matching datatype is found.
 Below is the diagram:
 
 			byte
 			 |
 			short
 			 |
         	char----int---float		 
 			 |\    /|
 			 | \  / |
                         |  \/  |       
                         |  /\  |
                         | /  \ |
                         |/    \|
                        long   double   
           
       byte to short
       
       short to int
       
       char to int
       char to Object (Object is the parent class
                      of all the classes)
       int to float
       int to long 
       int to double
       
       float to double
       
       long to float       
       long to double  
       
       e.g:
       
    public class Overloading {
	
		static void show(int a)
		{
		 	System.out.println("int method");
		}
		
		static void show(String b)
		{
			System.out.println("String method");
		}
		
		public static void main(String args[])
		{
			show('a');
			// here if we pass char 'a'
			 // then it will call  show method
			 // with int parameter
			 // because char type is promoted
			  // to int if no matching
			  // datatype is found
			
		}													

	}
	
	output:  int method
=================================================================       
       
       Method Overloading - Case 2:
       
       Object   It is the parent class of all
    	   |       the classes in java
    	   |
    	 String  
    	 
    	 there will always first preference
    	 given to child class when calling
    	 method
       
        e.g:
       
    public class Overloading {
	
		static void show(Object a)
		{
		 	System.out.println("Object method");
		}
		
		static void show(String b)
		{
			System.out.println("String method");
		}
		
		public static void main(String args[])
		{
			show("Hii");
			
		}													

	}
	
	outptut: String method
	
===================================================
       
       Method Overloading - Case 3:
       
        Object   It is the parent class of all
    	  /\        the classes in java
    	 /  \
   String   StringBuffer
   
           e.g:
       
    public class Overloading {
	
		static void show(StringBuffer a)
		{
		 	System.out.println("StringBuffer method");
		}
		
		static void show(String b)
		{
			System.out.println("String method");
		}
		
		public static void main(String args[])
		{
			show("Hello");  // it will call String method
			
			// and if we pass value like this
		 show(new StringBuffer("Hello")); // it will call StringBuffer
			
			// first complete till this 
			 // after
			 // try this
			 show(null) // if we pass null value
			 // then it will confuse which
			 // method has to be called
			 // and it will give the error
			
		}													

	}
	

=========================================================================
    Method Overriding
=========================================================================  
   
   Method Overriding:
   
   e.g:
   

class College{
		
	void study()
	{
		System.out.println("Studying in College");	
	}
}

class Std extends College
{
		
	void study()
	{
		System.out.println("Studying in Std 15");
	}
}

   public class Overriding_Example {
   
   public static void main(String args[])
   {
   		Std s1 = new Std();   // this will call
		s1.study();         // Std class method    
		
		College s2 = new Std();  // this will call
		s2.study();           // Std class method
		
		College c1 = new College();  // this will call
		c1.study();                   // College class method
   
   
   }

}
       output:
       			Studying in Std 15
       			Studying in Std 15
			Studying in College
				
============================================================       
 
 Use of Method Overriding:
 It allows a subclass or child class to provide
 a specific implementation of a method that is 
 already provided by one of its superclasses
  or parent classes.
  The implementation in the subclass overrides
  (replace) the implementation in the superclass
  by providing a method that has same name,
  same parameters or signature, and same
  return type as the method in the parent class.
             
====================================================

     Methodoverriding case1 :
     
     From Java 5.0 onwards it is possible
     to have different return type for a 
     overriding method in child class,
     But child's return type should be sub-type
     of parent's return type.
     This phenomena is known as covariant 
     return type.
             
                           Object
      _________________________|____________________                        
     |    |         |        |      |     |    |    |
  String  |   StringBuilder  |  Character |  Void   |
          |                  |            |         |
      StringBuffer        Number       Boolean    ......
           ___________________|____              
          |    |      |   |    |   |
         Byte  |  Integer |  Float |   
               |          |        |
            Short       Long     Double
             
 -------------------------------------------------            
      e.g:
      
   class Test
   {
		
	Object show()
	{
		System.out.println("Object Method");
		return null;	
	}
   }

class Xyz extends Test
{
		
	String show()
	{
		System.out.println("String Method");
		return null;
	}
}

   public class Overriding_Example {
   
   public static void main(String args[])
   {              
   		Test t = new Test();
   		t.show();
   		
   		Xyz x = new Xyz();
   		x.show();
   }

}
		output : 
				Object Method
				String Method
      
      
============================================================

       Method Overriding Case2:
       
       Access-Modifiers:
       The access modifier for an Overriding
       method can allow more, but not less,
       access than the overridden method.
       For example, a protected instance
       method in the super-class can be made
       public, but not private, in the subclass.
       Doing so, will generate compile-time error.

        e.g:
        
        
  class Test
   {
		
	 protected Object show()
	{
		System.out.println("Object Method");
		return null;	
	}
   }

class Xyz extends Test
{
		
	public String show()
	{
		System.out.println("String Method");
		return null;
	}
}

   public class Overriding_Example {
   
   public static void main(String args[])
   {              
   
   
   }

}       
 
 // so here accessibility of child and parent 
  class must be same 
    OR
  Child class accessibility should be more 
  than parent class accessibility
     OR
  Child class Access modifier should be
  bigger than the parent class modifier
  
  
  Private < Default  < Protected  < Public
  
 
===================================================             
 Method Overriding Case3:
 Relationship Between Overriding and Exception-Handling
 
 Rule 1: if the super-class overriden method does
 not throws an exception, subclass overriding method
 can only throws the unchecked exception, throwing
 checked exception will lead to compile-time error.
 
 Rule 2: if the super-class overridden method does
 throws an exception, subclass overriding method
 can only throw same, sublclass exception.
 Throwing parent exception in Exception 
 hierarchy will lead to compile time error.
 Also there is no issue if subclass overriden
 method is not throwing any exception.
 
 // for understanding this first understand
 // exception 
 // checked and unchecked exception 
 
====================================================
Method Overriding Case4:
 Relationship Between Overriding and Abstract Method:
 
 // You should Know Abstraction concept first
  
 Rule 1:  All abstract class method should
 be implemented in the child class.
 (Abstract class methods are also called 
 Abstract methods).
 and also all interface methods should
 be implemented in the child class.
 (Because interface by default is the 
 abstract class)
 
 
==========================================================
	Method Overriding Case5:
	Invoking overriden method from sub-class
	method.
	
	We can call parent class method in
	overriding method using super keyword
	
	e.g:
   

class College{
		
	void study()
	{
		System.out.println("Studying in College");	
	}
}

class Std extends College
{
		
	void study()
	{	
		super.study();   //<---------super Keyword Used
		System.out.println("Studying in Std 15");
	}
}

   public class Overriding_Example {
   
   public static void main(String args[])
   {
   		Std s1 = new Std();   
		s1.study();           
		
		            
   
   }

}
       output:
		Studying in College
		Studying in Std 15

===================================================
Methodoverding Case6:

Which methods cannot override?

 1) Final methods can not be overriden:
    If we don't want a method to be overriden,
    we declare it as final.
    This will give error while compiling.
    
 2) Static methods can not be overriden:
    This will give error while compiling.
    (Method Overriding vs Method Hiding)
    When you defines a static method with
    same signature as a static method in 
    base class,it is known as method hiding.
    
    
 3) Private methods can not be overriden:
    Private methods cannot be overriden
    as they are bonded during compile time.
    Therefore we can't even override private
    methods in a subclass.
    
     This will compile but private method 
     will not override in other class

=================================================

  Method Overriding Case7:
  synchronized/strictfp method
  
  The presence of synchronized/strictfp
  modifier with method have no effect on
  the rules of overriding, i.e. its possible
  that a synchronized /strictfp method can
  override a non synchronized/strictfp one
  and vice-versa.
  
   means synchronized/strictfp before method
   will not affect overriding
  
  e.g:
  
  class Test
  {
  	synchronized void show()
  	{
  		System.out.println("hii");
  	}
  }
  
  class Xyz extends Test
  {
  	void show()
  	{
  		System.out.println("hello");
  	}
  	public static void main(String args[])
  	{
  		Test t = new Test();
  		t.show();
  		
  		Xyz x = new Xyz();
  		x.show();
  	}
  }
  
  output:   hii
  			hello


===============================================================
*/


package oops.A4_polymorphism;

public class A4_Polymorphism {
	static void show(int a)
	{
	 	System.out.println("int method");
	}
	
	static void show(String b)
	{
		System.out.println("String method");
	}
	
	public static void main(String args[])
	{
		show('a');
		// here if we pass char 'a'
		 // then it will call  show method
		 // with int parameter
		 // because char type is promoted
		  // to int if no matching
		  // datatype is found
		
	}						

}
