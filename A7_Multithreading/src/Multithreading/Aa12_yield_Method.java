/*
 yield() method:
 
 yield() method stops the current thread from execution.
 and give rest of the threads (threads whose priorities are
 same or high ) permission to execute or give
 chance to other threads to execute first.
 	OR
which stops the current executing thread & give
a chance to other threads for execution.

e.g:

If you go to Shopping center for shopping there you have
selected multiple products and you go to cash counter 
for billing your products. But suddenly one person
came after you for billing the product and he has
only one product for billing.And due to your
multiple products it may take 15-20 min for
billing products. but the person after you has
only one product and in his case it will require 
only few minutes or seconds for billing product.

  	
  	 _____________________________________
  	|             Person1      Person2    |
    |             Thread1      Thread2    |
    |                (            (       |
    |   _______       )            )      |
    |  |   _   |     (            (       |
    |  |  (_)  |      )            )      |
    |  |__|_|__|     (            (       |
    |  |       |    _ )__        _ )__    |
    |  |Billing|   | * * |      |     |   |
    |  |Counter|   | * * |      |  *  |   |
    |  |_______|   |_*_*_|      |_____|   |
    |_________________|____________|______|
                      |            |
 					Having        Having
                    multiple      single
                    no. of         product
                    products
                    
                    
                    
   so here we will give first chance to the person 
with less product for billing process and after him
you will be the next for billing process.

so yield() method will stop current thread from
execution and give next thread chance to execute
first.

----------------------------------------------------------------------

  Working of yield() method:
  
  In Java 5: yield() method internally used sleep() method  
                    
  In Java 6: Thread provides the hint to the
             thread scheduler. that (thread)it is going
             to stop [ and give rest of the threads 
             (threads whose priorities are
 			 same or high ) permission to execute 
 			 or give chance to other threads to execute first.]
             and it doesn't have any 
             problem with it.(
             But internally it depends on thread
             scheduler to accept or ignore
             the hint of thread.
             if thread scheduler accept the hint
             than current thread will stop and
             other threads will execute.
             if thread scehduler ignore the hint
             then the current thread will
             continue executing.
             Therefore we cannot think of any
             constant output.Maybe it will
             give different output first time and
             it will give different output second
             time.
                    
------------------------------------------------------------------
  
  Prototype of yield() method:
  
  public static native void yield();
  
  Its returns type is void.
  It is static method, means it can directly
  execute or call using class name.
  It is native method means its implementation
  is done in some other languages.
  
-------------------------------------------------------------------------------

  Program output:
  We cannot expect same output for program each time.
  It doesn't depends on us it is dependent on
  thread scheduler.              
                    
----------------------------------------------------------------------------------

  e.g:
  
  class Test extends Threads
  {
  	
  	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		Thread.yield();  // if you want main method to stop and provide chance to other threads for execution
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+ i);

		}
	}
  	
  
  }
         
         
		output:	Thread-0 1
				Thread-0 2
				Thread-0 3
				Thread-0 4
				Thread-0 5
				Main Thread 1
				Main Thread 2
				Main Thread 3
				Main Thread 4
				Main Thread 5
				
				
 so here main when starts executing and when it
 find yield() method. it will provide hint 
 to the thread scheduler that it is going to stop
 and it depends on thread scheduler whether to accept
 main thread hint or not. if it accept hint than
 it will allow main thread to stop executing till
 the other thread execution is going on and after
 completion of tasks of other threads it will again
 starts execution of main thread.     
 
 
-------------------------------------------------------------------------------- 
 But if it ignores the hint of main thread
 then the execution of main thread will not stop
 and the execution of both main and other threads
 will be done simultaneously.
 
  e.g:
  
  class Test extends Threads
  {
  	
  	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		Thread.yield();
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+i);

		}
	}
  	
  
  }
         
         
		output:	Main Thread 1
				Main Thread 2
				Thread-0 1
				Main Thread 3
				Thread-0 1
				Main Thread 4
				Thread-0 3
				Thread-0 4
				Thread-0 5
				Main Thread 5
				Main Thread 6
				Main Thread 7
 
                    
 Note: Output may be different each time.
------------------------------------------------------------------------

   	 _______________________________________________________________
  	|             Person1      Person2      Person3     Person4     |
    |             Thread1      Thread2       Thread3     Thread4    |
    |                (            (            (           (        |
    |   _______       )            )            )           )       |
    |  |   _   |     (            (            (           (        |
    |  |  (_)  |      )            )            )           )       |
    |  |__|_|__|     (            (            (           (        |
    |  |       |    _ )__        _ )__        _ )__       _ )__     |
    |  |Billing|   | * * |      |     |      |     |     |  *  |    |
    |  |Counter|   | * * |      |  *  |      | * * |     |  *  |    |
    |  |_______|   |_*_*_|      |_____|      |_____|     |__*__|    |
    |_________________|____________|____________|___________|_______|           
                      |            |
 					Having        Having
                    multiple      single
                    no. of        product
                    products
                    
                    
   suppose if there are multiple Persons in line 
   for billing process so which person will go for billing
   products first. Means if there are multiple
   threads in line for execution. so which thread
   will execute first, It depends on thread scheduler.
   
   If we stop one thread using yield() method and 
   that indication will go to thread scheduler whether
   to accept that hint or not. if it accepts that
   hint that it will stop that current thread
   from execution and starts execution of  other threads
   which were in waiting state. But among that
   threads also. which thread will execute first
   will depends on the thread scheduler.
   
   
    e.g:
  
  class Test extends Threads
  {
  	
  	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		Test t2 = new Test();
		t2.start();
		
		Test t3 = new Test();
		t3.start();
		
		
		Thread.yield();
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() +" "+ i);

		}
	}
  	
  
  }
  	
	     output:	Thread-0 1
					Thread-0 2
					Thread-2 1
					Thread-1 1
					Thread-1 2
					Thread-1 3
					Thread-1 4
					Thread-2 2
					Thread-2 3
					Thread-0 3
					Thread-2 4
					Thread-1 5
					Thread-2 5
					Thread-0 4
					Thread-0 5
					Main Thread 1
					Main Thread 2
					Main Thread 3
					Main Thread 4
					Main Thread 5
   
   
-----------------------------------------------------------------------------   
   
   and if it not accepts that hint than all
   the thread will execute simultaneously.
   
   
       e.g:
  
  class Test extends Threads
  {
  	
  	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		Test t2 = new Test();
		t2.start();
		
		Test t3 = new Test();
		t3.start();
		
		
		Thread.yield();
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() +" "+ i);

		}
	}
  	
  
  }
  
  		output:  	Thread-0 1
					Main Thread 1
					Thread-2 1
					Thread-1 1
					Thread-2 2
					Main Thread 2
					Main Thread 3
					Thread-0 2
					Main Thread 4
					Main Thread 5
					Thread-2 3
					Thread-2 4
					Thread-2 5
					Thread-1 2
					Thread-0 3
					Thread-0 4
					Thread-0 5
					Thread-1 3
					Thread-1 4
					Thread-1 5
  
  
  
   
   Output may change each and every time.
   Because thread scheduler decide which
   thread to execute first randomly.
   
--------------------------------------------------------------------------------------                    
 Not only yield() method is used to stop main thread 
  we can also use yield() method to stop other threads
  
  e.g:
  
  class Test extends Threads
  {
  	
  	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.start();
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		Thread.yield(); 
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+ i);

		}
	}
  	
  
  }
            
        output: Main Thread 1
				Main Thread 2
				Main Thread 3
				Main Thread 4
				Main Thread 5
				Thread-0 1
				Thread-0 2
				Thread-0 3
				Thread-0 4
				Thread-0 5
        
------------------------------------------------------------------

  Output may vary from machine to machine.
  Output may changes each and every time.
 
 
 	 _______________________________________________________________
  	|             Person1      Person2      Person3     Person4     |
    |             Thread1      Thread2       Thread3     Thread4    |
    |                (            (            (           (        |
    |   _______       )            )            )           )       |
    |  |   _   |     (            (            (           (        |
    |  |  (_)  |      )            )            )           )       |
    |  |__|_|__|     (            (            (           (        |
    |  |       |    _ )__        _ )__        _ )__       _ )__     |
    |  |Billing|   | * * |      |     |      |     |     |  *  |    |
    |  |Counter|   | * * |      |  *  |      | * * |     |  *  |    |
    |  |_______|   |_*_*_|      |_____|      |_____|     |__*__|    |
    |_________________|____________|____________|___________|_______|           
                      |            |
 					Having        Having
                    multiple      single
                    no. of        product
                    products
  
  Priority with high thread only get 
  chance to execute first.
  If Thread2, Thread3, Thread4 Priority is high or same
  as Thread1( which we have yield() ) so than
  only Thread2, Thread3, Thread4 will get chance to
  execute. 
  or if Thread2, Thread3, Thread4 any of
  these thread Priority is low as Thread1 ( which we have yield() )
  so Thread1 will only execute before Thread
  with low priority.
  
  And Threads with same or high priority compare to
  Thread1 ( which we have yield() ) all these threads
  execution depends on thread scheduler, which
  thread to execute first.
  
  
                    
---------------------------------------------------------------------------------------                    
 */


package Multithreading;

public class Aa12_yield_Method extends Thread {
	
	public static void main(String[] args) {
		
		Aa12_yield_Method t1 = new Aa12_yield_Method();
		t1.start();
		
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Main Thread " + i);
		}
		
		
	}	
	
	public void run()
	{
		Thread.yield();
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+ i);

		}
	}

}
