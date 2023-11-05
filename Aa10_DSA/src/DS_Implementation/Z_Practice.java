package DS_Implementation;


/*
 Adding 1st element
  
  temp = (null,1,null);
  head = (null,1,null);
  tail = (null,1,null);
  
  Adding 2nd element
  
  temp = (null,2,null);
  tail.next = temp;      // tail = (null,1,(null,2,null));
  temp.previous = tail   // temp = ((null,1,(null,2,null)),2,null);
  tail = temp;           // tail = ((null,1,(null,2,null)),2,null);
  tail.next = null;      // tail = ((null,1,(null,2,null)),2,null);
  
  Adding 3rd element
  
  temp = (null,3,null);
  tail.next = temp;     // tail = ((null,1,(null,2,null)),2,(null,3,null));
  temp.previous = tail; // temp = (((null,1,(null,2,null)),2,(null,3,null)),3,null);
  tail = temp;          // tail = (((null,1,(null,2,null)),2,(null,3,null)),3,null);
  tail.next = null;     // tail = (((null,1,(null,2,null)),2,(null,3,null)),3,null)


*/
public class Z_Practice {

	public static void main(String[] args) {
		
	}
	
	
}
