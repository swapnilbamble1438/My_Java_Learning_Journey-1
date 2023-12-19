/*
 
 Context Switching:
 A context switching is a process that involves
 switching of the CPU from one process or task
 to another. In this phenomenon, the execution
 of the process that is present in the running
 state is suspended by the kernel and another
 process that is present in the ready state
 is executed by the CPU.
 
 It is one of the essential features of the 
 multitasking operation system. The processes
 are switched so fastly that it gives an 
 illusion to the user that all the processes
 are being executed at the same time.
 
	OR

 If multiple process are executing at a sametime,
 CPU here is executing only one process at a time
 but switch between processes are so fast that
 it gives an illusion to the user that all the 
 processes are being executed at the same time.
 
 Sychronization:
 When we start two or more threads within a program,
 there may be a situation when multiple threads try
 to access the same resource and finally they can
 produce unforeseen result due to concurrency issues.
 For example, if multiple threads try to write within
 a same file then they may corrupt the data because
 one of the threads can override data or while one
 thread is opening the same file at the same time
 another thread might be closing the same file.
 So in this type of situation we use Synchronization.
 
 
 
 Difference between Process and Thread:
 	
 		Process	                 |			Thread
---------------------------------|---------------------------------- 		
 1. It is a program which is in  | 1. It is the sub part
    executing state 		     |    of process (small task)
      OR                         |       OR
    It is a program which is     |    It is the small level
    executing                    |    of task/process
                                 | 
 2. Process is heavy weight      | 2. Thread is light weight
                                 |
 3. Process takes more time      | 3. Thread takes less time
    for context switching        |    for context switching
                                 |
 4. Takes more time for          | 4. Takes less time for
    inter-process                |    inter-thread 
    communication                |    communication
                                 |
 5. Each Process has             | 5. Threads share same 
    different address            |    address space if they
    space                        |    are of same Process
                                 | 
 6. Process are not dependent    | 6. Threads are dependent
    on each other. Because       |    on each other.
    Each Process is a            |
    individual program.          | 
                                 |
 7. Processes does not requires  | 7. Threads may requires
    Synchronization              |    Synchronization
                                 | 
 8. Resource consumption is      | 8. Resource consumption is
    more in case of Process      |    less in case of Threads
                                 |
 9. Process requires more time   | 9. Thread requires less time
    for creation                 |    for creation
                                 | 
 10. Process requies more time   | 10. Thread requires less time 
     for termination             |     for termination
                                 |
     
 
   
   
   
   
 
 */


package Multithreading;

public class A2_Diff_Betn_Process_n_Thread {

}
