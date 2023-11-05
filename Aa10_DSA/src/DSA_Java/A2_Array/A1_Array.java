package DSA_Java.A2_Array;

public class A1_Array {

	public static void main(String[] args) {
		
		int []arr;    // reference
		arr = new int[11];   // make array
		
//---------------------------------------------------------
		
		arr[0] = 77;       // insert 10 items
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
	int	nElems = arr.length-1;      // number of Elements in array
		System.out.println(nElems);
//---------------------------------------------------------------------
		
		for(int j = 0; j < nElems; j++)    // display items
		{
			System.out.print(arr[j] + " ");
		}
		System.out.println();
//----------------------------------------------------------------------		
		
		int searchElems = 66;
		int count = 0;
		
		for(int j = 0; j < nElems; j++)
		{
			if(arr[j] == searchElems)
					count++;	
		}
		if(count > 0)
			System.out.println("Element is Present");
		else
			System.out.println("Element is not Present");
			
		System.out.println();
//---------------------------------------------------------------------
		
		int deleteElems = 55;    // delete Element
		int a = 0;
		
		for(int j = 0; j < nElems; j++)
		{
			if(arr[j] == deleteElems)
			{
				a = j;
				break;
			}
		}
		
		for(int k = a; k < nElems; k++)  // move higher ones
		{
			arr[k] = arr[k+1];
		}
		nElems--;                      // decrement size
		
		
//-----------------------------------------------------------
		
		 
		for(int j= 0; j < nElems;j++)   // display items
		{
			System.out.print(arr[j] + " ");
		}
		
		
		
		
		
		
		
		
		
	}
	
}
