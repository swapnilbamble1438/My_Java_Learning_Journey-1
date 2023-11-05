/*
---------------------------------------------------
 
========================================================

  Inheritance: 

one class inheriting the property of another class is
inheritance.
	OR
Inheriting the properties of parent class into
child class
 	OR
Inheritance is the procedure by which one object
acquires all the properties and behaviours
of a parent object.	

Advantage of Inheritance:
1) Code Reusability:
   means we dont have to write same code again
   and again
2) We can achieve polymorphism using Inheritance
   i.e we can achieve method overriding
   
Disadvantage of Inheritance:
 Using Inheritance the two classes 
 (parent and child class) gets tightly coupled.
	OR
 Application become tightly coupled
   means changing method of parent class
   will also affects its child class
   behaviour.
   
   Note:
   By declaring any method private in Parent class
   than that method will not be accessible
   by its child class
==================================================
E.g:
class Animal
{
	void eat()
	{
		System.out.println("Eat");
	}
}
	
class Dog extends Animal
{
	public static void main(String args[])
	{
		Dog dog = new Dog()
		dog.eat()
		
	}
}
	output: Eating
	
	so relationship here is 
	Dog is a Animal
	means this type of relationship is called
	"is a" relationship.

========================================================

Single level inheritance:
having one parent class and one child class(only)

 class A  (Parent class)
       |
       |
 class B  (child class) it is inheriting the
			property of class A
 				
 						
========================================================
 											
MultiLevel inheritance:
One class can inherit from a derived class.
hence, the derived class becomes the base class
for the new class.

 class A
       |  
       |
 class B  so here class B is child also and parent also 
       |		so thats why we call it multilevel
       |
 class C  here class C having more propeties 
    	  as it is taking propety of B and 
 			property of A also from B	
 			
======================================================== 			
 			
Hierarchical inheritance:
one parent class having multiple child class
	OR
One class is inherited by many sub classes.
		
			class A (Parent class) 
	___________________|______________________				          
       |          |           |         |         |	   
    class B    class C    class D    class E   class F	 ---(all child class)

========================================================

Multiple Inheritance: (not supported in java)
one child having multiple parent class.(Reverse of Hierarchical inheritance)
   OR
one class extending more than one class.

so it is not possible in java through classes
but we can use interface in java

		    class B    class C    class D    class E   class F      ---(all Parent class)
			|_________|__________|__________|_________|
								|
							    class A  (child class)


========================================================

Hybrid Inheritance:(not supported in java)
containing mulitple types of inheritance.
and cycle should not be formed. loop should not be formed of inheritance.
	OR
Combination of any two inheritances.
	
Hybrid inheritance is not supported in Java
using classes it can be done through using interface.

      class A<----------     ----------->class B   (child  class of Z)
      			|   |
      			|   |
      		       class Z           (Parent class of A & B) and
      		        ^   ^             (Child class of P & Q)
      			|   |
      class P----------     -----------class Q   (Parent class of Z)


========================================================

Cyclic Inheritance:(not supported in java)
forming loop of inheritance.
it is not supported in java.
     
	  -->class A---
	 |             |       here A inherting property of B
     	 |	       |		  and B also ineheriting property of A
          --class B<---        so here cycle is formed so it is not
							  supported in java.


   one more example
   
    class A<----------class B<---   
      	|   			 |		
      	|			 |
      	|                        |
         -->class B---------->class C 
		

========================================================

=====Real world Examples===================================

Example 1: let's assume that there is a class as Vehicle. 
All vehicles are not the same. We can inherit common 
properties like color, size, type from the parent vehicle 
class and create classes like Car, Bus, Bike.

Example 2: let's take another parent class as Animals. 
Here also we can inherit common properties like name, sound,
 color, breed from Animal class and create classes like Dog, 
 Cat, Horse and etc.

==================================================================
Important Points of Inheritance:
1) Inheritance is achieved by using "extends" keyword.
2) Every class has a super or say parent class.
   Means the class which is parent will also 
   by default inherit Object class.
   i.e Object class: It is Default parent class 
   (but object class does not have
   any parent class)

3) Below does not take part in Inheritance:

   Constructors: 
   A subclass inherits all the members
   (fields, methods and nested classes) from
   its superclass, Constructors are not members
   so they are note inherited by subclasses,
   but the constructor of the superclass can be
   invoked from the subclass.
   
   Private members:
   A subclass does not inherit the private members
   of its parent class. However, if the superclass
   has public or protected methods(like getters
   and setters) for accessing its private fields,
   these can also be used by the subclass.
   
   There can be only one super class,not more than
   that because java does not support multiple
   inheritance.
   



=========================================================
 
 
 
 */


package oops.A3_inheritance;

class Animal
{
	private void eat()
	{
		System.out.println("Eat");
	}
	
	public void run ()
	{
		System.out.println("Run");
	}
}

public class A3_Inheritance_i extends Animal{
	public static void main(String[] args) {
		
		A3_Inheritance_i dog = new A3_Inheritance_i();
		 dog.run();
	
		
		
	}

}
