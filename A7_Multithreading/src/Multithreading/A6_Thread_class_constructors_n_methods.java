/*
 
 Topics covered in Multithreading till now...!!
 
 1. What is Multitasking, Multiprocessing & Multithreading
 2. Difference between Process & Thread
 3. Thread Life Cycle & How to create Threads in java
 4. Two different ways to create Threads:
    i. By extending "Thread" class
    ii. By Implementing "Runnable" interface
 5. Thread execution cases:
    i. Performing single task from single thread
    ii. Performing single task from multiple threads
    iii. Performing multiple task from single thread
    iv. Performing multiple task from multiple threads
-----------------------------------------------------------------------    
 package java.lang;
 public class Thread implements Runnable
 {
 	// constructors
 	
 	public Thread() { }  // Default constructor
 	public Thread(Runnable target) { } 
 	public Thread(String name) { }  // Whenever we create any thread. JVM by default set name of thread
 									// but you can also set the thread manually.
 									// so by using this constructor we can provide 
 									// name for thread
 	public Thread(Runnable target,String name) { }
 	public Thread(ThreadGroup group,Runnable target) { }
 	public Thread(ThreadGroup group,String name) { }
 	public Thread(ThreadGroup group,Runnable target,String name) { }
 	public Thread(ThreadGroup group,Runnable target,String name,long stackSize) { }
 	
 	// methods
 	 
 	 // Basic Methods	                                                
 	 public void run() { }                                                
 	 public synchronized void start() { }                                                
 	 public static native Thread currentThread(); // it is static method   
 	                                              // this method provide thread
 	                                              // reference           			
 	 public final native boolean isAlive(); // is thread is alive or not
 	      									// or is thread is in execution
 	      									// state or not
 	                                              
 
     // Naming Methods
 	 public final String getName() { }  // we get thread name from this
 	 public final synchronized void setName(String name) { } // we provide thread name here
 
 	 // Daemon Thread Methods
 	 public final boolean isDaemon() { }
 	 public final void setDaemon(boolean on) { }
 	 
 	 // Priority Based Methods   
 	 public final int getPriority() { } // Each thread has its priority
 	 public final void setPriority(int newPriority) { }  
 	  
 	 // Prevent Thread Execution Methods	  
 	  // this are the methods which stop the thread
 	  // for specific time while its execution
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
 
  inter-thread communication methods:
  (means two threads communication with each other Method)
   
   This methods are not in thread class it is in Object class
   
   Class Object
   {
   		wait()
   		notify()
 		notifyAll()
 	}	
 
 
 
 
----------------------------------------------------------------------- 
 */


package Multithreading;

public class A6_Thread_class_constructors_n_methods {

}
