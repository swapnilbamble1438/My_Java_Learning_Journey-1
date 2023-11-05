
// Java program to illustrate creating
//  an array of objects


package Arrays;

class Student{
	

	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}



//Elements of the array are objects of a class Student.
public class A1_Arrays_of_objects {

	
	public static void main(String args[])
	{
		// create array like we create object
		Student arr[] = new Student[5];
		
		// now initialize the elements
		arr[0] = new Student(1,"Aman");
		arr[1] = new Student(2,"Vaibhavv");
		arr[2] = new Student(3,"Shikar");
		arr[3] = new Student(4,"Dharmesh");
		arr[4] = new Student(5,"Mohit");
		
		// accessing the elments of the specified array
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Element at " + i +" : " + arr[i].roll_no +" " + arr[i].name);
		}
		
	}
}
