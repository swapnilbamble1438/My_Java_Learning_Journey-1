package oops.A7_overriding_n_overridden;



class Parent
{
	public void show()   // and the method is to be chang is called overriden method
	{
		System.out.println("I am Parent class");
	}
}

class Child extends Parent
{
	
	public void show()   // so here we have done overriding method
	{
		System.out.println("I am Child class");
	}
}

public class A1 {
	
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.show();
		
		Parent p1 = new Parent();
		p1.show();
		
		Parent p2 = new Child();
		p2.show();
		
	}
}
