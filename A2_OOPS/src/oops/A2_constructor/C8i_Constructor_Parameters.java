package oops.A2_constructor;

public class C8i_Constructor_Parameters {

	int x;
	
	public C8i_Constructor_Parameters(int y)
	{
		x = y;
	}
	
	public static void main(String args[])
	{
		C8i_Constructor_Parameters obj = new C8i_Constructor_Parameters(4);
		System.out.println(obj.x);
	}
	
	
}

