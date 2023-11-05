package oops.A4_polymorphism;

class Worker
{
	public void showDetail()
	{
		System.out.println("Worker Details");
	}
}


class People extends Worker
{
	public void showDetail()
	{
		System.out.println("People Details");
	}
}

class Shyam extends People
{
	public void showDetail()
	{
		System.out.println("Shyam Details");
	}
}

class Ram
{
	public void doWork(Worker worker)
	{
		worker.showDetail();
	}
}

public class B4_runtime {

	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		
		Ram ram1 = new Ram();
		ram1.doWork(w1);
		
		
		Worker w2 = new People();
		
		Ram ram2 = new Ram();
		ram2.doWork(w2);
		
		
		
		Worker w3 = new Shyam();
		
		Ram ram3 = new Ram();
		ram3.doWork(w3);
		
		// so here we can see that we are changing 
		// the functionality of program in main
		// class means changing its functionality
		// during runtime
	}
}
