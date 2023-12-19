package Multithreading;

public class Main {
	
	public static void main(String[] args) {
		
		ProgressbarNew pb = new ProgressbarNew();
 		pb.start();
 		
 		ProgressbarNew pb2 = new ProgressbarNew();
 		pb2.start();
 		
 		
	}

}
class ProgressbarNew extends Thread
{
	public void run()
	{
		System.out.println("Progressbar is running");
	}
}
