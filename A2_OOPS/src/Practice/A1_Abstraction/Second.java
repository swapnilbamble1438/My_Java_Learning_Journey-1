package Practice.A1_Abstraction;

public class Second {

	public static void main(String args[])
	{
		Student obj = new Student();
		
		System.out.println("Name: " + obj.fname);
		System.out.println("Age: " + obj.age);
		System.out.println("Graduation Year: " + obj.graduationyear);
		obj.study();
		obj.view();
	}
}
