/*
 Using sleep() method in multiple threads
 for performing one task
 
 e.g:
 
 public class Main {

	public void run()
	{
		try {
			
			for(int i = 1; i<=5; i++)
			{
				System.out.println(i + " : "+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		Main t1 = new Main();
		t1.start();
		
		Main t2 = new Main();
		t2.start();
		
	}
}

	output: 1 : Thread-1
			1 : Thread-0
			2 : Thread-1
			2 : Thread-0
			3 : Thread-0
			3 : Thread-1
			4 : Thread-0
			4 : Thread-1
			5 : Thread-0
			5 : Thread-1
 
 
 here each thread is executing simultaneously.
------------------------------------------------------------------------------- 
 
  e.g:
 
 public class Main {

	public void run()
	{
		try {
			
			for(int i = 1; i<=5; i++)
			{
				System.out.println(i + " : "+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		Main t1 = new Main();
		t1.run();
		
		Main t2 = new Main();
		t2.run();
		
	}
}

	output: 1 : main
			2 : main
			3 : main
			4 : main
			5 : main
			1 : main
			2 : main
			3 : main
			4 : main
			5 : main
			

 	so in this case thread will not be created.
 	And Main method only execute the task.
 	and t1 and t2 are not created as thread
 	they are created as the object.
 	so therefore it will execute according to 
 	the sequence. here first t1.run() execute
 	its task, first it will print value of 
 	i and then go in sleep mode next then again
 	print the incremented value of i and
 	again then go in sleep mode. so the cycle
 	continues till the loops break.
 	Then t2 object will execute.
 	Then t2.run() will execute its task
 	and run until its task is not complete.
 	so total time here taken is 10 sec.
 	
 	But if we use start method according to
 	the previous program.than both thread
 	will execute at the same time.
 	
 	so here we are able to know that we cannot
 	use method in some place. and we have
 	to use thread in that case.
 	
 	like VLC Application(Program) one thread
 	is playing sound, one thread is playing video,
 	one thread is executing timer, one thread
 	is executing Progressbar and if we not use
 	thread here and use object(method) instead of 
 	it. then Our VLC Application will not work
 	properly it will execute one method(functon) 
 	at a time and only after completing one function
 	it will proceed to execute next function.
 	so this makes our VLC Applcation worst.
 	
 	so object here only execute one method(function)
 	at a time.But in case of thread case we can
 	execute multiple thread simultaneously. 
 	thatswhy it is called multithreading.
 	So In thread case we dont have to create
 	object and call the method, we create thread
 	and execute that thread.
 	And if we use object and call the method
 	then our task will not properly execute.
 	
 	And if use run() method instead of thread()
 	then it will not be created as thread
 	because here thread creation step is not
 	followed. so it become simple object(method)
 	and it will execute one method at a time.
 	
 	And we should have to know that when to 
 	use method and when to use thread in our
 	project
			
			
 
 
 */
package Multithreading;

public class Aa11_sleep_Method  extends Thread {

	public void run()
	{
		try {
			
			for(int i = 1; i<=5; i++)
			{
				System.out.println(i + " : "+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		Aa11_sleep_Method t1 = new Aa11_sleep_Method();
		t1.run();
		
		Aa11_sleep_Method t2 = new Aa11_sleep_Method();
		t2.run();
		
	}
}


