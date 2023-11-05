/*
class Main {
	                                         
	public static void main(String[] args)   // whenever we create simple program
  {						 // and whenver JVM will start executing
						 // program.JVM will create main thread for main class
						 // and notice we have not extended any
						 // thread class. so still JVM create main thread
		System.out.println("Hello");
		
		// and if we want to get name of main thread
		// or other thread we can use getName() method
		
		System.out.println(Thread.currentThread().getName()); // so this method
								      // will provide name
							              // of thread.
								      // currentThread() is a static method
								      // it will return the
								      // reference value of 
								      // current thread or thread class,
								      // and from that reference value only
								      // it will call getName() method
															   
	   	Thread.currentThread().setName("abc"); // we can also set the name of the thread
	   					       // by using this method
		System.out.println(Thread.currentThread().getName());

		
		System.out.println(100/0); // here in Runtime Exceptionwe  
					   // we can check thread name whether its
					   // change or not
								 					
		
		
	}

}

	output: Hello
		main
		abc
		Exception in thread "abc" java.lang.ArithmeticException: / by zero
		at Multithreading.A7_Naming_a_Thread.main(A7_Naming_a_Thread.java:47)

------------------------------------------------------------------------------------------------
e.g:

 class Main {
	
	public static void main(String[] args)  // here main thread first will be created.
   {						// this thread will peform 
						// task of main method
						// or all coding part of                          class Main
						// main method will be handle                     {
						// by main thread                              ___ public static void main(String args)
						//	                       this task will |    {   
						//                              be perform by |        Test t = new Test(); // this is thread(t) or Thread-0
						//                              main thread   |        t.start();
		                                //					      |___ }
						//						    }	
		System.out.println("First created thread of main class : "+ Thread.currentThread().getName());
		
		System.out.println("Hello : printed by " + Thread.currentThread().getName());
		
		Test t = new Test(); // here thread has been created by us
				     // and if you not set its name manually
				     // then its name  by default will be set by JVM                  class Test extends Thread
				     // and by default it name will be (Thread-0)                     { __
          //											       |  public void run()		
				     // this thread is created by programmer 		this task will |  {
				     // but this thread is present in main method        be perform by |     System.out.println("thread task");
				     // so indirectly this thread is created by main     thread (t) or |__ }      
				     // method and its name is set by JVM by default         Thread-0   }  	           
							                                                                   
		
				     // this thread will execute its task
				     // respective of its class
		
		System.out.println("Second thread : "+ t.getName());
		
		t.start();
		
		Test t2 = new Test();
		System.out.println("Third thread : " + t2.getName());
		t2.start();
		
		Test t3 = new Test();
		t3.setName("Swapnil Thread");
		System.out.println("Fourth thread : " + t3.getName());
		t3.start();
		
		// checking thread whether it is alive or not
		
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(t.isAlive()); // this method will show whether
						 // thread is alive or not
						 // It can be either alive(true)
						 // or Dead(false)
	}

}

class Test extends Thread
{
	public void run()
	{
		System.out.println("thread task : is executed by " + Thread.currentThread().getName());
		
	}
}

		output: First created thread of main class : main
			Hello : printed by main
			Second thread : Thread-0
			Third thread : Thread-1
			Fourth thread : Swapnil Thread
			thread task : is executed by Thread-0
			thread task : is executed by Thread-1
			true
			false
			thread task : is executed by Swapnil Thread

	 
	 
--------------------------------------------------------------------------------------------------
*/
package Multithreading;

public class A7_Naming_a_Thread {
	
	public static void main(String[] args)  // here main thread first will be created.
   {										// this thread will peform 
											// task of main method
											// or all coding part of                          class Main
											// main method will be handle                     {
											// by main thread                              ___ public static void main(String args)
											//	                           this task will |    {   
											//                              be perform by |        Test t = new Test(); // this is thread(t) or Thread-0
											//                              main thread   |        t.start();
		                                    //											  |___ }
										    //											  	  }	
		System.out.println("First created thread of main class : "+ Thread.currentThread().getName());
		
		System.out.println("Hello : printed by " + Thread.currentThread().getName());
		
		Tet t = new Tet(); // here thread has been created by us
							// and if you not set its name manually
							// then its name  by default will be set by JVM                  class Test extends Thread
							// and by default it name will be (Thread-0)                     { __
                            //																  |  public void run()		
							// this thread is created by programmer 		   this task will |	  {
							// but this thread is present in main method        be perform by |     System.out.println("thread task")
							// so indirectly this thread is created by main     thread (t) or |__ }      
							// method and its name is set by JVM by default         Thread-0  }  	           
							                                                                   
		
							// this thread will execute its task
							// respective of its class
		
		System.out.println("Second thread : "+ t.getName());
		
		t.start();
		
		Tet t2 = new Tet();
		System.out.println("Third thread : " + t2.getName());
		t2.start();
		
		Tet t3 = new Tet();
		t3.setName("Swapnil Thread");
		System.out.println("Fourth thread : " + t3.getName());
		t3.start();
		
		// checking thread whether it is alive or not
		
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(t.isAlive()); // this method will show whether
									// thread is alive or not
									// It can be either alive(true)
									// or Dead(false)
	}

}

class Tet extends Thread
{
	public void run()
	{
		System.out.println("thread task : is executed by " + Thread.currentThread().getName());
		
	}
}
