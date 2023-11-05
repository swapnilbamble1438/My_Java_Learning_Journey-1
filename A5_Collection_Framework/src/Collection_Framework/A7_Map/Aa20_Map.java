package Collection_Framework.A7_Map;
/*
Map: 
1) Map is an interface which is present in 
   "java.util" package
2) Map does not inherit Collection interface
3) Syntax-
       package java.util;
       public interface Map
       {
       		//methods
       
       }
4) Map was introduced in JDK 1.2 version
5) Hierarchy of Map interface:

       
                          Map(I)
        ___________________|______________________                    
       |                     |                    |
       |                 SortedMap(I)             |     
       |                      |                   |
       |                 NavigableMap(I)          | 
       |                       |                  | 
    HashMap(c)             TreeMap(c)          HashTable(c)
       |
 LinkedHashMap(c)

---------------------------------------------------------------------
Properties of Map:
1) Map stores the data in key-value pair
    e.g             Map
                Key  |  Value
                -----|---------
                 101 | Swapnil
                 102 | Yash
                 104 | Pratik
                 105 | Swapnil
 
  i) In Map, Keys should be unique of each element
  ii) Duplicate Values are allowed 
  iii) but if you try to add duplicate Key value 
       then the old Key Value will be updated with 
       the new Key Value
  iv) Key and Value pair together of one element 
      called an Entry

2) In Map we can store maximum one null value in Key
3) But we can store multiple numbers of null values
   in Value
4) Map does not follows the insertion order
5) Map does not follows the sorting order     
6) Map can store heterogeneous elements or 
   different types of elements      




*/