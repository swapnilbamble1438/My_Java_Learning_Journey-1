/*
 join() Method:
 In join() Method threa waits for other thread,
 as soon as other thread complete its task it will join 
 that thread.
    OR
 If a thread wants to wait for another thread to
 complete its task then we should use join() method.
 
 for e.g:
 
 If we go for creating our license,there are some process
 like first there is medical test then Test Drive and the 
 Officer signature and then in final we get our License.
 
   t1              t2             t3
   (               (              (
    )               )              )
   (               (              (
    )               )              )
   v               v              v    
 Medical -->   Test Drive --> Officer Sign 
 
 so here first after completing medical we can do
 Test Drive. so when t1(comleting) its task
 t2 and t3 will wait. and when t1 complete its task
 soon t2 will join the task and start performing its task
 and when t2 completes task t3 will starts.
 
================================================================
Join() Methods:

 There are three join()  methods which are overloaded.
 
 1) public final void join() throws InterruptedExceptions{ }
 
 2) public final synchronized void join(long ms) throws InterruptedExceptions{ }
 
 3) public final synchronized void join(long ms,int ns) throws InterruptedExceptions{ }
 
=========================================================================================================


 
 
 
 
 
 
 */

package Multithreading;

public class Aa13_join_Method {
	

}
