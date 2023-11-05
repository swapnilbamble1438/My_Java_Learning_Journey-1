package Collection_Framework.A9_InOneGo;
/*

Collection: 
1) It is an interface which is present in 
   java.util package.Introduce in (1.2 version)
2) Syntax: public interface Collectin<E> extends Iterable<E>    
      -{
     |      // methods    
      -}
3) Hierarchy of Collection interface      
   None of the class directly inherit Collection Interface
4) Methods of Collection interface
   i) public boolean add(Object obj)
   ii) public boolean addAll(Collection c)
   iii) public boolean remove(Ojbect obj)
   iv) public boolean removeAll(Collection c)
   v) public boolean contains(Object obj)
   vi) public containAll(Collection c)
   vii) public boolean isEmpty()
   viii) int size()
   ix) Iterator iterator()

-------------------------------------------------------
 
 Hierarchy of Collection:
 
 (I) interface 
 (C) class
 (LC) legacy class
 
			                           Collection(I)(1.2v)
			      ________extends____________________|_____________extends________
			     |                                |                               | 
			     List(I)(1.2v)                   Set(I)(1.2v)                    Queue(I)(1.5v)
			    ___|_____________              ___|_____________               _________|_________
			   |          |      |            |                 |             |                   | 
	(1.2v)Arraylist(C)            |      |   (1.2v)Hashset(C)           |     (1.2v)PriorityQueue(C)    Dqeue(I)     
			 (1.2v)Linkedlist(C) |            |                 |                        
			            (1.0v)Vector(LC)      |        Sortedset(I)(1.2v)                    Arraydeque(C)
			                     |     (1.4v)LinkedHashset(C)   |       
			             (1.0v)Stack(LC)         Navigableset(I)(6v)
			                                                    |
								   Treeset(C)(1.2v)


---------------------------------------------------------------------------------------------- 



*/