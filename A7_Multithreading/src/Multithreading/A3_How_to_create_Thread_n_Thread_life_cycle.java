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
public class Thread 
{
	// constructors
	// methods
	 
	 run(){ }
	 start() { }
	 // and many more constructors and methods
	   
}	 

---------------------------------------------------------
 
 package java.lang;
 public class Thread implements Runnable
 {
 	// constructors
 	
 	public Thread() { }
 	public Thread(Runnable target) { }
 	public Thread(String name) { }
 	public Thread(Runnable target,String name) { }
 	public Thread(ThreadGroup group,Runnable target) { }
 	public Thread(ThreadGroup group,String name) { }
 	public Thread(ThreadGroup group,Runnable target,String name) { }
 	public Thread(ThreadGroup group,Runnable target,String name,long stackSize) { }
 	
 	// methods
 	 
 	 // Basic Methods	                                                
 	 public void run() { }                                                
 	 public synchronized void start() { }                                                
 	 public static native Thread currentThread();                                                       
 	 public final native boolean isAlive();           
 	                                              
 
     // Naming Methods
 	 public final String getName() { }
 	 public final synchronized void setName(String name) { }
 
 	 // Daemon Thread Methods
 	 public final boolean isDaemon() { }
 	 public final void setDaemon(boolean on) { }
 	 
 	 // Priority Based Methods   
 	 public final int getPriority() { }
 	 public final void setPriority(int newPriority) { }
 	  
 	 // Prevent Thread Execution Methods	   
 	 public static native void sleep(long millis) throw InterruptedException;	   
 	 public static native void yield();
 	 public final void join() throws InterruptedException { }
 	 public final void suspend() { }   //----| This are now
 	 public final void resume() { }    //    | Depricated methods
 	 public final void stop() { }      //    | which are removed
 	 public void destroy() { }         //----| from JAVA
 	 
 	 // Interrupting a thread Methods
 	 public void interrupt() { }
 	 public boolean isInterrupted() { }
 	 public static boolean interrupted() { }
 	 
 	 // ...(many more methods)
 	   	   
 } 	    
-------------------------------------------------------------

i) Creating Thread by using Thread class:
 
 Steps for creating thread by using Thread class:
 
 Step 1: Extends the Thread class
 Step 2: Override the run() method
 Step 3: Create an object of the class
 Step 4: Start the thread by using start() method

 e.g:
 
 class Main
 {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.start(); 
					 
	}
}

class Test extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
}
	output: Hello
----------------------------------------------------------------	
 Lifecycle of Thread:
 
 1st Stage: We create thread() by creating 
 			object of the class which is inheriting
 			thread class(3rd Step of Thread Creation)
 			(Test t = new Test()).
 			
 2nd Stage: When we start the Thread by using
            (t.start()) method(4th Step of Thread Creation)
            our thread will be in Runnable state.
  
 3rd Stage: when start()(t.start) method will execute 
 			Thread will start peforming our task and invoke 
 			our run() method of class whos object
 			or thread is created. But
            when start() method will execute,  
            start() method which Java has
            already created in predefined Thread class
            will first complete or execute
            its own task or coding part
            then predifined Thread class it calls
            or it will go to the run() method 
            of class whos object or thread is created,
            which we want to execute.
            so Indirectly we are calling run()
            method from thread or object
            of class(t.start).
            The Thread which we have created
            (t.start) JVM will allocate it the 
            processor by using Thread Scheduler.
            
            Thread Scheduler: 
            It is a part of JVM which decides
            Which Thread should have to be called.
              OR
            It is a part of JVM which decides
            Which Thread should have to be called
            among multiple Threads on the basis
            of Algorithm.
            Algorithm like First come first serve
            or shortest job first or onrobbing
            scheduling etc.
            
            so indrectly it is depended on JVM
            which Thread should have to be called.
            
            so When Thread will be in runnable state
            JVM will allocate the processor
            to that Thread and then processor
            will come in Running state.
            that means Thread has started
            to executing its task or Thread
            will start to perform its task
            or we have invoked the thread.
            
            
 4th Stage: and if When the task of thread is 
            completed.Thread will come in Dead state.
            so this is like life cycle.
            And once if Thread came in Dead state
            then it will never again come in born state.
            
            
 5th Stage: But sometimes after running state
            Thread can go in non-runnable state also.
            
            Non-Runnable states:
            If thread is running and we put it into sleep mode
            for sometime like thread will go for sleep for 1 sec
            and again it will go in runnable state and again
            JVM will allocate processor to it and again it will
            go in running state then again it will go in 
            sleep mode then again in runnable state
            again JVM will allocate processor then again
            it will go in running state and then again in sleep mode.
            so we can use sleep method or waiting state or maybe
            waiting for other thread to join,
            suspend() thread or suspending
            thread are some steps through which thread can
            go in non-runnable state.
            
            when thread is executing its task and if we disturb
            (stop it for sometime)it so it will go in non-runnable
            state
               means 
            thread who is doing its task and if we stop it in middle for
            sometime by doing some coding then this thread
            will be in non-runnable state.
            so we can use sleep method or waiting state or maybe
            waiting for other thread to join,
            suspend() thread or suspending
            thread are some steps through which thread can
            go in non-runnable state.
            
            and from non-runnable state, thread can go again in
            runnable state again JVM allocate the processor
            to thread then it will go in running state then
            after completing task it will go in Dead Stage.
            
            This is life cycle of thread.
            
            
            
