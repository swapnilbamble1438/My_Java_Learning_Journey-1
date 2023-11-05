
// 2. this keyword can be used to invoke current class method(implicitly).

package oops.Aa13_OOPS_InOneGo;

public class A8_Use2 {
	
	void display()
	{
		System.out.println("hello");
	}
	
	void show()
	{                       // if you don't use this keyword,
		// display();       // compiler automatically adds
		this.display();     // this keyword while invoking
	}                       // the method
	
	public static void main(String args[])
	{
		A8_Use2 u2 = new A8_Use2();
		u2.show();
	}

}
