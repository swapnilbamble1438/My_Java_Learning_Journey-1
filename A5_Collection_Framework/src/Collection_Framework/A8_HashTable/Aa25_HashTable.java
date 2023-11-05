package Collection_Framework.A8_HashTable;
/*
 Hashtable:
 1) Hashtable is the direct implemented class
    of Map interface
    Syntax:
        package java.util;
        class Hashtable implements Map
        {
        	// constructors
        	// methods
        }
 2) It is a legacy class & was introduced
    in JDK 1.0 version
 3) Hashtable underline DataStructure is
    Hashtable
    
---------------------------------------------------------
Properties of Hashtable:

1) Hashtable contains the data in key-value pair
   & each key-value pair is known as entry
2) In Hashtable, keys should alway be unique
   but values can be duplicate
3) Hashtable can store hetrogeneous elements
   or different type of elements at key position
4) We cannot store null value in Hashtable
5) Hashtable does not follows the insertion
   and sorting order
6) Hashtable are synchronized DataStructure

----------------------------------------------------------
Working of Hashtable:

	Hashtable ht = new Hashtable();  // Hashtable initial capacity is 11
	
	
	------------------------------------------------
	ht.put(106,"Swapnil");
	
	assume hashcode value of this entry be 106  // NOTE: 106 is hashcode value, we are not taking Key "106"
	
	Hashcode % 11 = rem
	106 % 11 = 7  
	 so here we got 7 rem so at index 7 
	 our entry will get inserted
	----------------------------------------------- 
	ht.put(108,"Sachin");
	
	assume hashcode value of this entry be 108 

	108 % 11 = 9  
	----------------------------------------------- 
	ht.put(102,"Rakesh");
	
	assume hashcode value of this entry be 102 

	102 % 11 = 3  
	----------------------------------------------- 
	 ht.put(117,"Yash");  
	 assume hashcode value of this entry be 117
	 117 % 11 = 7
	 so here at index 7 there is already one
	 entry inserted so this situation is called
	 Hash-Collision.
	 Hash-Collision is the situation when
	 multiple data shares the same indices value.
	 so in this case LinkedList will work
	 to store the entry in the same index
	 ------------------------------------------------
	          Hashtable
	       _______________ 
       __  10 |_______________|---Bucket, There are total 11 Buckets here by default			  
      |	    9 |__108=Sachin___|
      |	    8 |_______________|    ____________
 This |	    7 |__106=Swapnil__|<--|__117=Yash__| // it will be store in next node
  are |     6 |_______________|
  the |     5 |_______________|
 index|     4 |_______________|
      |     3 |__102=Rakesh___|
      |     2 |_______________| 
      |__   1 |_______________|
            0 |_______________|
 
 
	Element retrieval will be from top to botton
	and from right to left in linkedlist
	
	e.g:
	{108=Sachin, 117=Yash, 106=Swapnil, 102=Rakesh};
 
 
 
 */


