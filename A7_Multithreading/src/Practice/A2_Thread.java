package Practice;

public class A2_Thread extends Thread{

	public void run()
	{
		for(int i = 10; i >= 1; i--)
		{
			System.out.println("value of i is: " + i);
		

			try {
			Thread.sleep(1000);
			}catch(Exception e)
			{
			}
		
		}
	}
	
		public static void main(String[] args) {
			
			A2_Thread obj2  = new A2_Thread();
			
			obj2.start();
			
			A1_Thread obj1  = new A1_Thread();

			Thread thr = new Thread(obj1);
			thr.start();
			
			
			
		}
	
}
