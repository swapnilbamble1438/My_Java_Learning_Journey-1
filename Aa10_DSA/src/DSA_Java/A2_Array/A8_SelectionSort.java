package DSA_Java.A2_Array;

class ArraySel
{
	private int[] arr;
	private int nElems;
//------------------------------------------------------	
	
	public ArraySel(int max)
	{
		arr = new int[max];
		nElems= 0;
	}	
//------------------------------------------------------	
	
	public void insert(int value)
	{
		arr[nElems] = value;
		nElems++;
	}
//------------------------------------------------------	

	public void display()
	{
		for(int j= 0; j<nElems; j++)
		{
			System.out.print(arr[j] + " ");
		}
	}
//------------------------------------------------------	
		
	public void selectionSort()
	{
		//
		for(int i = 0; i < nElems-1; i++)
		{
			int min = i;
			
			for(int j= i+ 1; j< nElems; j++)
			{
				if(arr[min] > arr[j])
				{
					swap(min,j);
				}
				if(arr[min] == arr[j])
				{
					swap(min+1,j);
				}
			}
		}
	}
//------------------------------------------------------	
	
	public void swap(int i,int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
//------------------------------------------------------	
	
}



public class A8_SelectionSort {
	
	public static void main(String[] args) {
		

		ArraySel arr = new ArraySel(100);
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		System.out.println();
		
		arr.selectionSort();
		
		arr.display();
		
		
	}

}
