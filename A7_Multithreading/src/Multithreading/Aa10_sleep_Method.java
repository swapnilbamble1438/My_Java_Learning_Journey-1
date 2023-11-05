/*
 Prevent thread execution method:
 
 
 Prototype of sleep() Method:
 In Thread there are basically two sleep() methods. 
 that means sleep method is overloaded.
 
 i) public static native void  sleep(long mili) throws   
   
    native methods are those whose implementation
  	is done in some other language
  	and this method throws compile time exception,
 	so wherever we use sleep method we have
 	to handle exception using try catch or throws keyword
    And this sleep() method throws InterruptedException.
    and this sleep() method implementation is done in
    some other language.
 												  
 												  
 ii) public static void sleep(long mili,int nano) throws Interrupted Exception			 
     this method doesnot have native,
     means its implementaion is done in java only.
     this method also throws interrupted Exception
     
  These are two sleep() methods which are overloaded in thread class.
  Amont there two methods one is native and second is not native method.
  
  Both these methods are static. that means we can directly call
  this method by thread class.
------------------------------------------------------------------------------------

  Use of sleep() method:
  The thread which is executing, sleep() method will stop that thread
  from executing for sometime(time which we provide) and again start
  that thread or start execution of thread as soon as time will complete.
   OR
  sleep() method will send the current running thread to sleep() mode
  for some time.
 						
 												  
 	e.g:
 
	 	class Test
	 	{
 	 _	    public static void main(String args[])
 	|   (   {
 	|  	 )	    for(int i = 1; i <= 5; i++)
	|   (		{
	|	 )		System.out.println(i);
    |   (		}
 	|_	 )   }
  main	main
 method	thread
 		
 		 }
 		 	output: 1
 		 	        2
 		 	        3
 		 	        4
 		 	        5
 	
 	JVM when execute main method it will create main thread.
 	and main thread when execute its task( task inside main method)
 	then directly it will execute its output.
 											  
    so thread here doesn't go on sleep method it was continuously running.
     			
    but if we want our thread to stop running continuosly and want
    our thread to stop for sometime in between or before execution
    so there we can use sleep() method  	
    
    e.g:
    
    class Test
	 	{
 	 _	    public static void main(String args[])
 	|   (   {
 	|    )     try
 	|   (     { 
 	|  	 )	    	 for(int i = 1; i <= 5; i++)
 	|	(		 	{     
	|    )				Thread.sleep(1000);   // 1000 means 1 second
	|	(				System.out.println(i);
    |    )		 	}
    |   (        }
    |    )       catch(Exception e)
    |   (        {
    |    )        	System.out.println(e);
    |   (        }
    |    )  
 	|_	(     }
  main	main
 method	thread
 		
 		 }
 		 	output:       // wait for 1 second than produce output
 		 			 1   // wait for 1 second than produce output
 		 			 2   // wait for 1 second than produce output
 		 			 3   // wait for 1 second than produce output
 		 			 4   // wait for 1 second than produce output
 		 			 5
 		 	
    here when thread will execute, when it find sleep() method
    it will wait for 1 sec from executing or go on sleep mode for
    1 sec and after 1 sec it will again starts executing and produce
    output. then again loop starts it will do the same action.
    again when thread finds the sleep() method it will wait 1 sec
    and after that again starts executing and produce output
    this will go on until the loop breaks. 
    										  
 						
  so sleep() method stop thread for some time from executing
  and thread will again start executing after the given time period
  in sleep method is finish. so we dont need to start thread
  manually after invoking sleep method. 	
  
  Note: sleep() method only works when a class extends thread class.
  	    And main method already by default is a thread class.
  	
----------------------------------------------------------------------

another e.g of sleep() method:



public Main
{

		public static void main(String[] args) 
		{
			Test t = new Test();
			t.start();
			
		}
		
}

class Test extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{		
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

	  output:       // wait for 1 second than produce output
 		 	    1   // wait for 1 second than produce output
 		     	2   // wait for 1 second than produce output
 		 		3   // wait for 1 second than produce output
 		 	    4   // wait for 1 second than produce output
 		 		5
     
     
    Note: In previous example main thread excecution was 
          getting paused. But here execution of Test class
          is getting paused. Because the thread of Test
          class is we have created and Test class
          is a thread class in which we have put sleep()
          method.
          so those thread who is executing the part where
          sleep() method is provided that thread
          will get paused or go in sleep() mode.
-----------------------------------------------------------------------------

and in sleep() method if we provide any inappropriate value
then it will throw runtime exception

e.g:


public Main
{

		public static void main(String[] args) 
		{
			Test t = new Test();
			t.start();
			
		}
		
}

class Test extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{		
				Thread.sleep(-1);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

	output: java.lang.IllegalArgumentException: timeout value is negative
			java.lang.IllegalArgumentException: timeout value is negative
			java.lang.IllegalArgumentException: timeout value is negative
			java.lang.IllegalArgumentException: timeout value is negative
			java.lang.IllegalArgumentException: timeout value is negative

     
     
     so here we cannot provide value less than 1
     
----------------------------------------------------------------------------
e.g: we cannot provide value below 1 in nanosecond also

public Main
{

		public static void main(String[] args) 
		{
			Test t = new Test();
			t.start();
			
		}
		
}

class Test extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{		
				Thread.sleep(1000,-1);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}

	output: java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			
			
----------------------------------------------------------------------------------------------------

e.g:  we cannot provide too large value in nano second also


public Main
{

		public static void main(String[] args) 
		{
			Test t = new Test();
			t.start();
			
		}
		
}

class Test extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{		
				Thread.sleep(1000,-1);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}   
	
	output: java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range
			java.lang.IllegalArgumentException: nanosecond timeout value out of range

-------------------------------------------------------------------------------------------------     
    
    Q) where do we use sleep() method?
    Ans Blinking bulb, blink for second and again light
        We can also set timer of seconds
        like we can set timer using loop
        and sleep()
        e.g:
		 public class Main throws Exception
		{
		
				public static void main(String[] args)  throws Exception
				{
					int count = 0;
				        for(int i = 0; i <= 60 ; i++)
				        {
				        	Thread.sleep(1000);
				        	
				        	System.out.println(count + " min, " + i + " sec");
				        	if(i == 60)
				        	{
				        		count ++;
				        		i= 0;
				        	}	
				        		
				        	if(count == 2)
				        	{
				        		System.out.println(count + "min complete");
				        		break;
				        	}
				        }
					
				       
				}
				
		}
    
    output: 0 min, 0 sec
			0 min, 1 sec
			0 min, 2 sec
			0 min, 3 sec
			0 min, 4 sec
			0 min, 5 sec
			0 min, 6 sec
			0 min, 7 sec
			0 min, 8 sec
			0 min, 9 sec
			0 min, 10 sec
			0 min, 11 sec
			0 min, 12 sec
			0 min, 13 sec
			0 min, 14 sec
			0 min, 15 sec
			0 min, 16 sec
			0 min, 17 sec
			0 min, 18 sec
			0 min, 19 sec
			0 min, 20 sec
			0 min, 21 sec
			0 min, 22 sec
			0 min, 23 sec
			0 min, 24 sec
			0 min, 25 sec
			0 min, 26 sec
			0 min, 27 sec
			0 min, 28 sec
			0 min, 29 sec
			0 min, 30 sec
			0 min, 31 sec
			0 min, 32 sec
			0 min, 33 sec
			0 min, 34 sec
			0 min, 35 sec
			0 min, 36 sec
			0 min, 37 sec
			0 min, 38 sec
			0 min, 39 sec
			0 min, 40 sec
			0 min, 41 sec
			0 min, 42 sec
			0 min, 43 sec
			0 min, 44 sec
			0 min, 45 sec
			0 min, 46 sec
			0 min, 47 sec
			0 min, 48 sec
			0 min, 49 sec
			0 min, 50 sec
			0 min, 51 sec
			0 min, 52 sec
			0 min, 53 sec
			0 min, 54 sec
			0 min, 55 sec
			0 min, 56 sec
			0 min, 57 sec
			0 min, 58 sec
			0 min, 59 sec
			0 min, 60 sec
			1 min, 1 sec
			1 min, 2 sec
			1 min, 3 sec
			1 min, 4 sec
			1 min, 5 sec
			1 min, 6 sec
			1 min, 7 sec
			1 min, 8 sec
			1 min, 9 sec
			1 min, 10 sec
			1 min, 11 sec
			1 min, 12 sec
			1 min, 13 sec
			1 min, 14 sec
			1 min, 15 sec
			1 min, 16 sec
			1 min, 17 sec
			1 min, 18 sec
			1 min, 19 sec
			1 min, 20 sec
			1 min, 21 sec
			1 min, 22 sec
			1 min, 23 sec
			1 min, 24 sec
			1 min, 25 sec
			1 min, 26 sec
			1 min, 27 sec
			1 min, 28 sec
			1 min, 29 sec
			1 min, 30 sec
			1 min, 31 sec
			1 min, 32 sec
			1 min, 33 sec
			1 min, 34 sec
			1 min, 35 sec
			1 min, 36 sec
			1 min, 37 sec
			1 min, 38 sec
			1 min, 39 sec
			1 min, 40 sec
			1 min, 41 sec
			1 min, 42 sec
			1 min, 43 sec
			1 min, 44 sec
			1 min, 45 sec
			1 min, 46 sec
			1 min, 47 sec
			1 min, 48 sec
			1 min, 49 sec
			1 min, 50 sec
			1 min, 51 sec
			1 min, 52 sec
			1 min, 53 sec
			1 min, 54 sec
			1 min, 55 sec
			1 min, 56 sec
			1 min, 57 sec
			1 min, 58 sec
			1 min, 59 sec
			1 min, 60 sec
			2min complete
---------------------------------------------------------------------------------------------     
 sleep() method important points:
 
 1. If the value of milliseconds is negative "IllegalArgumentException" 
    is thrown.
 2. If the value of nanoseconds is not in the range 0-999999 then 
    "IllegalArgumentException" is thrown.
 3. Whenever we want to use the sleep() method we also need to handle
    the "InterruptedException".
    If we will not handle it, th JVM will show a compilation error.
 4. When any thread is sleeping and if any other thread interrupts it,
    then it throws "InterruptedException".
 5. The sleep() method always pauses the current thread execution.
    When the JVM finds the sleep() method in code, it checks that
    which thread is running and pause the execution of thread.
 6. When we use sleep() method to pause the execution of thread.
    (And Incase of having multiple threads) the thread scheduler 
    assigns the CPU to another thread if any thread exists. So, 
    there is no guarantee that the thread wakes
    up exactly after the time specified in sleep() method. It 
    totally depends on the thread scheduler.
    But there is also chances of thread getting
    executed at specified time if the CPU is free.
 7. While the thread is sleeping, it doesn't lose any locks or
    monitors that it had acquired before sleeping.   
 

 
-------------------------------------------------------------------------------------------- 
 */


package Multithreading;

public class Aa10_sleep_Method 
{

		public static void main(String[] args)  throws Exception
		{
			int count = 0;
		        for(int i = 0; i <= 60 ; i++)
		        {
		        	Thread.sleep(1000);
		        	
		        	System.out.println(count + " min, " + i + " sec");
		        	if(i == 60)
		        	{
		        		count ++;
		        		i= 0;
		        	}	
		        		
		        	if(count == 2)
		        	{
		        		System.out.println(count + "min complete");
		        		break;
		        	}
		        }
			
		       
		}
		
}

