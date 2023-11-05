
/*
Encapsulation:
Wrapping of data members(variable) and member methods(method)
in a single unit.
   OR
Encapsulation means it binds data and code together into one 
unit.
	OR
Wrapping of data(variables) and code action on the data
(methods) together as a single unit.	

like describing all our variable as private
and accessing it from other class through getter and setter
methods.

-----Real world Examples===================================

Example1; the most commonly used example is the medical capsule.
 This capsule mixes few types of medicines and stored in one 
 capsule But we cannot see it from outside.
 and thus it making its data hide
 
 Example 2: another example for encapsulation is a large 
 organization. An organization is consists of several 
 departments like the production department, purchase 
 department, sales department, and Accounts department. 
 It combines all these departments together and had formed 
 the organization.
 
 -----------------------------------------------------------
 Steps to achieve encapsulation:
 1. Declare the variables of a class as private.
 2. Provide public setter and getter methods to
    modify and view the variables values.
 
 	e.g:
 	
 	class Employee
 	{						// declaring instance variable private
 		private int empid;  // that means we cannot access or modify
 							// this variable from another class using object
 							// this is known as Data Hiding
 		
 		public void setEmpid(int empid)   //providing setter method
 		{								// to set value of instance variable
 			this.empid = empid;        // by using reference variable
 			                           // from another class
 		}
 		
 		publc void getEmpid()   // prividing getter method to get value of
 		{                       // variable from another class
 			return empid;
 		}	
 	}	
 
 		so here we wrapped the instance variable empid
 		and setter and getter method together
 		in a class as a single unit 
 		so this is encapsulation.
 	
 


 */



package oops.A6_encapsulation;

public class A7_Encapsulation {

}
