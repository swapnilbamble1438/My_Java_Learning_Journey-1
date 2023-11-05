package Collection_Framework.A4_Stack;

/*

 Methods in Stack Class 


1) empty()
It returns true if nothing is on the top of the stack. 
Else, returns false.

2) peek()
Returns the element on the top of the stack, 
but does not remove it.

3) pop()
Removes and returns the top element of the stack. 
An ‘EmptyStackException’ 
An exception is thrown if we call pop() when the 
invoking stack is empty.

4) push(Object element)
Pushes an element on the top of the stack.

5) search(Object element)
It determines whether an object exists in the stack. 
If the element is found, 
It returns the position 
of the element from the top of the stack. Else, 
it returns -1.


-----------------------------------------------------------------------------

Methods inherited from class java.util.Vector


1) add(Object obj)	
Appends the specified element to the end of this Vector.

2) add(int index, Object obj)	
Inserts the specified element at the specified position
 in this Vector.

3) addAll(Collection c)	
Appends all of the elements in the specified Collection 
to the end of this Vector, in the order that they are 
returned by the specified Collection’s Iterator.

4) addAll(int index, Collection c)	
Inserts all the elements in the specified Collection 
into this Vector at the specified position.

5) addElement(Object o)	
Adds the specified component to 
the end of this vector, increasing its size by one.

6) capacity()	
Returns the current capacity of this vector.

7) clear()	
Removes all the elements from this Vector.

8) clone()	
Returns a clone of this vector.

9) contains(Object o)	
Returns true if this vector contains the specified
 element.

10) containsAll(Collection c)	
Returns true if this Vector contains all the elements 
in the specified Collection.

11) copyInto(Object []array)	
Copies the components of this vector into the specified 
array.

12) elementAt(int index)	
Returns the component at the specified index.

13) elements()	
Returns an enumeration of the components of this vector.

14) ensureCapacity(int minCapacity)	
Increases the capacity of this vector, if necessary, 
to ensure that it can hold at least the number of 
components specified by the minimum capacity argument.

15) equals()	
Compares the specified Object with this Vector for 
equality.

16) firstElement()	
Returns the first component (the item at index 0) of 
this vector.

17) get(int index)	
Returns the element at the specified position in this 
Vector.

18) hashCode()	
Returns the hash code value for this Vector.

19) indexOf(Object o)	
Returns the index of the first occurrence of the 
specified element in this vector, or -1 
if this vector does not contain the element.

20) indexOf(Object o, int index)	
Returns the index of the first occurrence of the 
specified element in this vector, searching forwards 
from the index, or returns -1 if the element is not 
found.

21) insertElementAt(Object o, int index)	
Inserts the specified object as a component in this 
vector at the specified index.

22) isEmpty()	
Tests if this vector has no components.

23) iterator()	
Returns an iterator over the elements in this list 
in proper sequence.

24) lastElement()	
Returns the last component of the vector.

25) lastIndexOf(Object o)	
Returns the index of the last occurrence of the
 specified element in this vector, or -1
 If this vector does not contain the element.

26) lastIndexOf(Object o, int index)	
Returns the index of the last occurrence of the 
specified element in this vector, 
searching backward from the index, or returns -1 if the
 element is not found.

27) listIterator()	
Returns a list iterator over the elements in this list (in proper sequence).

28) listIterator(int index)	
Returns a list iterator over the elements in this list 
(in proper sequence), starting at the specified 
position in the list.

29) remove(int index)	
Removes the element at the specified position in 
this Vector.

30) remove(Object o)	
Removes the first occurrence of the specified element 
in this Vector If the Vector does not contain the 
element, it is unchanged.

31) removeAll(Collection c)	
Removes from this Vector all of its elements that 
are contained in the specified Collection.

32) removeAllElements()	
Removes all components from this vector and sets its 
size to zero.

33) removeElement(Object o)	
Removes the first (lowest-indexed) occurrence of the 
argument from this vector.

35) removeElementAt(int index)	
Deletes the component at the specified index.

35) removeRange(int fromIndex, int toIndex)	
Removes from this list all the elements whose index 
is between fromIndex, inclusive, and toIndex, 
exclusive.

36) retainAll(Collection c)	
Retains only the elements in this Vector that are 
contained in the specified Collection.

37) set(int index, Object o)	
Replaces the element at the specified position in 
this Vector with the specified element.

38) setElementAt(Object o, int index)	
Sets the component at the specified index of this 
vector to be the specified object.

39) setSize(int newSize)	
Sets the size of this vector.

40) size()	
Returns the number of components in this vector.

41) subList(int fromIndex, int toIndex)	
Returns a view of the portion of this List between 
fromIndex, inclusive, and toIndex, exclusive.

42) toArray()	
Returns an array containing all of the elements 
in this Vector in the correct order.

43) toArray(Object []array)	
Returns an array containing all of the elements in 
this Vector in the correct order; the runtime
 type of the returned array is that of the specified
  array.

44) toString()	
Returns a string representation of this Vector, 
containing the String representation of each element.

45) trimToSize()	
Trims the capacity of this vector to be the vector’s 
current size.

 *
 */
