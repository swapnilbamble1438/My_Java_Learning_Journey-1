package Collection_Framework.A2i_LinkedList;
/*

LinkedList:
1) LinkedList is an implemented class of List interface
   which is present in java.util package
   Syntax:
   	  package java.util;
      class LinkedList implements List,Deque
      {
       	// constructors
       	// methods
       }

2) The underline DataStructure of LinkedList is
   "Singly LinkedList" or "doubly LinkedList" or "circular LinkedList"
   
   * In singly LinkedList
     this type of node is created
   
       ___________________
      | element |  next   |
      | (node   |  node   |
      | address)| address | 
      |_________|_________|
   
   
   * In doubly LinkedList
     this type of node is created
    _____________________________
   |previous | element |  next   |
   |  node   | (node   |  node   |
   | address | address)| address | 
   |_________|_________|_________|
  
   e.g:
   		l.add("Swapnil");
   		l.add("Mumbra");
   		l.add(100);
   		
   		Head node                                                                       Tail node
    ______________|______________           _____________________________           ______________|______________
   |         |         |         |-------->|         |         |         |-------->|         |         |         |
   |         | Swapnil |         |         |         | Mumbra  |         |         |         |   100   |         |
   |  null   |   (1)   |   2     |<--------|    1    |   (2)   |    3    |<--------|    2    |   (3)   |  null   | 
   |_________|_________|_________|         |_________|_________|_________|         |_________|_________|_________|

       
   * In circular LinkedList    
     this type node is created
	      
    	        Head node                                                                       Tail node
    ______________|______________           _____________________________           ______________|______________
   |         |         |         |-------->|         |         |         |-------->|         |         |         |
   |         | Swapnil |         |         |         | Mumbra  |         |         |         |   100   |         |
   |    3    |   (1)   |   2     |<--------|    1    |   (2)   |    3    |<--------|    2    |   (3)   |    1    | 
   |_________|_________|_________|         |_________|_________|_________|         |_________|_________|_________|


   	
 // Advantage of LinkedList
1) Insertion and deletion operation are efficient or fast

  eg. if arraylist is given
  
  	            [10,20,30,40,50,60,70,80,90]
                        |
  	 if we want to add 25 (between 20 and 30) in this position 
  	 then we have to shift  30 and all the element after 30 
  	 to next index so it will take long time
  	 but in LinkdedList its different and  
  	 LinkedList provide faster and efficient way as compare
  	 to this process
  	 
  	 e.g if LinkedList is given
  	   _______________        _______________        _______________
  	  |    | Sam |    |----->|    |John |    |----->|    |Jack |    |
  	  |null| (1) | 2  |      | 1  | (2) | 3  |      | 2  | (3) |null|  
          |____|_____|____|<-----|____|_____|____|<-----|____|_____|____|

		if we want to add one node between John and Jack
		then we will add like this
		
	   _______________        _______________        _______________        _______________
  	  |    | Sam |    |----->|    |John |    |----->|    | Eve |    |----->|    |Jack |    |
  	  |null| (1) | 2  |      | 1  | (2) | 7  |      | 2  | (7) | 3  |      | 7  | (3) |null|
          |____|_____|____|<-----|____|_____|____|<-----|____|_____|____|<-----|____|_____|____|         
		
2) We can traverse the list in forward & backward direction both.      

========================================================================
//Disadvantages of LinkedList:

 1) It occcupies extra space for previous node address.
 2) In case of insertion or deletion of element
    int between we have to manage previous & next node
 
==============================================================================

//Properties of LinkedList:
 
1) LinkedList are index based DataStructure
2) LinkedList can store heterogeneous element or
   different data-types
3) LinkedList can store duplicate elements
4) LinkedList can store multiple null values
5) LinkedList follows the insertion order
6) But LinkedList does not follows the sorting order
7) LinkedList are non-synchronized collection 
 



*/
