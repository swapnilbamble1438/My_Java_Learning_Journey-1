
// this keyword can be used to pass as an argument
// in the constructor call.

package oops.Aa13_OOPS_InOneGo;

class Test {

	Test(A8_Use5 u5)
	{
		System.out.println("Test class constructor");
	}
}	
public	class A8_Use5
	{
		void m1()
		{
			Test t = new Test(this);
		}
			
		public static void main(String[] args) {
			
			A8_Use5 u5 = new A8_Use5();
			u5.m1();
		}
	}
	

