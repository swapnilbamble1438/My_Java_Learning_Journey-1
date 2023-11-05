package oops.A8_Use_of_this_keyword;

public class A8_Use3_ii {
	
	A8_Use3_ii()
	{
		this(10);
		System.out.println("no arg constructor");
	}
	
	A8_Use3_ii(int a)
	{
		System.out.println("parameterised constructor");
	}
	
	public static void main(String[] args) {
		
		A8_Use3_ii u3ii = new A8_Use3_ii();
		
	}

}
