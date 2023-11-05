package Collection_Framework.A9_InOneGo;


/*

Collection Framework:

Collection: 
 It is the single entity or object 
which can store multiple data

Framework:
 represents the library
 
 It is the set of predefined classes & interfaces
 which is used to store multiple data.
 
 It contains 2 main part
 1) java.util.Collection
 2) java.util.Map
 
 -------------------------------------------------------
 
 Hierarchy of Collection:
 
 (I) interface 
 (C) class
 (LC) legacy class
 
                           Collection(I)
      ________________________________|_______________________________
     |                                |                               | 
     List(I)                        Set(I)                        Queue(I)
   ____|_____________              ___|______                     ____|_____
   |          |      |            |          |                   |          |
Arraylist(C)  |      |         Hashset(C)    |            PriorityQueue(C) Dqeue(I)     
       Linkedlist(C) |            |          |                              | 
                  Vector(LC)      |        Sortedset(I)                    Arraydeque(C)
                    |     LinkedHashset(C)   |       
                  Stack(LC)                Navigableset(I)
                                             |
					Treeset(C)


---------------------------------------------------------------------------------------------- 

Hierarchy of Map:


                                Map(I)
       __________________________|______________________________________________________________       
      |                   |                   |               |                |                |
   HashMap(C)      IdentityHashMap(C)    WeakHashMap(C)   SortedMap(I)    HashTable(C)     Dictionary(C)
      |                                                       |                |
   LinkedHashMap(C)                                   NavigableMap(I)    Properties(C)
                                                              |
                                                          TreeMap(C)
                                                             
                                                             
----------------------------------------------------------------------------------------------------------                                                             
We can create object of classes but not of interface.
and that object is called collection object.
==========================================================================================================

Collections in Java
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

What is Collection in Java
A Collection represents a single unit of objects, i.e., a group.

What is a framework in Java

It provides readymade architecture.
It represents a set of classes and interfaces.
It is optional.

What is Collection framework
The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

Interfaces and its implementations, i.e., classes
Algorithm

 */					
