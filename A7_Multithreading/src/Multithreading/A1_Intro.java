/*
 
 Multitasking:
 Performing multiple task at single time
 e.g:
 
we have a CPU with Operating System
and we have open VLC for playing video,
also working on MS Word
and also browsing on Browser
so we are doing multiple task in our System,
and if this multiple task are simultaneously
executing at a same time then it is called
multitasking.

 
 	      _____   ______    _________
  	     | VLC | | Word |  | Browser |
  	     |_____| |______|  |_________|
                __|______|_______|_
  	       |        OS         |
  	       |___________________|
  	             ___|___
  	            |  CPU  |
  	            |_______|
         
  	     
  Nowadays all system supports multitasking.
  
  Use of Multitasking:
  It increases the performance of the CPU.
  
  Multitasking can be achieved by using two ways:
  i) Multiprocessing (Process based Multitasking)
  ii) Multithreading (Thread based Multitasking)
  
 ---------------------------------------------------------------------
 
  Multi Processing:
  when one system connected with multiple CPU's
  or multiple processor inorder to complete the task
  whether it is single or multiple task is called
  MultiProcessing.
  
  
              _____   ______    _________
  	     | VLC | | Word |  | Browser | 
  	     |_____| |______|  |_________|
  	        __|______|_______|_
  	       |     OS(System)    |
  	       |___________________|
  	    _____|_   __|____   _|_____
  	   | CPU 1 | | CPU 2 | | CPU 3 |
  	   |_______| |_______| |_______|
  	   
 Multiprocessing is best suitable at System level
 or OS (Operationg System) level.
---------------------------------------------------------------

 Multi Threading:
 
              _____   ______    _________
  	     | VLC | | Word |  | Browser |
  	     |_____| |______|  |_________|
                __|______|_______|_
  	       |        OS         |
  	       |___________________|
  	             ___|___
  	            |  CPU  |
  	            |_______|
  	            
  	 here VLC,Word,Browser
  	 is like Task/Job/process/program.
  	 so each of this process contains smaller
  	 process or sub-tasks called as thread.
  	   OR
         here VLC,Word,Browser is like big process.
  	 and each of this process contains smaller
  	 process or sub-tasks called as thread.
  	 
  	 e.g:
  	 
  	 when we play any video on VLC
  	 we can see video progress bar is executing,
  	 video timer is also executing,
  	 video is running and audio is running,
  	 and at a same time we can increase or decrease
  	 volume also so all this sub-tasks are running
  	 simultaneously.
  	 
  	 so VLC here is process and
  	 inside VLC its smaller tasks like
  	 progress bar, video timer, video,audio
  	 are small tasks or sub-process or threads.
  	   
  	   VLC 
  	    |
  	    |--> Progress bar
  	    |--> Video timer
  	    |--> Video
  	    |--> Audio
  	 
 so
 Multiple threads executing simultaneously or
 at a same time is called Multithreading.
  OR
 Multiple threads executing together at a
 same time is called Multithreading.
  OR
 Executing multiple threads(sub-process, small task) 
 at a single time is called Multithreading.
 
 
 e.g:
 
 
             ______________________________       
  	    |  PB  | Timer | Video | Audio |<---- Threads
  	    |___|__|___|___|___|___|___|___|
  	    |   |______|_______|_______|   |   
  	    |              |               |
  	    |             VLC <------------|----- Process 
  	    |______________________________|
                 __|______|_______|_
  	        |        OS         |
  	        |___________________|
  	               ___|___
  	              |  CPU  |
  	              |_______|
  	              
  	  here VLC is process and 
  	  Progress bar, timer, video, audio
  	  all this sub-tasks (threads) are executing
  	  at a same time inorder to complete
  	  a process (VLC) so this process is 
  	  Multithreading.  
  	  
--------------------------------------------------------------------------  	     
 Use of	Multithreading:
 Multithreading is used in many place.
 Most of the programs(Application) used Multithreading
 like VLC.
 i) Used in Applications(Softwares)
 ii) Use in Games
 iii) Animations

----------------------------------------------------------------------------
tasks and sub-tasks are like method
 
 e.g:
 
 VLC(process, program)
 
 class VLC
 {
 	public static void main(String args[]
 	{
 		Progressbar pb = new Progressbar();
 		pb.startProgressbar();
 		
 		Timer t = new Timer();
 		t.startTimer();
 		
 		Video v = new Video();
 		v.startVideo();
 		
 		Audio a = new Audio();
 		a.startAudio();
 	}
 }
 
 class Progressbar
 {
 	void startProgressbar()
 	{
 	
 	}
 }
 
 class Timer
 {
 	void startTimer()
 	{
 	
 	}
 }
 
 class Video
 {
 	void startVideo()
 	{
 	
 	}
 }
 
 class Audio
 {
 	void startAudio()
 	{
 	
 	}
 }
 
 but here at a time only one method(sub-task) can execute
 and after its completly execution only another
 method will execute.
 so this is not good for our programm (Application)
 
 like first it will start progress bar, and after completion
 of progress bar it will star timer, and after
 completion of timer it will start video and after
 completion of video it will start audio. And
 at a time only one task will run like
 progress bar without timer,video,audio 
 or video without audio,progressbar, timer so this 
 will make our application worst. 
 
 so if our program will run this sub-task 
 simultaneously at a same time out application becomes
 good to use. so to perform this subtask simultaneously
 at a same time we use Multithreading.
 
 
  e.g:
 
 VLC(process, program)
 
 class VLC
 {
 	public static void main(String args[])
 	{
 		Progressbar pb = new Progressbar();
 		pb.startProgressbar();
 		
 		Timer t = new Timer();
 		t.startTimer();
 		
 		Video v = new Video();
 		v.startVideo();
 		
 		Audio a = new Audio();
 		a.startAudio();
 	}
 }
 
 class Progressbar extends Thread
 {
 	void startProgressbar()
 	{
 	
 	}
 }
 
 class Timer extends Thread
 {
 	void startTimer()
 	{
 	
 	}
 }
 
 class Video extends Thread
 {
 	void startVideo()
 	{
 	
 	}
 }
 
 class Audio extends Thread
 {
 	void startAudio()
 	{
 	
 	}
 }
 
 so we can use Thread for performing Multithreading.
-------------------------------------------------------------
  NOTE: Multithreading is best suitable at
        programming level.
        
        Java provides predefined API for 
        Multithreading.
        
        API- Application Programming Interface
             contains predefined classes and
             Interfaces.
             e.g: Classes or Interfaces like
             Thread, Runnable,
             ThreadGroup, Concurrency,
             ThreadPool
             
 Multitasking topics comes under OperatingSystem
 and not in Java.
 But java contains Multithreading concept
 so we have learn Multithreading concept
 but dont need to learn Multitasking.            
        
        
-------------------------------------------------------------------------        
 
 
 */

package Multithreading;

public class A1_Intro {
	

	public static void main(String args[])
	{
		Progressbar pb = new Progressbar();
		pb.start();
		
		Timer t = new Timer();
		t.start();
		
		Video v = new Video();
		v.start();
		
		Audio a = new Audio();
		a.start();
	}
}

class Progressbar extends Thread
{ 
	public void run()
	{
	  System.out.println("Running Progressbar");
	}
}

class Timer extends Thread
{
	public void run()
	{
		System.out.println("Running Timer");
	}
}

class Video extends Thread
{
	public void run()
	{
		System.out.println("Playing Video");
	}
}

class Audio extends Thread
{
	public void run()
	{
		System.out.println("Playing Audio");
	}
}
