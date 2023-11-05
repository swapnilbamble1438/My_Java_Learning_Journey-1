package DSA_Java.A2_Array;

// demonstrates array class with low-level interface
// to run this program: C>java LowArrayApp




class LowArray {
	
	private int[] a;   // refer to array a
	
	public LowArray(int size)  // constructor
	{
		a = new int[size];
	}
	
	public void setElem(int index, int value) // put element into array
	{
		a[index] = value;
	}
	
	public int getElem(int index) // get element from array
	{
		return a[index];
	}
	
}
//----------------------------------------------------------------------------
 
public class A2_LowArrayApp{
	
	public static void main(String[] args) 
	{
		
		LowArray arr;                 // reference
		arr = new LowArray(100);     // create LowArray object
		
		arr.setElem(0 , 77);   // insert 10 elements
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		int	nElems = 10;      // number of Elements in array
	
//---------------------------------------------------------------------
		
		for(int j = 0; j < nElems; j++)    // display items
		{
			System.out.print(arr.getElem(j) + " ");
		}
		System.out.println();
//----------------------------------------------------------------------		
		
		int searchElems = 66;          // search for element
		int count = 0;
		
		for(int j = 0; j < nElems; j++)
		{
			if(arr.getElem(j) == searchElems)
					count++;	
		}
		if(count > 0)
			System.out.println("Element is Present");
		else
			System.out.println("Element is not Present");
			
		System.out.println();
//---------------------------------------------------------------------
		
		int deleteElem = 55;    // delete Element
		int a = 0;
		
		for(int j = 0; j < nElems; j++)
		{
			if(arr.getElem(j) == deleteElem)
			{
				a = j;
				break;
			}
		}
		
		for(int k = a; k < nElems; k++)  // move higher ones
		{
			arr.setElem(k, arr.getElem(k+1));
		}
		nElems--;                      // decrement size
		
		
//-----------------------------------------------------------
		
		 
		for(int j= 0; j < nElems;j++)   // display items
		{
			System.out.print(arr.getElem(j) + " ");
		}
		
		
		
		
		
		
	}
}