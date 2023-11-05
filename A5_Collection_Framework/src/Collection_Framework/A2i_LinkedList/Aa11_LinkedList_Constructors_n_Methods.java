/*
 interface Collection
 {
      boolean add(Object obj);
      boolean addAll(Collection c);
      
      boolean remove(Object obj);
      boolean removeAll(Collection c);
      
      void clear();
      
      boolean contains(Object obj);
      boolean containsAll(Collection c);
      
      boolean isEmpty();
       
      int size();
      
      Iterator iterator();
      -----etc
      
 }
 
 interface List extends Collection
 {
 	//contains all method of Collection interface
 	 
 	  void add(int index, Object obj);
 	  void addAll(int index,Collection c);
 	  
 	  Object get(int index);
 	  
 	  Object remove(int index);
 	  
 	  set(int index, Object newobj);
 	  
 	  int indexOf(Object obj);
 	  int lastIndexOf(Object obj);
 	  ------etc	  
 
 }
 class LinkedList implements List,Deque
 {
   // contains Collection,List and Deque methods
    
    void addFirst(Object obj);
    void addLast(Object obj);
    
	Object getFirst();
	Object getLast();
	   
	Object removeFirst();
	Object removeLast();
   -------etc   
    
 }
 
 */


package Collection_Framework.A2i_LinkedList;

import java.util.LinkedList;

public class Aa11_LinkedList_Constructors_n_Methods {
	
	
	public static void main(String[] args) {
		
		// There are two types of constructors in LinkedList
		//1) LinkedList() empty constructor
		//2) LinkedList(Collection c) 
		
		
		LinkedList ll = new LinkedList();
		
		ll.add(10);  // as linkedlist is index base datastructure
		ll.add("Swapnil"); // this element will go to 1 index
		ll.add("Mumbra"); // this element will go to 2 index
		ll.add("Mumbra"); // duplicate elements are allowed
		ll.add(null);
		ll.add(null); // duplicate null values are allowed
		
		// it follows insertion order
		// thus retrieval of elements will also be 
		// in the sequence of insertion
		
		
		System.out.println(ll);
		ll.addFirst("addedfirst");
		
		ll.addLast("addedlast");
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println("=============================================================");
		
		
		LinkedList ll2 = new LinkedList();
		ll2.add("New LinkedList");
		
		ll2.addAll(ll);
		System.out.println(ll2);
		
		
	}
	
	
	

}
