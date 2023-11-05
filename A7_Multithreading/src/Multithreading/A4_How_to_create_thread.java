/*
 How to create a Thread:

There are two ways to create Thread
i) By using Thread(class)
ii) By using Runnable(interface)
-----------------------------------------------------------
 Thread class
 
 Thread class in Java is a Predefined API
 contains many constructors and methods.
 
 package java.lang;
public class Thread implements Runnable
{
	// constructors
	// methods
	 
	 run(){ }
	 start() { }
	 // and many more constructors and methods
	   
}	 
---------------------------------------------------------
 Runnable interface
 
 Java has Runnable interface
 and it has only one method that is
 run() method
 
 package java.lang;
 public interface Runnable
 {
 	// method
 	  run()
 }	  
-----------------------------------------------------------
 Thread class run() method is overriding the Runnable
 interface run() method because Thread class
 implements the Runnble interface.
------------------------------------------------------------
 NOTE: when we inherit class we use extends keyword
       and when we inherit interface we use implements keyword
 
 
 ii) creating Thread using Runnable interface:
 
 Step 1: implements Runnable interface
 Step 2: Override the run() method
 Step 3: Create an object of the class (Test t = new Test())
 Step 4: here we cannot Start the thread by 
         using directly start() method because start
         method is in predifined Thread class
         and now we are not inheriting property
         of Thread class we are implementing
         property of Runnable interface and
         runnable interface dont have any start()
         method.
         so we have to create predefined thread class object
         and pass reference or object or thread(t) of
         class(Test) who's object we have created(t)
         to constructor of predefined thread class
         while creating thread class object.
         (Thread th = new Test(t))
         and if we dont pass any reference to the
         constructor of predefined thread class
         then it will not know which method has
         to be called.
 Step 5: and now start thread by using start() method
        ( th.start() )

 
 e.g:

 class Main
 {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Thread th = new Test(t);
		th.start(); 
					 
	}
}

class Test implements Runnable
{
	public void run()
	{
		System.out.println("Hello");
	}
}
	output: Hello
 
 
---------------------------------------------------------------

 Q) Which is the better way to create thread?
   i) By using Thread class
     OR
   ii By using Runnable interface
   
Ans It requires four Steps to create thread
    using thread class and five Steps requires
    to create thread using Runnable interface
    But still
	Better way to create thread is by using
    Runnable interface.
    
    if one class extends other class,
    now if we want to create thread of base
    class we have to inherit or extends thread class to it
    but we cannot again extends Thread class
    because Java does not support multiple
    inheritance. and base class which already
    inheriting or extends other class will not
    able to extends Thread class.
    e.g:
       class A extends B
       {
       
       }
    but we can implements the runnable interface
    e.g:
 	 class A extends B implements Runnable
       {
       
       }
 	now by implementing interface, one class
 	can inherit other class and also it can
 	implements interface also.
 	and now we can create thread of base class.
 	
 	thatswhy creating thread using runnable interface
 	is better way. because by this our programming
 	becomes easy and performance also increases.
 	
 	so by using runnable interface 
 	a class can extends other class and also
 	implements runnable interface and also that
 	class can used as a thread or we can create 
 	thread of that class.

--------------------------------------------------------------------
  e.g:
  
  class Main
 {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		Thread th = new Test(t); // this is thread
		th.start(); 
		
		// we can also use 
		 t.run(); // but this is not thread
		          // it is just simple method
		          
		// for creating thread all require steps
		// should be followed			 
	}
}

class Test implements Runnable
{
	public void run()
	{
		System.out.println("Hello");
	}
}
	output: Hello
 
------------------------------------------------------------------------------ 
 */

package Multithreading;

public class A4_How_to_create_thread {
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
		Thread th = new Thread(t);
		th.start();
		
	}

}
class Test2 implements Runnable
{
	public void run()
	{
		System.out.println("Hello");
	}
}
	
 
 