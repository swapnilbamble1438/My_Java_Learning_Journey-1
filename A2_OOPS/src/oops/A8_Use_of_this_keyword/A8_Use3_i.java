
// 3. this() can be used to invoke current class constructor.

package oops.A8_Use_of_this_keyword;

public class A8_Use3_i {
	
	A8_Use3_i()
	{
		
		System.out.println("no arg constructor");
	}
	
	A8_Use3_i(int a)
	{
		this();
		System.out.println("parameterised constructor");
	}
	
	public static void main(String[] args) {
		
		A8_Use3_i u3i = new A8_Use3_i(10);
		
	}
	
}
