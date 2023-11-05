package Practice;

public class A4_Thread implements Runnable {
	
	
	public static void main(String[] args) {
		
		A4_Thread ob = new A4_Thread();
		
		Thread thr = new Thread(ob);
		thr.start();
		
	}
	
	
	
	public void run()
	{
		System.out.println("This code is running in a thread");
	}

}
