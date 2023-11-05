/*
 
Object Initialize by using method
e.g:

class Animal
{
	String name;
	String color;
	
	void initializeObj(String a, String b)
	{
		name = a;
		color = b;
	}
	
	void display()
	{
		System.out.println(name + " " + color);
	}
	
	public static void main(String[] args)
	{
		Animal dog = new Animal();
		dog.initializeObj("Dog","Black");
		dog.display();
	}
}

	output: Dog Black
 

*/

package oops.A1_Class_n_Object;

public class A1_OOPs_ii {
	String name;
	String color;
	
	void initializeObj(String a, String b)
	{
		name = a;
		color = b;
	}
	
	void display()
	{
		System.out.println(name + " " + color);
	}
	
	public static void main(String[] args)
	{
		A1_OOPs_ii dog = new A1_OOPs_ii();
		dog.initializeObj("Dog","Black");
		dog.display();
	}

}
