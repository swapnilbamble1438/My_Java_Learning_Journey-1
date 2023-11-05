package oops.A1_Class_n_Object;

class Student{
	
	// instance variable
	int studentId;
	String studentName;
	String studentCity;
	
	public void study()
	{
		System.out.println(studentName + " is studying");
	}
	
	public void showFullDetails() 
	{
		System.out.println("My name is " + studentName);
		System.out.println("My id is " + studentId);
		System.out.println("My city is " + studentCity);
		
		
	}
	
	
	
}

public class B1_Student {
	
	public static void main(String[] args) {
		
		// creating object
		Student st1;
		st1 = new Student();
		
		st1.studentName = "Swapnil";
		st1.studentId = 1;
		st1.studentCity = "Mumbra";
		
		st1.study();
		
		st1.showFullDetails();
		
		
		
	}

}
