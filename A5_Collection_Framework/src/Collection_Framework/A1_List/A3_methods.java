package Collection_Framework.A1_List;

/*
 Methods of the List Interface
Since the main concept behind the different types 
of the lists is the same, the list interface contains 
the following methods:
 
 1) add(int index, element)	
 This method is used to add an element at a particular 
 index in the list. When a single parameter is passed, 
 it simply adds the element at the end of the list.
 
 2) addAll(int index, Collection collection)	
 This method is used to add all the elements in the 
 given collection to the list. When a single parameter 
 is passed, it adds all the elements of the given 
 collection at the end of the list
 
 3) size()	
 This method is used to return the size of the list.
 
 4) clear()	
 This method is used to remove all the 
 elements in the list. However, the reference of the 
 list created is still stored.
 
 5) remove(int index)	
 This method removes an element 
 from the specified index. It shifts subsequent 
 elements(if any) to left and decreases their indexes 
 by 1.
 
 6) remove(element)
 	This method is used to remove the 
 first occurrence of the given element in the list.
 
 7) get(int index)	
 This method returns elements at the specified index.
 
 8) set(int index, element)	
 This method replaces elements at a given index with 
 the new element. This function returns the element 
 which was just replaced by a new element.
 
 9) indexOf(element)	
 This method returns the first occurrence of the given 
 element or -1 if the element is not present in the 
 list.
 
 10) lastIndexOf(element)	
 This method returns the last occurrence of the given 
 element or -1 if the element is not present in the 
 list.
 
 11) equals(element)	
 This method is used to compare the equality of the 
 given element with the elements of the list.
 
 12) hashCode()	
 This method is used to return the hashcode value of 
 the given list.
 
 13) isEmpty()	
 This method is used to check if the list is empty or 
 not. It returns true if the list is empty, else false.
 
 14) contains(element)	
 This method is used to check 
 if the list contains the given element or not. 
 It returns true if the list contains the element.
 
 15) containsAll(Collection collection)	
 This method is used to check if the list contains all
  the collection of elements.
  
 16) sort(Comparator comp)	This method is used to sort 
 the elements of the list on the basis of the given 
 comparator.
 
 
 
 
 
 
 */
