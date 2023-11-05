package Collection_Framework.A9_InOneGo;
/*
Stack:
1) Stack is the legacy class which was introduced
   in JDK 1.0 version
2) Stack is the child class of Vector class   
   which is present in java.util package
   ->Syntax:
      package java.util
      class Stack extends Vector
      {
      		//constructors
      		//methods
      }

----------------------------------------------------------
Properties of Stack:
1) Stack class was design on the basis of LIFO
   (Last In First Out)
   e.g:
     
   Empty Container          Elements
        Top              ____________
    |            |      |___Swapnil__|    
    |            |       ____________  
    |            |      |____Yash____|
    |____________|       ____________
      Bottom            |___Pratik___|
      
        
   now after storing elements in the empty container
         ________________
        |  ____________  |
        | |  ________  | |_ ____________
     |  | | |        | |   |___Swapnil__|    
     |  | | |     |  | |___ ____________  
     |  | |       |  |     |____Yash____|
     |  |         |  |_____ ____________
     |____________|        |___Pratik___|
   
   
        
       |  ____________  |   
       | |___Pratik___| |    here we have inserted
       |  ____________  |    Pratik at last it will
       | |____Yash____| |    pop first.       
       |  ____________  |    Means the element which
       | |___Swapnil__| |    inserted last will also 
       |________________|    come(get) out first.
                             and the elelment at top
                             is called the peak element
       
       e.g: Stack of Plates, Stack of Books
       
       NOTE: element added first will get the last index
       element added last will get the first index.
       and indexing in Stack starts with 1 not 0.
       
       
       
2) Stack can be implemented on the basis of arrays,
   ArrayList,LinkedList or Vector
          
   e.g this ArrayList when we store this elements inside
       Stack
       _______________________ 
      |10|20|30|40|50|60|70|80| 
      |__|__|__|__|__|__|__|__|  
       |                     |
      Bottom                Top
      
      
3) Stack is an index based DataStructure
4) Stack can store heterogeneous elements
   or different data-types

--------------------------------------------------------------------------

Constructor:
Stack contains only one constructor
1) Stack() : Default constructor

Methods:
1) push()
2) pop()
3) peak()
4) search()
5) empty()






    
      
      
*/