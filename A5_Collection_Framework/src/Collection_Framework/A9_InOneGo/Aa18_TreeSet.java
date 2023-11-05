package Collection_Framework.A9_InOneGo;
/*
TreeSet:
1) TreeSet is the direct implement class of
   NavigableSet but indirectly implements
   SortedSet & Set interface
   Syntax-
      package java.util;
      class TreeSet implements NavigableSet
      {
      		//constructors
      		//methods
      }
2) TreeSet was introduced in JDK 1.2 version
3) TreeSet underline DataStructure is 
   "Balanced Tree"      
----------------------------------------------------------------
Properties of TreeSet:
1) TreeSet is not an index based DataStructure
2) TreeSet does not allow to store heterogeneous
   data-types.
3) TreeSet cannot store the duplicate elements
4) TreeSet cannot store null values   
5) TreeSet does not follows the insertion order
6) TreeSet follows the sorting order
   for e.g
   working of inserting and sorting element
   
    ------------------------------------------------------------                
                      Parent node  
      Elements            __
      1st(40)----------> /40\ 
                         \__/\
      2nd(60)                 \__
                              /60\  
                              \__/

        here first element will be first added to 
        parent node and after adding second element
        1st element will be compare with 2nd element
        and the element with greater value will be
        shifted to right side node
  ------------------------------------------------------------------     
       
       Elements                   __ 
       1st(40)                   /40\ 
                                /\__/\
       2nd(60)               __/      \__
                            /20\      /60\ 
       3rd(20)              \__/      \__/  
                            
		again 3rd element will be compare to 
		2nd and 1st element values and the element
		with the smaller value will be shifted to
		left side node
		
	NOTE: comparison will be done using compareTo() method	
  ------------------------------------------------------------------		
		
		
		


*/