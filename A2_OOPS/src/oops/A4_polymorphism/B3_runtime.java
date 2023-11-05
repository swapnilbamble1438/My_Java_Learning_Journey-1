package oops.A4_polymorphism;

//runtime: overriding


class Person
{
	public void showDetail()
	{
		System.out.println("Basic details of Person");
	}
}

class Emp extends Person
{
	public void showDetail()
	{
		System.out.println("Showing the details of the employee");
	}
}

public class B3_runtime {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.showDetail();
		
		Person p2 = new Emp();
		p2.showDetail();
		
	}
}
