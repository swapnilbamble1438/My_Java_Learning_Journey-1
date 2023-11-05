/*
 Java:
 Java is a high-level programming language
 and is platform-independent.
 Java is collection of objects.
 There are lot of applications, websites and
 games that are developed using Java.
 
-----------------------------------------------------------------------
OOPs - Object Oriented Programming System/Structure
-----------------------------------------------------------------------

-> OOPs is a way of programming
   OOPs in java is to improve code readability
   and reusability by defining program efficiently.

Six pillars of OOPs:
Class
Objects & methods
Inheritance 
Abstraction 
Polymorphism
Encapsulation
------------------------------------------------------------------------
1)Class:

 e.g:
 Animal, Vehicles,Birds etc. are like classes
 
 In Animal object will be cat ,dog ,mouse, etc.
 In Vehicles object will be Car, Bike, etc.
 In Birds object will be sparrow, peacock, crow, etc.
 
 	    Animal          Vehicle           Bird
 	   ___|____         ___|____         ___|____
 	  |        |       |        |       |        |
 	 Cat      Dog     Bike     Car    Sparrow   Peacock
 	  
 
 Method : it is a task that is performed by someone.
 
 like eating,drinking,running,flying,running.
 
 Animal can perfrom task like:  eat, drink
 
 Bird can perform tasks like: fly
 
 Vehicle can perform tasks like: run
 
 
         eat()   drink()     run()            fly()
           |___ ____|          |                |
 	       |               |                |
 	    Animal          Vehicle           Bird
 	   ___|____         ___|____         ___|____
 	  |        |       |        |       |        |
 	 Cat      Dog     Bike     Car    Sparrow   Peacock
 	  
 
 Animal is just a word to categories cat,Dog,etc.
 Bird is just a word to categories Sparrow,Peacock,etc.
 Vehicle is just a word to categories Car,Bike,etc. 
 
same i) Class is just word to categories objects.
or Class is the collection of objects.

If you want to see an Animal so what will you see,
You can't see Proper Animal. But you can look at 
Animal objects like Cat and Dog.

so ii)class is not a real world entity it is just a 
template or blueprint or prototype.

Suppose if you have Dog in your house.
so who will occupy space in your house Dog or Animal.
Ofcourse Dog will occupy Space. Because (Animal)class is not
real world Entity, But Dog(object) is a real world Entity.

so iii) Class does not occupy memory.




1)class:
All Java codes are defined in a class.
It has variables and methods.
		OR
 i)class is the collection of objects
 ii)class is not a real world entity 
    it is just a template or blueprint or prototype
 iii)Class does not occupy memory
   
    syntax- access-modifier ClassName{
						in body we can create
						-methods
						-constructors
						-fields or variable
						-blocks
						-nested class
					}

   Eg. Animal, Birds,Vehicle
------------------------------------------------------------------------

2)Object:

 Object is an  instance of class
 
 like Dog is an instance of Animal
 
 
  i) Ojbect is an instance of class. 
  	 Which are created from a class in java.
  ii) Ojbect is real world entity
  iii) Ojbect occupies memory
  iv) Ojbect consist of:
	a)Identity : name (every object name is unique)
	b)State/Attribute:  for e.g(color of dog, breed of dog)
	c) Behaviour: for e.g(eat, run) behaviour represents or point methods
		
		e.g:
	 _____________	    __________________      _____________
	|  Identity:  |	   | State/Attribute: |    | Behaviours: | 
        |             |    |                  |    |             | 
        | Name of Dog |    |      Breed       |    |     Eat     |
        |_____________|    |       Age        |    |     Run     |
                           |      Color       |    |     Bark    |
                           |__________________|    |_____________|
                       
	
	How to create an object:
	i) by using new keyword
        ii)by using newInstance() method
  	iii) by using clone() method
	iv) by using deserialization
	v) by using factory methods
	
	steps to create an object using new keyword: 
	i) Declaration: className and objectName for e.g(Animal dog)
	ii) Instantiation: className and ojbectName = new className(); 
	    for e.g(Animal dog = new Animal();)
	iiii)Initialization:
	     by using .operator after object u can call Class behaviour
	

 Eg. Cat,Dog,Peacock,Sparrow,Bike,Motorcycle

------------------------------------------------------------------------

3)method:
 method is a set of codes which perform a particular task
 
like Dog is running.
so running is a method.

Methods are the place where the exact logic has to
be done. It contains set of statements or instructions
to satisfy particular requirements.
		OR
  i) methods is a set of codes which perform a particular task
  ii) advantages of methods  : a) code reusability b) code optimization
  syntax- access-modifier return-type methodName(list of parameters){
										    }	// method name first letter should be lower case			
   Eg. eat(),fly(),bark()
------------------------------------------------------------------------

 Variables: are attribute

-----------------------------------------------------------------------
e.g:
class Animal
{	
	public void eat()
      {
		System.out.println("Eating");
	}
	
	public static void main(String[] args)
	{
		Animal dog = new Animal();
		dog.eat();
	}
}
	output: Eating
	
so here we can see without creating object we cannot call method of
any class

------------------------------------------------------------------------
 
Object Initialize by reference variable
e.g:

class Animal
{
	String name = "Dog";
	String color ="Black";
	
	public static void main(String[] args)
	{
		Animal dog = new Animal();		
		System.out.println(dog.name + " " + dog.color);
	}
}
	
	output: Dog Black
	
	But to initialize object using this method
	is not a good approach in programming
	as it will increase the extra lines in code

 */

package oops.A1_Class_n_Object;

public class A1_OOPs_i {
	
	String name="Dog";
	String color="Black";
	
	public static void main(String[] args)
	{
		A1_OOPs_i dog = new A1_OOPs_i();
		
		System.out.println(dog.name + " " + dog.color);
		
	}
}
