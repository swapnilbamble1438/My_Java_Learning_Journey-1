/*

1. Performing single task from single thread. (we have done it)
2. Performing single task from multiple threads.
3. Performing multiple task from single thread.
4. Performing multiple task from multiple threads.
-------------------------------------------------------------------

	We will use Thread class to create threads
	in all our further program just for 
	understanding purpose.
	But in real world we should always prefer
	Runnable interface for creating thread.
	
	Note: It is bad practice for making thread
	      of Class with main method.
	      It is better to create thread with 
	      class no main method
	
---------------------------------------------------------------
	
1. Performing single task from single thread.
	
	e.g:
	
	
class Main {
	
	public static void main(String[] args) {
		
		Test t = new Test(); // we have only one thread
		t.start();
		
	}

}
class Test extends Thread
{
	public void run()    // and here we have just one method or task
	{
		System.out.println("Hello");
	}
}

	output: Hello
	
-------------------------------------------------------------------------------------	

2. Performing single task from multiple threads.
 
 	e.g:
 	
 		
class Main {
	
	public static void main(String[] args) // it is main thread which is
	{									   // which is created by JVM by default
		
		Test t = new Test(); // 1st thread
		t.start();
		
		Test t2 = new Test(); // 2nd thread
		t2.start();
		
	}

}
class Test extends Thread
{
	public void run()    // and here we have just one method or task
	{
		System.out.println("Hello");
	}
}

	output: Hello
			Hello
			
	
	so here there are total 3 threads.
	3rd thread is the main thread of main method
	which is created by JVM by default.
	so if we create one thread manually there
	will be 2 thread created. one is our created
	thread and 2nd one will be the main thread
	of main method.
---------------------------------------------------------------------------------------
3. Performing multiple task from single thread.
	
	It is not possible because A single thread at 
	a time can perform only one task, and after 
	completing first task it will perform next 
	task so this is not suitable for our 
	application.
	
	e.g:
	In
	VLC(Process) Application we have multiple threads
	one for playing video, one for playing audio,
	one for running timer, and one for running
	progress bar. 
	thread is a smallest process which only perform 
	one task. we dont divide thread further.
	And if we use a thread for playing video and
	also for playing audio then it will not 
	work well, first it will play video and
	then audio so it is not good for our 
	Application(VLC) and it does not make any sense.
	
------------------------------------------------------------------
4. Performing multiple task from multiple threads.

   It is possible, for multiple task you have
   to create multiple class with method and have
   to create multiple threads
   
   e.g:
   
class Test
{
	
	public static void main(String[] args) 
	{
		
		MyThread1 t1 = new MyThread1(); // first thread
		t1.start();
		
		MyThread2 t2 = new MyThread2(); // second thread
		t2.start();
			
		
	}
	
}
	
	class MyThread1 extends Thread
	{
		public void run()    // and here we have just one method or task
		{
			System.out.println("Task 1");
		}	
		
	}
	
	class MyThread2 extends Thread
	{
		public void run()
		{
			System.out.println("Task 2");
		}	
	
	}
	
	output: Task 1
	        Task 2

   Note: where there are multiple threads,
	 Execution of thread 
	 does'nt depend on their sequence.
	 Maybe Both threads will execute at same time.
		 
	 if there are two threads t1 and t2
	 and t1 is first in seqeunce
	 so it is not necessary that 
	 t1 will complete its task first
	 then t2 will complete its task.
	 maybe t2 will complete task first
	 then t1 will complete task.
		
	 so execution of threads does not
	 depend on thread sequence
	 it is depend on JVM,Thread Scheduler,
	 or algorithms. 
		
	 which thread will execute first 
	 or thread execution order is
	 depend on JVM, Thread Scheduler,
         or algorithms.
		 
	 so if there are multiple thread
	 all thread will execute at same time
	 and we cannot judge which thread
	 is executing first or thread execution
	 order
---------------------------------------------------------------------------------------		 
 Performing multiple task from multiple threads.
 
 e.g:
 
class VLC {
	
	public static void main(String[] args) {
		
		Timer2 timer = new Timer2();
		timer.start();
		
		PB2 progressBar = new PB2();
		progressBar.start();
		
		Video2 video = new Video2();
		video.start();
		
		Audio2 audio = new Audio2();
		audio.start();
		
		// so this all four threads are 
		// executing at a same time
		
		
		
	}
	
}
	
	class Timer2 extends Thread
	{
		public void run()    // and here we have just one method or task
		{
			System.out.println("Running Timer");
		}	
		
	}
	
	class PB2 extends Thread
	{
		public void run()
		{
			System.out.println("Running ProgressBar");
		}	
	
	}
	
	class Video2 extends Thread
	{
		public void run()
		{
			System.out.println("Playing Video");
		}
	}
	
	class Audio2 extends Thread
	{
		public void run()
		{
			System.out.println("Playing Audio");
		}
	}
 
 


-----------------------------------------------------------------------------------------------
*/
package Multithreading;

public class A5_Multithreading {
	
	public static void main(String[] args) {
		
		Timer2 timer = new Timer2();
		timer.start();
		
		PB2 progressBar = new PB2();
		progressBar.start();
		
		Video2 video = new Video2();
		video.start();
		
		Audio2 audio = new Audio2();
		audio.start();
		
		
		
	}
	
}
	
	class Timer2 extends Thread
	{
		public void run()    // and here we have just one method or task
		{
			System.out.println("Running Timer");
		}	
		
	}
	
	class PB2 extends Thread
	{
		public void run()
		{
			System.out.println("Running ProgressBar");
		}	
	
	}
	
	class Video2 extends Thread
	{
		public void run()
		{
			System.out.println("Playing Video");
		}
	}
	
	class Audio2 extends Thread
	{
		public void run()
		{
			System.out.println("Playing Audio");
		}
	}
	


