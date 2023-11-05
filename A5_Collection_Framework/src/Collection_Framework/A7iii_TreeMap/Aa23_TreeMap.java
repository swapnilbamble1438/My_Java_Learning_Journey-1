package Collection_Framework.A7iii_TreeMap;
/*
TreeMap:
1) It is an implemented class of NavigableMap
   But it also inherits the properties of
   SortedMap & Map interface
   Syntax-
   
   package java.util;
   class TreeMap implements NavigaleMap
   {
   		//constructors
   		//methods 
    }
2) It was introduced in JDK 1.2 version
3) TreeMap underline DataStructure is 
   "Red-Black tree".
    ______________________________________________
   |                                              |
   |    Properties of Red-Black Tree:             |
   |                                              |
   |  1) Every node is either red or black color. |
   |  2) The root node is always black.           |
   |  3) Every leaf node(NULL node) is black.     |
   |  4) If a node is red, then both its          |
   |     children are black.                      |
   |     Every red node parent should be black.   |                                         |
   |  5) For each node, all paths from the node   |
   |     to its descendant leaf nodes contain the |
   |     same number of black nodes.              |
   |______________________________________________|
 
   
   	e.g:
   	     B= Black Color Node
   		 R= Red Color Node
   	  
                               _
                              /B\--Root Node 
                              \_/ 
                              / \
                             /   \                      
                            /     \
                           /       \
                         _/         \_
                        /R\         /R\-- path from the from node 
                        \_/         \_/   to its descendant leaf nodes
                        / \         / \    contain the same number of black
                      _/   \_     _/   \_  nodes
                     /B\   /B\   /B\   /B\ 
                     \_/   \_/   \_/   \_/
                                 / \     \
                                /   \     \                 
                               /     \     \
                              /       \     \
                            _/         \_    \_
                           /R\         /R\   /B\-----Empty node will allways black
                           \_/         \_/   \_/
                           / \         / \
                         _/   \_     _/   \_
                        /B\   /B\   /B\   /B\ 
                        \_/   \_/   \_/   \_/    
                                  
------------------------------------------------------------------------------------------------

Properties of TreeMap:

1) We store the data in Key-Value pair
   in which Key should be unique but Value can
   be duplicate
2) TreeMap does not follows the insertion order 
   But follows the sorting order with respect
   to Keys
   working of inserting and sorting element:
   
    Entry                   
    106 -> Swapnil             
    103 -> Yash
    105 -> Pratik
    108 -> Deepak 
	           ___
		  /106\
                  \___/
                  /   \
              ___/     \___
	     /103\     /108\
             \___/     \___/
                 \
                  \___
		  /105\
                  \___/
		
		it will store smaller Key values to 
		left side and bigger Key values to 
		right side

3) It can store homogeneous & heterogenous elements		
   If you are using default sorting nature
   you can store only homogeneous elements.
   But using comparator you can store
   heterogeneous elements also.
4) TreeMap cannot store null values
   Because it follows sorting order
   and null values cannot be compare to 
   other values
5) TreeMap is non-synchronized DataStructure    




*/