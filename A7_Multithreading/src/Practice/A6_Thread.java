package Practice;

// isAlive() 
/*
To avoid concurrency problems.it is best to share
as few attributes between threads as possible.
If attributes need to be shared, one possible 
solution is to use the isAlive() method of the thread
to check whether the thread has finished running
before using any attributes that the thread can change.
 */
//Example: Use isAlive() to prevent concurrency problems:


public class A6_Thread extends Thread {

	public static int amount = 0;
	
	public static void main(String[] args) {
		A6_Thread ob1 = new A6_Thread();
		ob1.start();
		
		// wait for the thread to finish
		while(ob1.isAlive())
		{
			System.out.println("Waiting...");
		}
		
		System.out.println(amount);
		amount ++;
		System.out.println(amount);
		
	
	}
	
	public void run()
	{
		amount ++;
	}
}
