
// 	6. this can be used to return the current class instance from the method.

package oops.Aa13_OOPS_InOneGo;

public class A8_Use6 {
	
	A8_Use6 u6()
	{
		System.out.println("Hello");
		return this;
	}
	
	public static void main(String[] args) {
		
		A8_Use6 u6obj = new A8_Use6();
		u6obj.u6();
		
	}

}
