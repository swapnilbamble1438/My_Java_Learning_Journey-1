
// this keyword can be used to pass as an argument in
// the method call

package oops.A8_Use_of_this_keyword;

public class A8_Use4 {
	
	void m1(A8_Use4 u4)
	{
		System.out.println("I am in m1 method");
	}
	
	void m2()
	{
		m1(this);
	}

	public static void main(String[] args) {
		
		A8_Use4 u4 = new A8_Use4();
		u4.m2();
		
	}
}
