package oops.A3_inheritance;


class A
{
	int a = 1;
	
	public void showA()
	{
		System.out.println("a : " + a + " from class A through class B");
		
	}
	

}


class B extends A
{
	int b = 2;
	
	public void showB()
	{
		System.out.println("b : " + b + " from class B directly");
		
		System.out.println("a : " + a + " from class B directly");
		
	}
	

}

public class B2{

	public static void main(String[] args) {
		
		B b1 = new B();
		b1.showB();

		b1.showA();
		
		
		
	}
		
	
}
