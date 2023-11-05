package Java_Basic_Programs;

public class A9_Create_obj {

	public A9_Create_obj() 
	{
		System.out.println("Welcome to java");
	}
	
	public void abc()
	{
		System.out.println("Hello There");
	}
	
	public int pqr()
	{	
		int i = 5;
		System.out.println("i= " + i);
		
		return i;
	}
	
	public int pqr(String s)
	{
		int a = 0;
		System.out.println(s);
		return a;
	}
	
	public static void main(String args[])
	{
		A9_Create_obj obj = new A9_Create_obj();
		
		obj.abc();
		
		obj.pqr();
		
		obj.pqr("Swapnil");
	}
}
