package oops.A7_overriding_n_overridden;

public class Practice {

	public static void main(String[] args) {
		
		Son obson = new Son();
		obson.show();
		
		Father obfat = new Father();
		obfat.show();
		
		Father obfat2 = new Son();
		obfat2.show();
				
		
	}
	
}

class Father
{
	public void show()
	{
		System.out.println("I am Father");
	}
}

class Son extends Father
{
	public void show()
	{
		System.out.println("I am Son");
	}
}
