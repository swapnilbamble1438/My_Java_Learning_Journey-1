package Practice;

public class A3_Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		int x = 56 + 34;
		
		System.out.println("sum is: " + x);
		
		System.out.println("Program ended...");
		
		
		// Getting threading name
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("Current running thread is " + tname);
		
		
	}

}



