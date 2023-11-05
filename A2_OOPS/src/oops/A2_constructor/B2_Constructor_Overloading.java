package oops.A2_constructor;



class Stud{
	
	// instance variable
	int studentId;
	String studentName;
	String studentCity;
	
	// non parameterized constructor
	public Stud() {
		System.out.println("calling non parameterized constructor");
	}
	
	// parameterized constructor 
	public Stud(int studentId)
	{
		System.out.println("calling parameterized constructor: having 1 int");
	}
	

	
	
}

public class B2_Constructor_Overloading {
	
	
	public static void main(String[] args) {
		
		Stud st1 = new  Stud();  // calling non-parameterize constructor
		
		Stud st2 = new Stud(4);  // calling parameterize constructor
		
		
		
	}
	

}
