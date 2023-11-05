package DS_Implementation;

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

class LL{
	
	private Node head;  // first node
	private Node tail;  // last node
	
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	public static class Node
	{
		Node previous;
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
			head.previous = null;
			tail = temp;
			tail.next = null;
			size ++;
		}
		else
		{
			tail.next = temp;
			temp.previous = tail;
			
			tail = temp;
			tail.next =null;
			
			size++;
		
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


public class A2_Doubly_LinkedList {

	
	public static void main(String[] args) {
		
		LL list = new LL();
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		list.show();
		list.size();
		list.head();
		list.tail();
		
		
		
		
	}
}
