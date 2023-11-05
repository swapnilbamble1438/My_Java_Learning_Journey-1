package Practice.A4_Polymorphism;

public class Overloading_Example {
	
	public static void main(String args[])
	{
		System.out.println(add(1,2));
	}
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}

}
