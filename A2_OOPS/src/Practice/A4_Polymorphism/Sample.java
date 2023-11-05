package Practice.A4_Polymorphism;

public class Sample {

	public static void main(String args[])
	{
		
		one n = new one();
		n.show();
		
		one m = new two();
		m.show();
		
		Ram ram = new Ram();
		ram.dowork(n);
		ram.show();
	}
}

class one{
	
	public void show() {
		System.out.println("Details of one");
	}
}

class two extends one{
	
	public void show() {
		System.out.println("Details of two");
	}
}

class Ram extends two
{
	
	
		
	
	public void dowork(one o)
	{
		o.show();
	}
}
