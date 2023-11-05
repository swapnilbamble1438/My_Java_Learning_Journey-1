/*
     Head                                                    
    __|_______       __________       __________          __________ 
   |  A  |    |---->|  B  |    |---->|  C  |    |---->   |  D  |    |---->NULL
   |_____|____|     |_____|____|     |_____|____|        |_____|____|
    Data  Next  
   
-------------------------------------------------------------------------------------       

    Adding 1st element
    
    Node temp = new Node(1);
	 
	head = new temp;
	head = new Node(1,null);
----------------------------------	
	Adding 2nd element
	
	Node temp = new Node(2);
	
	Node node = head;
	Node node = new Node(1,null);
	
	while(node != null)
	{
		node = node.next;
	}
	
	node.next = temp;
	node.next = new Node(2);
	
	head = new Node(1,new Node(2,null));
-------------------------------------
	Adding 3rd element
	
	Node temp = new Node(3);
	
	Node node = head;
	Node node = new Node(1,new Node(2,null));
	
	while(node != null)
	{
		node = node.next;
	}
	node.next = temp;
	node.next = new Node(3);
	
	head = new Node(1,new Node(2,new Node(3,null)));
--------------------------------------------------------
	

*/

package DS_Implementation;


class College
{
	private Student start;
	
	static class Student
	{
		String name;
		String surname;
		Student next;
	}
	
	
	public void insert(String name, String surname)
	{
		Student temp = new Student();
		temp.name = name;
		temp.surname = surname;
		
		if(start == null)
		{
			start = temp;
		}
		else
		{
			Student temp2 = start;
			while(temp2.next != null)
			{
				temp2 = temp2.next;
			}
			temp2.next = temp;
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
		Student st  = start;
		int count = 1;
		
		while(st != null)
		{
			System.out.println("Node: " + count);
			System.out.println(st.name + " " + st.surname);

			try
			{
				System.out.println(st.next.name + " " + st.next.surname);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("-------------------------------");
			st = st.next;
			count++;
		}
	}
	
}


public class A1_Singly_LinkedList_ii {
	
	public static void main(String[] args) {
		
		College c = new College();
		
		c.insert("Swapnil", "Bamble");
		c.insert("Yash","More");
		c.insert("Pratik", "Shinde");
		
		// c.show();
		 System.out.println("=======================================");
		 c.show2();
		 
		
	}

}
