package Practice;



class A1_Thread implements Runnable{

	
	public void run() {
		
		for(int i = 1; i<=10; i++)
		{
			System.out.println("value of i is " + i);
			
			try {
			Thread.sleep(1000);
			}catch(Exception e)
			{
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		A1_Thread obj1  = new A1_Thread();

		Thread thr = new Thread(obj1);
		thr.start();
	
		
		
	}

	

}
