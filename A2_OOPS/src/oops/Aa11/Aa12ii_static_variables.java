/*
 
 static variable:
 e.g:
 
 class Test
 {
 	static int a = 10;
 	
 	void m1()
 	{
 		int b = 20;
 		
 		static in c = 30; // it is not possible
 			            // because it is local variable
 			            // and only class level variable
 			            // can be static
 	}
 }	
 
 Static variable does not need object to access
 it is directly access by class name.
 Because static variable belongs to the class
 and not any method
 
 E.g:
 class Test
 {
 	static int a = 10;
}
class Demo
{
 	public static void main(String args[])
 	{
 		System.out.println(Test.a); // so here without
 					// creating object 
 					// we can access
 					// static variable
 					// with only class name
 	}
 	
} 		
 		
-------------------------------------------------------------
Q) Why we create static variable?
    Use:
    static variable are used for memory management.
    Because of static keyword our program becomes
    memory efficient
    
    E.g: without using static variable
    
    class Employee
    {
    	int empid;
    	String name;
    	String company;
    	
    	Employee(int empid, String name; String company)
    	{
    		this.empid = empid;
    		this.name = name;
    		this.company = company;
    	}
    	
    	void display()
    	{
    		System.out.println(empid + " " + name + " " + company);
    	}	
		
		public static void main(String args[])
		{
			Employee e1 = new Employee(1,"Swapnil","Jforce");
 			e1.display();
 			
 			Employee e2 = new Employee(2,"Yash","Jforce");
 			e2.display();
 			
 			// so here e1 contains one employee details
 			// with three variables (empid,name,company)
 			// and e2 contains other employee detail
			// with same variables
 			// so more the employee, more the object will be created
 			// and if all employee have same company
 			// so here the same name will occupy memory
 			// again and again in each of their object
 			 
 			 // so we can solve this problem by using static variable
 
 		}
 		
 	}		
 output: 1 Swapnil Jforce
  	 2 Yash Jforce
  		 
 ________________________________________________________
|                                                        |
|                       ___________________________      |
|   |	          |    |   _____________________   |     |
|   |             |    |  |    empid = 2        |  |     |
|   |             |    |  |   name = "Yash"     |  |     |
|   |             |    |  |  company = "Jforce" |  |     |
|   |	          |    |  |_____________________|  |     |
|   |	          |    |   _____________________   |     |
|   |	          |    |  |     empid = 1       |  |     |
|   |      e2     |    |  |   name = "Swapnil"  |  |     |
|   |             |    |  |  company = "Jforce  |  |     | 
|   |      e1     |    |  |_____________________|  |     |
|   |             |    |                           |     |
|   |_____________|    |        Heap Memory        |     |
|    Stack Memory      |___________________________|     |
|      (LIFO)                                            |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


-------------------------------------------------------------------------
	e.g: usig static variable

     class Employee
    {
    	int empid;
    	String name;
        static String company = "Jforce";
    	
    	Employee(int empid, String name)
    	{
    		this.empid = empid;
    		this.name = name;
    	}
    	
    	void display()
    	{
    		System.out.println(empid + " " + name + " " + company);
    	}	
		
		public static void main(String args[])
		{
			Employee e1 = new Employee(1,"Swapnil");
 			e1.display();
 			
 			Employee e2 = new Employee(2,"Yash");
 			e2.display();
 			
 			// so here e1 contains one employee detail
 			// with two variables (empid , name)
 			// and e2 contains other employee detail
			// with same variables
 			// so more the employee, more the object will be created
 			// and now all the employee object refer company name 
 			// from static variable
 			 // so the object in previous program
 			 // who was occupying memory multiple times
 			 // in each object
 			 // now will occupy memory only one time.
 			
 			 // when a variable is declared as static,
 			 // then a single copy of variable is created
 			 // and shared among all objects as class level.
 			 // Thus company name i.e. Jforce will be
 			 // shared among e1,e2 and all the objects.
 			
 			 // so the variable value which is common
 			 // can be used as static variable
 			 //  OR
 			 // The static variable can be used to refer
 			 // to the common property or value for all
 			 // objects, for example company name of
 			 // employees, college name of students,etc.
 		
 		
 		}
 		
 	}		
 	 output: 1 Swapnil Jforce
  	         2 Yash Jforce
  		     
 ________________________________________________________
|                 _____________________                  |                      |
|                | company = "Jforce"  |                 |
|                |_____________________|                 |
|                  class or Method Area                  |
|                                                        |
|                                                        |
|                       ___________________________      |
|   |	          |    |   _____________________   |     |	      
|   |             |    |  |    empid = 2        |  |     |
|   |             |    |  |   name = "Yash"     |  |     |
|   |	          |    |  |_____________________|  |     |
|   |	          |    |   _____________________   |     |
|   |	          |    |  |     empid = 1       |  |     |
|   |      e2     |    |  |   name = "Swapnil"  |  |     |
|   |      e1     |    |  |_____________________|  |     |
|   |             |    |                           |     |
|   |_____________|    |        Heap Memory        |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


// static variable are store in class or Method Area
// and objects are stored in Heap Memory
 // static variable can be shared by all objects 
 
// Program or software speed also becomes fast
 
// The static variable gets memory only once in the
// class area at the time of class loading.

--------------------------------------------------------------------
e.g:

 class CounterDemo
 {
    int count = 0;
    
    CounterDemo()                                                           
    {                                                           
       count++;                                                        
       System.out.println(count);                                                      
    }                                                         
                                                             
    public static void main(String args[])                                                         
    {                                                         
     	CounterDemo c1 = new CounterDemo();
     	CounterDemo c2 = new CounterDemo();
     	CounterDemo c3 = new CounterDemo();

    }                                                        
 }                                                            
   output: 1                                                          
           1                                                 
           1              
           
 ________________________________________________________
|                                                        |
|                                                        |
|                       ___________________________      |
|   |	          |    |   _____________________   |     |	      
|   |             |    |  |    count = 0        |  |     |
|   |             |    |  |_____________________|  |     |
|   |             |    |   _____________________   |     |
|   |      c3     |    |  |    count =  0       |  |     |
|   |	          |    |  |_____________________|  |     |
|   |	   c2     |    |   _____________________   |     |
|   |	          |    |  |     count = 0       |  |     |
|   |      c1     |    |  |_____________________|  |     |
|   |             |    |                           |     |
|   |_____________|    |        Heap Memory        |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|


                                                             
----------------------------------------------------------------------                                                             
 
 e.g:

 class CounterDemo
 {
   static int count = 0;
    
    CounterDemo()                                                           
    {                                                           
       count++;                                                        
       System.out.println(count);                                                      
    }                                                         
                                                             
    public static void main(String args[])                                                         
    {                                                         
     	CounterDemo c1 = new CounterDemo();
     	CounterDemo c2 = new CounterDemo();
     	CounterDemo c3 = new CounterDemo();

    }                                                        
 }                                                            
   output: 1                                                          
           2                                                 
           3                 
           
 ________________________________________________________
|                 _____________________                  |                      |
|                |      count = 0      |                 |
|                |_____________________|                 |
|                  class or Method Area                  |                                                		 
|                                                        |
|         		___________________________      |
|   |	          |    |   _____________________   |     |	      
|   |             |    |  |                     |  |     |
|   |             |    |  |_____________________|  |     |
|   |             |    |   _____________________   |     |
|   |      c3     |    |  |                     |  |     |
|   |	          |    |  |_____________________|  |     |
|   |	   c2     |    |   _____________________   |     |
|   |	          |    |  |                     |  |     |
|   |      c1     |    |  |_____________________|  |     |
|   |             |    |                           |     |
|   |_____________|    |        Heap Memory        |     |
|    Stack Memory      |___________________________|     |
|        (LIFO)                                          |
|                                                        |
|                        JVM Memory                      |
|________________________________________________________|

When we create c1 object, constructor will be called
and the value of count becomes 1, when we create
c2 object, again constructor will be called and 
count value becomes 2, then 3 and so on 
whenever we create new object.
                                      
                                                             
for finding how many objects are created we
can use static keyword like above example.                                                             
----------------------------------------------------------------------                                                             
 
 
 
 */

package oops.Aa11;

public class Aa12ii_static_variables {

}
