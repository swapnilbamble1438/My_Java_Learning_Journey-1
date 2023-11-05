/*
     Head                                                    
    __|_______       __________       __________          __________ 
   |  A  |    |---->|  B  |    |---->|  C  |    |---->   |  D  |    |---->NULL
   |_____|____|     |_____|____|     |_____|____|        |_____|____|
    Data  Next  
       

*/
package DS_Implementation;


class Linked_List{
	
	private Node head;  // first node
	private Node tail;  // last node
	
	private int size;
	
	public Linked_List() {
		this.size = 0;
	}
	
	public static class Node
	{
		int value;
		Node next;
		
		public Node(int  value)
		{
			this.value = value;
		}
	}

	
	public void insert(int value)
	{
		Node temp = new Node(value);
		
		if(head == null)
		{
			head = temp;
			size ++;
		}
		else
		{
			Node node = head;
			while(node.next != null)
			{
				node = node.next;
			}
			node.next = temp;
			
			size++;
			tail = node.next;
		
		}
		
	}
	
	public void show()
	{
		System.out.print("Nodes: ");
		Node node = head;
		while(node != null)
		{
			System.out.print(node.value + " ");
			node = node.next;
		}
		System.out.println();
		
	}
	
	public void size()
	{
		System.out.println("Size: " + size);
	}
	
	public void head()
	{
		System.out.println("Head Element: " + head.value);
	}
	public void tail() 
	{
		System.out.println("Tail Element: " + tail.value);
	}

}


public class A1_Singly_LinkedList {
	
	public static void main(String[] args) 
	{
		Linked_List list = new Linked_List();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		list.show();
		list.size();
		list.head();
		list.tail();
		
		
		
				
	}
}
	

	
	
	
	

		
		
		
		
	
	

