package Collection_Framework.A2i_LinkedList;

import Collection_Framework.A2i_LinkedList.GFG.Node;

class GFG{
	
	// structure of Node
	static class Node
	{
		int data;
		Node next;
	}
	
	//Function to print the content
	// of linked list starting from
	// the given node
	static void printList(Node n)
	{
		while(n != null)
		{
		System.out.print(n.data + " ");
		n = n.next;
		}
	
	}
}

public class Ba19_Singly_Linked_List {

	public static void main(String[] args) {
		
		Node first = new Node();;
		Node second = new Node();;
		Node third = new Node();;
		
		first.data = 1;
		first.next = second;
		
		second.data = 2;
		second.next = third;
		
		third.data = 3;
		third.next = null;
		
		GFG gfg = new GFG();
		gfg.printList(first);
	
		
	}
		

	
	
	
		
	
	
	
}
