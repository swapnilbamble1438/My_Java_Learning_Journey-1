/*
 Constructor:
 1)Constructor is a block(similar to method)
 having same name as that of class name
 2) Construtor does not have any return type
 not even void
 3) The only modifiers applicable for the 
 constructor are public protected default and private
 4)it executes automatically when we create 
 an object
 	
 Use of Constructor:	
 Constructors are used to initialize the object
 
 Types of Constructors:
 Three types of constructors:
 1. Default Constructor or no-arg constructor
    (create by compiler)
 2. No-Arg Constructor (create by programmer)
 3. Parameterized Constructor (create by programmer)
 
 
 e.g:
 
 class Test
 {
 	Test()
 	{
 			
 	}
 	
 	public static void main(String[] args)
 	{
 		Test t = new Test();
 		
 	}	
 		
 }
 --------------------------------------------------
 Class without using Constructor:
 
 e.g:
 
 class Employee
 {
 	String name="Swapnil";
 	int empId= 1;
 	
 	public static void main(String[] args)
 	{
 		Employee e1 = new Employee();
 		System.out.println(e1.name + " " + e1.empId);

 		Employee e2 = new Employee();
 		System.out.println(e2.name + " " + e2.empId);
 		
 	}
 	
} 	
 	output: Swapnil 1 
			Swapnil 1
			
			so for both object we will get
			the same value that why for
			object value intitialization we
			use constructor
 --------------------------------------------------------------
 */


package oops.Aa13_OOPS_InOneGo;

public class A2_Constructors_i {
	
	String name = "Swapnil";
 	int empId = 1;
 	
 	public static void main(String[] args)
 	{
 		A2_Constructors_i e1 = new A2_Constructors_i();
 		System.out.println(e1.name + " " + e1.empId);
 	
 	
 		A2_Constructors_i e2 = new A2_Constructors_i();
 		System.out.println(e2.name + " " + e2.empId);
 	
 	
 	}

}
