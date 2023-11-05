package DS_Implementation;

/*
 /*
Adding 1st element
 
 temp = (null,1,null);
 head = (null,1,null);
 tail = (null,1,null);
 
 Adding 2nd element
 
 temp = (null,2,null);
 tail.next = temp;      // tail = (null,1,(null,2,null));
 temp.previous = tail   // temp = ((null,1,(null,2,null)),2,null);
 tail = temp;           // tail = ((null,1,(null,2,null)),2,null);
 
 Adding 3rd element
 
 temp = (null,3,null);
 tail.next = temp;     // tail = ((null,1,(null,2,null)),2,(null,3,null));
 temp.previous = tail; // temp = (((null,1,(null,2,null)),2,(null,3,null)),3,null);
 tail = temp;          // tail = (((null,1,(null,2,null)),2,(null,3,null)),3,null);


*/
 

import DS_Implementation.College.Student;

class College2
{
	private Student start;
	private Student end;
	
	static class Student
	{
		Student previous;
		String name;
		String surname;
		Student next;
	}
	
	public void insert(String name,String surname)
	{
		Student temp = new Student();
		temp.name = name;
		temp.surname = surname;
		
		if(start == null)
		{
			start = temp;
			end = temp;
		}
		else
		{
			end.next = temp;
			temp.previous = end;
			
			end = temp;
		}
	}
	
	public void show()
	{
		Student st = start;
		while(st != null)
		{
			System.out.println(st.name + " " + st.surname);
			st = st.next;
		}
	}
	
	public void show2()
	{
		Student st = start;
		int count = 1;
		
		while(st != null)
		{	
			System.out.println("Node: " + count);
			try {
			System.out.println(st.previous.name + " " + st.previous.surname);
			}catch(Exception e)
			{	
				System.out.println(e);
			}
			System.out.println(st.name + " " + st.surname);
			try {
			System.out.println(st.next.name + " " + st.next.surname);
			}catch(Exception e)
			{	
				System.out.println(e);
			}
			
			System.out.println("----------------------------");
			st = st.next;
			count++;
		}
	}
	
}

public class A2_Doubly_LinkedList_i {
	
	public static void main(String[] args) {
		
		College2 c = new College2();
		c.insert("Swapnil", "Bamble");
		c.insert("Yash", "More");
		c.insert("Pratik", "Shinde");
	//	c.show();
		System.out.println("==============================================");
		c.show2();
		
	}

}
