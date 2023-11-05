/*
Daemon Thread:
Daemon Thread are the threads which run in
background of some another thread.
And providing service to the main thread.
And its life depends on the main thread.

Use:
Daemon thread service to the main threads

e.g: Garbage Collector, finalizer,Attach Listeners,
	 signal dispatchers etc.
	 are some thread which are executed in
     background.
     
     When Main method is running and when memory 
     becomes full or there is memory leakage problem.
     so Garbage collector which
     is a thread running in background will delete 
     the useless or waste object in main method
     and again execute main method properly.
     so Garbage collector is a thread which
     is running in background and providing 
     service to main method. 
     Service like whichever is the
     main thread will be prevented from
     memory problem. like when memory problem
     occurs in main method, Garbage collector
     thread will delete useless or waste 
     object and free the space so that main
     method should continue to execute properly.


	e.g: In Word application While writing,
	     there is some thing which is checking spelling and 
	     whenever there is spelling mistake of any word
	     it underlines that word with red line.
	     so thing which is checking the spelling
	     is a spelling checker thread which is 
	     executing in background and its checking
	     whether what we are writing, 
	     its spelling is right or not.
	     This type of thread are called
	     Daemon thread because it is running
	     in background and providing service
	     to the other thread.
	     So Spelling checker is also a Daemon thread.

-------------------------------------------------------------------

Methods for Daemon thread

1. public final void setDaemon(boolean b) // this method converts
					  // simple thread to Daemon thread.
					  // if we provide true then it will
					  // convert simple thread to Daemon thread
					  // and if we provide false then
					  // it will not convert.
					  // and its return type is void
					  // means it does not return anything.
								
2. public final boolean isDaemon()  // it checks whether the thread 
   {				    // is Daemon thread or not.
				    // if it is Daemon thread then it will 
   }				    // provide true or else false.			



e.g:

class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		
		Test t  = new Test();
		t.setDaemon(true);  // so here we have set Daemon thread
		t.start();          //  so this thread will execute its method
				    // ( run() method of Test class ).
			            // Daemon thread is executing its tasks
				    // in background of main method (main thread task)
				    // so as long as main method is executing
				    // Daemon thread or Daemon thread task is also excecuting
		
	}

}

class Test extends Thread
{
	public void run()
	{
		System.out.println("Child thread");
		
	}
}

	output: Main Method
			Child thread
			

-----------------------------------------------------------------------------------			
 Note: Whenever you create Daemon thread,
       always remember before starting Thread
       ( t.start() )  you have to create 
       thread as a Daemon thread (t.setDaemon(true)).
 	   
       But if you start thread (t.start) and after that
       setting a thread as Daemon thread (t.setDaemon(true)).
       then it will provide runtime Exception,
       It will provide IllegalThreadStateException.
       and it will not create it as a daemon thread.
 	   
 Case 1: we have to create Daemon thread before
         starting the thread, if we create 
         daemon thread after starting it, it
         will throw run-time exception i.e.
         IllegalThreadStateException.
         
  e.g:
         
         
class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		
		Test t  = new Test();
		t.start();
		t.setDaemon(true);
		
	}	
}


class Test extends Thread
{
	public void run()
	{
		System.out.println("Child thread");
		
	}
}
        
     output: Exception in thread "main" Child thread
			java.lang.IllegalThreadStateException
		    at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
		    at Multithreading.Main.main(Main.java:144)
			
			         
         
         
--------------------------------------------------------------------
 Case 2: we cannot create main thread as a 
         daemon. because main thread always 
         execute first.
            OR
         Because when JVM will go inside 
         main method it will create main
         thread and it will start it also.
         and after starting of thread
         we cannot make it Daemon thread.
         and if we try to convert main
         thread to daemon thread it will
         throw runtime exception.
         
e.g: Trying to set main thread as Daemon thread

class Main {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setDaemon(true);
		
		
	}	
}

output: Exception in thread "main" java.lang.IllegalThreadStateException
		at java.base/java.lang.Thread.setDaemon(Thread.java:1403)
		at Multithreading.Main.main(Main.java:176)
------------------------------------------------------------------------------------
  Daemon thread life:
   
   (
    )    
   (     (
    )     )
   (     ( 
    )     )
   (     Daemon Thread
    ) 
  Main 
  Thread
  
  Daemon thread runs in background of main thread
  and provide service to the main thread.
  Daemon thread life depends on the
  (main thread)thread whom which it (daemon thread)
  is running behind in background.
  Means as long as main thread is running 
  Daemon thread is also running.
  And as soon as main thread ends, daemon
  thread will aso end.
  Thus its life depends on the main thread.
-----------------------------------------------------------------------------------

 If main thread is not doing any task/work 
 or main thread has not any code to execute 
 then child thread will also not perform its
 task.
 Daemon thread provide service to the parent(main)
 thread. So if Parent(main) Thread is doing 
 some task then only daemon thread will provide
 it service. But if Parent(main) thread is not 
 doing any task/work, so whom will the daemon
 thread provide service.

e.g:

class Main{
	
	public static void main(String[] args) {
		

		Test1 t = new Test1();
		t.setDaemon(true);
		t.start();
		
		
	}	
}

class Test1 extends Thread
{
	public void run()
	{
		System.out.println("Child thread task");
	}
}

	output: 
	
	here there will be no output because
	main thread here is not having any code
	to work it is only starting daemon thread.
	But if main thread is not working 
	daemon thread will not perform its task.
	
-----------------------------------------------------------------------------------

Daemon thread nature:

	Daemon thread property/nature/priority
	inherits from its parent(main) thread
	 Means
	Daemon thread inherits property from the
	thread whom which it (daemon thread) is
	running in background
  
    If parent thread is normal thread
    then thread created by parent thread 
    or thread inside parent thread or  
    child thread of parent thread will also be 
    normal thread. and we can convert it
    (child thread) to daemon thread.
    
    e.g: 
 
	
	class Main 
	{
		public static void main(Strings args[])
		{
			
			System.out.println("Parent thread is Daemon Thread : " + Thread.currentThread().isDaemon());
	
			Test t = new Test();
			t.start();
		
		
		}	
	}
	
	class Test extends Thread
	{
		public void run()
		{
			System.out.println("Child thread is Daemon Thread : " + Thread.currentThread().isDaemon());
		}
	}
	
	output: Parent thread is Daemon Thread : false
			Child thread is Daemon Thread : false
			
     ------------------------------------------------------ 
    
    And if parent thread is daemon thread
    then thread created by parent thread
    or thread inside parent thread will 
    also be daemon thread. and we dont have
    to manually create it (child thread)
     as daemon thread.
     
     
class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main thread is Daemon Thread : " + Thread.currentThread().isDaemon());


		Test1 t1 = new Test1();
		t1.setDaemon(true);
		t1.start();
		
		
	}	
}

class Test1 extends Thread
{
	
	public void run()
	{
		
		System.out.println("Parent thread is Daemon Thread : " + Thread.currentThread().isDaemon());
		
		Test2 t2 = new Test2();
		t2.start();
		
	}
}

class Test2 extends Thread
{
	public void run()
	{
		System.out.println("Child thread is Daemon Thread : " + Thread.currentThread().isDaemon());

	}

}

	output: Main thread is Daemon Thread : false
			Parent thread is Daemon Thread : true
  
  
-----------------------------------------------------------------------------------
JVM role in Daemon thread:

 If we have multiple threads in our programs.
 Ans as long as they are executing, so JVM
 knows that these threads are now executing
 and JVM will work properly. But as soon as
 the last thread will stop executing or
 all the threads will stop executing or
 all threads will go in Dead state then 
 JVM will shut down.So these are the simple
 threads, which when stop executing JVM
 will also Shut down then. But if we have any
 daemon thread and other threads are gone
 in dead state but daemon thread in background
 is still executing. So JVM will put that
 daemon thread in dead state and then it (JVM)
 will shut down. 
 so JVM does not depends on
 daemon thread but depends on other simple
 threads. As long as other simple threads
 are working JVM also works(run) properly
 otherwise JVM will shutdown.
 But if only daemon thread is running in last
 so JVM will stop it by putting that
 daemon thread into dead state and then it (JVM)
 will shut itself.
 Daemon thread is an utmost low priority thread.

 
 Priority: When the only remaining threads in a 
           process are daemon threads, the interpreter
           exits. This makes sense because when only 
           daemon threads remain, there is no other 
           thread for which a daemon thread can 
           provide a service.
Usage: Daemon thread is to provide services to 
       user thread for background supporting task.
-----------------------------------------------------------------
Daemon thread priority:

 Daemon thread priority should be kept low,
 by default it priority is low only but we have
 to keep it low only. Because it is executing in
 background of parent thread. so daemon thread
 priorities should be low as compare to its
 parent thread, also we can keep daemon thread
 priorities same(equal) like its parent thread priorities
 but not high.
 daemon thread priorities can be kept low or equal
 to its parent thread priorities but not high.
 But Always try to keep daemon thread priorities
 low as compare to its parent thread priorities.

 Most of the times daemon thread has low priority.
 but we can change its priority. According to our
 needs. 
-------------------------------------------------------------------------------
Q) Is it possible that a parent thread dies before
   the child thread?


All Threads are 'unrelated', there are no parent 
and child threads. So once the 'parent' thread 
kicks off 'child1' and 'child2', then the three 
threads are independent. They can end in any 
order and they don't affect the running of 
other threads. Which means 'parent' can die 
before 'child1' and 'child2'.

There are some modifications to this. 
For example, if 'parent' is the last non-daemon 
thread running (and thus 'child1' and child2' 
threads are daemon threads), then when 'parent'
dies, the JVM starts to shutdown, so the 'child' 
threads would also die. The last modification 
would be if you have some synchronizing code 
that prevents 'parent' from dieing until the 
'child' threads die, or that signals the 'child'
 threads to die when the 'parent' does.

----------------------------------------------------------------------------
*/
package Multithreading;

public class A8_Daemon_Thread_related_methods extends Thread
{
	public A8_Daemon_Thread_related_methods(String name) 
	{
		super(name);
	}
	
	public void run()
	{
		// checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon())
			System.out.println(getName() + " is Daemon thread");
		else
			System.out.println(getName() + " is Simple thread");
	}
	
	public static void main(String[] args) {
		
//		System.out.println("Main thread is Daemon Thread : " + Thread.currentThread().isDaemon());


		A8_Daemon_Thread_related_methods t1 = new A8_Daemon_Thread_related_methods("t1");
		A8_Daemon_Thread_related_methods t2 = new A8_Daemon_Thread_related_methods("t2");
		A8_Daemon_Thread_related_methods t3 = new A8_Daemon_Thread_related_methods("t3");
		
		// Setting simple thread t1 to Daemon thread
		t1.setDaemon(true);
		
		// starting first 2 threads
		t1.start();
		t2.start();
		
		// setting user simple thread t3 to Daemon thread
		t3.setDaemon(true);
		t3.start();
		
		
		
	}	
}

	






	


