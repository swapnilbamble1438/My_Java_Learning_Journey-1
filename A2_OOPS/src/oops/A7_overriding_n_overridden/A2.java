package oops.A7_overriding_n_overridden;

// Co-Varient

class A
{

}

class B extends A
{
	
}



class C
{
	public A show()
	{
		return new A();
	}
}

class D extends C
{
	public B show()
	{
		return new B();
	}
	
}

public class A2 {

}
