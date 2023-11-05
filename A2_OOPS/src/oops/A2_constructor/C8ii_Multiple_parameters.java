package oops.A2_constructor;

public class C8ii_Multiple_parameters {
	
	
	int x;
	int y;
	
	public C8ii_Multiple_parameters(int a,int b) 
	{
		x = a;
		y = b;
		
	}
	
	public static void main(String args[])
	{
		C8ii_Multiple_parameters obj = new C8ii_Multiple_parameters(2, 3);
		System.out.println(obj.x + " " + obj.y);
	}

}
