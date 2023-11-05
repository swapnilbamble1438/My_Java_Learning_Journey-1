/*
Types of Relationship between classes:

1) Inheritance (IS-A)
2) Association (HAS-A):
	Association has two types:
	i) Aggregation
	ii) Composition
	
Why we use relationship between classes
Advantage:
1)Code Reusability:
  we dont have to write the same code again and again.
2) Cost cutting
3) Reduce redundancy:
  we can remove unnecessary code
=====================================================
1) Inheritance (IS-A) Relation
Look for IS-A Relationship in previous class

2)Association (HAS-A) Relation

e.g:

class Student
{
	String name;
	int rollno;
}
	so association relationship has been 
	establish in this class.
	so here Student has a name
	Student has a rollno 
	thus association is commonly used 
	
	Association can also be achieved with
	new keyword also
	
	e.g:
	
	class Engine
	{
		
	}
	class Car
	{
		Engine e = new Engine();
	}
	
	so here Car has a Engine Relationship
	is established
	so from object e we can only access properties
	which we want.so here two classes
	are not tightly coupled with each other.
	so changing any one class property will
	not affect another class.
	
	And if In Inherirance
	our class Car extends Engine
	so here IS-A relationship will establish
	and both two classes become tightly coupled

======================================================

 _________________________________________________
|                  Association                    |
|    _________________________________________	  |
|   |                                         |   |
|   |              Aggregation                |   |
|   |    _________________________________    |   |
|   |   |                                 |   |   |
|   |   |           Composition           |   |   |
|   |   |                                 |   |   |
|   |   |_________________________________|   |   |
|   |                                         |   |
|   |_________________________________________|   |
|                                                 |
|_________________________________________________|

			
i) Aggregation is weak bonding
ii) Composition is strong bonding

i) Aggregation:
e.g:
class Car
{
	MusicPlayer mp = new MusicPlayer();
}
class MusicPlayer
{
	
}	
	so here car has a MusicPlayer relationship
	so here there is weak bonding
	like if Car has not a MusicPlayer still
	it can work
	and same if MusicPlayer has not a Car still
	it can work
	
e.g:

ii) Composition:
e.g:
class Car
{
	Engine e = new Engine();
}
class Engine
{
	
}
	so here Car has a Engine
	so here is a Strong bonding
	like if Car has not a Engine so it will
	not work without it
	same if Engine has not a Car so
	it will not work without it
	
====================================================
	Relation Between Classess
	
Inheritance           |          Association
----------------------|------------------------------------------------------
(IS-A)		      |		(HAs-A)
extends		      |		reference variable,object, new keyword
blood relation	      |		non-blood 
tightly coupled       |		not tightly coupled
		      |		Types of Relation
		      |		Aggregation and Composition
	
	
	So Association benefits the more
	as it does not make our application 
	tightly coupled
				

*/

package oops.Aa13_OOPS_InOneGo;

public class A3_Relation_betn_classes {

}
