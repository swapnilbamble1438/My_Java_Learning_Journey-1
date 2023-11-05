package DSA_Java_2;

import DSA_Java_2.Linked_List.Node;

class DLinked_List{
	
	private Node head;  // first node
	                                       
	public static class Node
	{
		int previous;
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
			temp.previous = 0;
			head = temp;
			
		}
		else
		{
			Node node = head;
			{
				while(node.next != null)
				{
					node = node.next;
				}
				temp.previous = node.data;
				node.next = temp;
			
			}
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

	
public class A2_Doubly_LinkedList {
	
	public static void main(String[] args) {
		
		DLinked_List list = new DLinked_List();
		list.insert(5);
		list.insert(6);
		list.insert(7);
		
		list.insertAt(8, 6);
		
		
		list.show();
		
	}
	
	
}


