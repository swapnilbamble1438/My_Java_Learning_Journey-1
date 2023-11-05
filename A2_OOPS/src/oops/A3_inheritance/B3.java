package oops.A3_inheritance;


class C
{
	int x = 4;

	int y = 5;
	
}

class D extends C
{
	
	public void showx()
	{
		System.out.println("value of x: " + x);
	}
	
	int y = 7;
	
	public void showyfromdefault()
	{
		System.out.println("value of y from default : " + y); // it will take x value from class D
	}
	
	public void showyfromsame()
	{
		System.out.println("value of y from same class : " + this.y); // it will take x value from class D
	}
	
	public void showyfromparent()
	{
		System.out.println("value of y from parent class : " + super.y); // it will take x value from class D
	}
}


public class B3 {
	
	public static void main(String[] args) {
		
		D d1 = new D();
		
		d1.showx();
		d1.showyfromdefault();
		d1.showyfromsame();
		d1.showyfromparent();
		
		
		
	}

}
