/*
 Initialize object using constructor
 e.g:
 
 class Employee
 {
 	String name;
 	int empId;
 	
 	Employee(String name,int empId)
 	{
 		this.name = name;
 		this.empId = empId;
 	}
 	
 	void display()
 	{
 		System.out.println(name + " " + empId);
 	}
 	 	
 	public static void main(String args[])
 	{
 		Employee e1 = new Employee("Swapnil",1);
 		System.out.println(e1.name + " " + e1.empId);
 		e1.display();
 		
 		Employee e2 = new Employee("Yash",2);
 		System.out.println(e2.name + " " + e2.empId);
 		e2.display();
 		
 		
 	}
 }	
 
 output: Swapnil 1
	 Swapnil 1
	 Yash 2
	 Yash 2
------------------------------------------------------ 	
 */

package oops.Aa13_OOPS_InOneGo;

public class A2_Constructors_ii {
	
	String name;
 	int empId;
 	
 	A2_Constructors_ii(String name,int empId)
 	{
 		this.name = name;
 		this.empId = empId;
 	}
 	
 	void display()
 	{
 		System.out.println(name + " " + empId);
 	}
 	 	
 	public static void main(String args[])
 	{
 		A2_Constructors_ii e1 = new A2_Constructors_ii("Swapnil",1);
 		System.out.println(e1.name + " " + e1.empId);
 		e1.display();
 		
 		A2_Constructors_ii e2 = new A2_Constructors_ii("Yash",2);
 		System.out.println(e2.name + " " + e2.empId);
 		e2.display();
 		
 		
 	}

}
