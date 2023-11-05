
// 1. this keyword can be used to refer current class instance variable.
package oops.Aa13_OOPS_InOneGo;

public class A8_Use1 {

	int i;
	
	void setValue(int i)
	{
		this.i = i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	
	public static void main(String args[])
	{
		A8_Use1 u1= new A8_Use1();
		u1.setValue(4);
		u1.show();
	}
}
