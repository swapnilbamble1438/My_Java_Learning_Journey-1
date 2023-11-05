package Collection_Framework.A5_HashSet;
/*
HashSet:
1) It is an implemented class of Set interface
   which is present in java.util package
   Syntax:
      package java.util
      class HashSet implements Set
      {
         //constructors
         //methods
      }
2) HashSet underline DataStructure is "Hashtable"
   i) HashSet is backed up by "Map"      
-----------------------------------------------------------

Properties of HashSet:
1) HashSet are not an index based DataStructure
2) They store the elements according to their
   "hashcode" values.
   hashcode is the unique Integer value of 
   element
3) Storing element in HashSet
                        
                    HashSet       Map
      Element      |      |    |Key|Value|
         10------->|(123) |--->|10 |     |
        (123)      |      |    |   |     |
    HashCode Value |______|    |___|_____|
                   
         so when we try to insert element into HashSet
         it will actually store the Element in Map
         as a Key and Value and store the hashcode       
         value in HashSet

4) HashSet does not store duplicate elements
   HashSet does not allow Same Key value
5) HashSet cannot store multiple null values
6) HashSet can store heterogeneous elements
   or different data-types   
7) HashSet does not follows the insertion order.
   Means whenever we insert any element at 
   first it does not mean it will place only at first
   index, it will get randomly place at any index.
8) HashSet does not follows the sorting order
9) HashSet are non-synchronized DataStructure      
  




*/