i) Creating Thread by using Thread class:
 
 Steps for creating thread by using Thread class:
 
 Step 1: Extends the Thread class
 Step 2: Override the run() method
 Step 3: Create an object of the class
 Step 4: Start the thread by using start() method

 e.g:
 
 class Main
 {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.start(); // start() method create calls
		           // tag for this method 
		           // or
		      	   // we can also say that it
			   // is registerting thread
			   // for thread scheduling
			   // or 
			   // through start() method 
		           // run() method is called
			   // and its internal working is
			   // it will create calls
			   // tag for thread (t)
			
	   t.start(); // if we call this method again
	              // by same thread
	             // then it will provide runtime exeption
	             // in output
	             // because we cannot invoke a thread
	             // again 
	              // because after Dead state thread
	              // will not be live again
	    				 
					 
	}
}

class Test extends Thread
{
	public void run()
	{
		// In run method we provide task of thread
		System.out.println("Hello");
	}
}
	output: Exception in thread "main" java.lang.IllegalThreadStateException  // JVM will create main thread also
			at java.base/java.lang.Thread.start(Thread.java:793)
			at Multithreading.Main.main(Main.java:33)
		    Hello
			 
        
       
            
            
            
  ____________        __________  JVM will allocate    __________ When task is    _______
 |   Born     |      |          |   the processor     |          | completed     |       |
 |  create    |----->| Runnable |-------------------->| Running  |-------------->| Dead  |
 | new Thread |      |          |                     |          |               |       |
 |____________|      |__________|                     |__________|               |_______|
            		   ^	                          |
            		  _|______________________________v_                               		
            		 |        Non-runnable state        |		
                         |   sleep(); waiting(); suspend()  |
                         |__________________________________|
            
    
       so there are toal Five stages in thread life cycle
            
            first Thread will be created
            Second it will go in runnable state
            third it will go in running state
	        fourth after running it will either go for non-runnable state    
	        or Dead state.
	        if it directly go in Dead state it will be fourth Stage
	        and after running state if it goes in non-runnable state
	        it will be the fifth stage.
	         
	       This is the life cylce of thread that is created by using 
	       thread class  
          
            
         e.g: real world example
         
                                        Assume Person is Thread
                             
                             
   	
     Stage 1: Person is born                 Stage 2: Person is               Stage 3: Person is                     Stage 4: Dead State
     Person p = new Person();	             in Runnable state                 in Runnable state
                ___________	              _____________                     ______________                         ________________
               |   O><	   |   p.start()     |      _      | When person is    |      _       | When person complete  |      O-<-<     |
               | Born Baby |                 |    \(_)/    | selected for job  |     (_)      | its life tasks        |   Dead Person  |
               |___________|---------------->|    __|__    |------------------>|    _|_|_     |---------------------->|________________|
                                             |   | !O  |   |                   |   | HP  |    |
                                             |   |_____|   |                   |   |_____|    |
                                             |    Person   |                   |    Person    |
                                             |  completed  |                   |    working   |
                                             |   Eating    |                   |      on      |
                                             |    Food     |                   |    laptop    |
                                             |_____________|                   |______________|  
                                                    ^                                 |
                                                  __|_________________________________v_____ 
                                                 |                Zzzz                      |
                                                 |                O->-<                     |
                                                 | Person Sleeping or taking rest on Bed    |
                                                 |__________________________________________|             
                                                         Stage 5: Non-Runnable State
             
             
             
                
            
 
 
 
*/
package Multithreading;

public class A3_How_to_create_Thread_n_Thread_life_cycle {
	public static void main(String[] args) {
		
		Test t = new Test();
		t.start(); 
		
		t.start();	
	}
}

class Test extends Thread
{	
	public void run()
	{
		System.out.println("Hello");
	}

}
