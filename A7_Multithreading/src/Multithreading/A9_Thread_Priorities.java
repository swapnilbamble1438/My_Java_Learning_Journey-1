/*
 Whenever we create new thread, Jvm by default
 set its priority. and base on that priority only
 Jvm allocate processor to each thread.
 Thus those thread priorities are high/more
 will get the processor first and will execute
 first and those priorities are low will get
 the processor later and will execute later.
 
 
 Priority: 
 It is an integer number. 
 Which is provided to each thread by JVM.
 and on that priority basis only JVM allocate
 processor to the threads and according to that
 only each thread will be executed.
 The thread which is more important we set its
 priority to high so that processor should
 allocate it first and it will execute first.
 So According to our use we can set priorities of
 Thread.
 
 
 
 
 
    If we have five threads, Jvm will set priorities
    of each thread and on that priority basis only
    it will execute.
    
      (   (   (   (   (
       )   )   )   )   )
      (   (   (   (   (
       )   )   )   )   )
      (   (   (   (   (
       )   )   )   )   )
      10   9   8   7   6   
      
      JVM will first execute thread with high
      priority and after that it will move
      to next thread and allocate processor to it,
      and that thread will also execute.
      then JVM will move to next thread.
     
      And if multiple threads priorities have same priorities.
      
      (   (   (   (   (
       )   )   )   )   )
      (   (   (   (   (
       )   )   )   )   )
      (   (   (   (   (
       )   )   )   )   )
      10   9   8   8   8 
      
      then we cannot assume which thread will be
      allocated processor next or which thread is going
      to execute next. It depends internally on Algorithm,
      that to which thread is going to execute first by JVM.
      and on these basis only threads are going to execute
    
--------------------------------------------------------------------------------

 Priorities:      
 Priorities are represented in the form of
 integer value. which ranges from 1 - 10 
 
 1-> MIN_PRIORITY
 5-> NORM_PRIORITY
 10-> MAX_PRIORITY
 
 So this three integer priority are by default
 provided By JAVA.
 so if you want to use 1,5,10 you can use this
 constants directly.
 Otherwise if you have to provide other
 number like 2,4 you can also provide it
 and for that you dont need any constant
 you have to provide it directly in integer
 format.
 
 Below are not the priorities.
 we cannot set priorites like 0 or number
 less than 1 or number greater than 10.
 e.g: 0, < 1, > 10 
 
 NOTE: MINIMUM_PRIORITY,
       LOW_PRIORITY,
       MEDIUM_PRIORITY,
       NORMAL_PRIORIIY,
       MAXIMUM_PRIORITY,
       HIGH_PRIORITY
       there are no priorities like this.
       It does not exists.
       These namings are not defined in Java.
       
       
  
 Priorities between 1-10 are only exists. 
 
 And there are only these priorities constants
 which exists:
       
 1-> MIN_PRIORITY
 5-> NORM_PRIORITY
 10-> MAX_PRIORITY
 
 and for left of the priorities except 1,5,10 
 Java has not provided any constants.
------------------------------------------------------------

 Methods for Priority:
 
 	public final setPriority(int value)
 	
 	public final int getPriority()
 	
 
 so these are the two methods which are used
 in Priority.
---------------------------------------------------------------
Nature Default:
Priorities are inherited from parent thread

By default main thread priority is 5
and the thread which is created by main
thread also will have priority 5 by default.
That means if we talk about default nature,
whichever is a new thread which is created will
inherits its property/priority from parent thread.
So the priority the parent/main thread have will
also be set to its child thread by default.


e.g:


class Main {
	
	public static void main(String[] args) 
	{
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		Test t = new Test();
		t.start();
		
	}

}

class Test extends Thread
{
	public void run()
	{
		System.out.println("thread task");
		System.out.println("Child thread priority: " + Thread.currentThread().getPriority());

	}
}

	output: Main thread priority: 5
		thread task
		Child thread priority: 5
--------------------------------------------------------------------------------------------------------
Also we can set priority manually

If we change Parent/main thread priority 
bydefault 10 then its child thread priority
will also be 10

e.g:


class Main {
	
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		Test t = new Test();
		t.start();
		
	}

}

class Test extends Thread
{
	public void run()
	{
		System.out.println("thread task");
		System.out.println("Child thread priority: " + Thread.currentThread().getPriority());

	}
}

	output: Main thread priority: 10
		thread task
		Child thread priority: 10
			
			
-------------------------------------------------------------------------------------------------------- 
 We can also change child thread priority.
 And it will not affect parent thread priority.
 
 
class Main {
	
	public static void main(String[] args) 
	{
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		Test t = new Test();
		t.start();
		
	}

}

class Test extends Thread
{
	public void run()
	{
		
		System.out.println("thread task");
		Thread.currentThread().setPriority(4);
		System.out.println("Child thread priority: " + Thread.currentThread().getPriority());

	}
}
 	
 		output: Main thread priority: 5
			thread task
			Child thread priority: 4
-------------------------------------------------------------------------------------------- 
 If priority value is not in between 1 - 10
 then it will throw a runtime exception
 i.e. IllegalArgumentException
 
 
 e.g:
 	
class Test
{
	
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(0);

		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		
	}

}
 
 	output: Exception in thread "main" java.lang.IllegalArgumentException
		at java.base/java.lang.Thread.setPriority(Thread.java:1138)
		at Multithreading.Test.main(Test.java:247)
--------------------------------------------------------------------------------------------------------
Priorities depends on the platform

Windows does not support priorities.
so whenever we make program with threads
having priorities. so maybe the thread 
with low priority will execute first then
the thread with high priority.
so thread execution sequence will not be
according to the priority.
Because Priority depends on the platfrom
and Windows does not support priorities.


-------------------------------------------------------------------------------------------------------- 
 */
package Multithreading;

public class A9_Thread_Priorities {
	
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(0);

		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		
	}

}


