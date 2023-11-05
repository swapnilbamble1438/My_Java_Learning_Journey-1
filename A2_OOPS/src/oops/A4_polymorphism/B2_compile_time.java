package oops.A4_polymorphism;

// compile time : overloading

class Student
{
	public void read()
	{
		System.out.println("Student is reading XYZ book");
	}
	
	public void read(String bookName)
	{
		System.out.println("Studen is reading " +bookName + " book");
	}
}


public class B2_compile_time {
	
	public static void main(String args[])
	{
		Student st1 = new Student();
		st1.read();
		st1.read("ABC");
	}

}
