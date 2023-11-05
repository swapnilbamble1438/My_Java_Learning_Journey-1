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
package DSA_Java_2;


class Linked_List{
	
	private Node head;  // first node
	                                       
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int  data)
		{
			this.data = data;
		}
	}

	
	public void insert(int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node node = head;
			while(node.next != null)
			{
				node = node.next;
			}
			node.next = temp;
		
		}
		
	}
	
	public void insertAt(int data,int address)
	{
		Node temp = new Node(data);
		
		
			Node node = head;
			while(node.data != address)
			{
				node = node.next;
			}
			Node temp2 = node.next;
			node.next = temp;
			
			while(node.data != data)
			{
				node = node.next;
			}
			node.next = temp2;			
		
	}
	
	public void insertHead(int data)
	{
		Node temp = new Node(data);
		
		Node temp2 = head;
		
		head = temp;
		head.next = temp2;
				
	
	}
	
	
	
	
	
	
	public void show()
	{
		System.out.print("Nodes: ");
		Node node = head;
		while(node != null)
		{
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
		
	}
	

}


public class A1_Singly_LinkedList {
	
	public static void main(String[] args) 
	{
		
		Linked_List list = new Linked_List();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		
		list.insertAt(8, 6);
		list.insertHead(9);
		
		list.show();
		
				
	}
}
	

	
	
	
	

		
		
		
		
	
	

