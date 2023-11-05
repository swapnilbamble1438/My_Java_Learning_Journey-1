package oops.A3_inheritance;

// calling constructor


class E
{
	int a;
	public E(int a)
	{
		this.a = a;
	}
}

class F extends E
{
	
	
	public F() // constructor 
	{
		super(5);  // it must be first line 
					// calling constructor from parent class
	}
	
	
	public void show()
	{
		System.out.println("a : " + a);
	}
	
}

public class B4 {

	public static void main(String[] args) {
		
		F f1 = new F();
		f1.show();
		
	}
}
