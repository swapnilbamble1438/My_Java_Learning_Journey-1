package com;
class Student
{
 String name;
 int rollno;
 static String college= "VM College";
 
 Student(String name, int rollno)
 {
	 this.name = name;
	 this.rollno = rollno;
 }
  void show()
  {
	  System.out.println("Name: " + name);
	  
	  System.out.println("RollNo: " + rollno);
	  
	  System.out.println("College: " + college);
  }
}

class Aa50ii_Static_variable
{
	public static void main(String args[])
	{
		Student s1= new Student("Swapnil", 20);
		s1.show();
		
		Student s2= new Student("Ajay", 26);
		s2.show();
		
		Student s3 = new Student("Sudesh", 21);
		s3.show();
	}
}