package Collection_Framework.A9_InOneGo;
/*
  Retrieving element one by one using cursors
		
Cursors: There are three types of cursors
		 1) Iterator
		 2) ListIterator
		 3) Enumerator
		 
	 Iterator                 |        ListIterator
----------------------------------|------------------------------------------		                          
1) We can get Iterator cursor by  |1) We can get ListIterator cursor by
   iterator() method	          |   listIterator() method
   E.g. List l = new ArrayList(); |   E.g. List l = new ArrayList();               
   Iterator itr = l.iterator();   |   ListIterator litr = l.listIterator();
                                  |
2) Iterator cursor can be used    |2) ListIterator cursor can be used only                                  
   with any Collection object.    |   with List implemented classes i.e
                                  |   ArrayList,LinkedList,Vector,Stack.
                                  |
3) Iterator methods are:          |3) ListIterator methods are:                                   
   hasNext(),next(),remove()      |   hasNext(),next(),hasPrevious(),
                                  |   previous(),remove(),set() 
                                  |
4) By using Iterator cursor we    |4) By using ListIterator cursor 
   can retrieve elements only in  |   we can retrieve elements in forward
   forward direction.             |   and backward directions.
                                  |
5) By using Iterator cursor we    |5) By using ListIterator cursor we
   can read & remove the elements.|   can read,remove,replace,add the
                                  |   elements.
                                  |                         




*/



