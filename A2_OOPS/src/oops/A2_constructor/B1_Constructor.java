package oops.A2_constructor;



class Student{
	
	// instance variable
	int studentId;
	String studentName;
	String studentCity;
	
	public Student() {
		System.out.println("constructor has been called");
	}
	
	
	
	
	
}

public class B1_Constructor {

	public static void main(String[] args) {
		
	
	
	// creating object
			Student st1;
			st1 = new Student(); // so by default constructor  will be called
			
			Student st2;
			st2 = new Student();
			
			
			
	}		
}
