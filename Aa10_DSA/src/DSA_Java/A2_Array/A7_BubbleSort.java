package DSA_Java.A2_Array;


class ArrayBub
{
	private int[] arr;
	private int nElems;
//------------------------------------------------------	
	
	public ArrayBub(int max)
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
		
	public void bubbleSort()
	{
		//
		for(int i = 0; i < nElems-1; i++)
		{
			for(int j= i+ 1; j< nElems; j++)
			{
				int tmp = 0;
				if(arr[i] > arr[j])
				{
					swap(i,j);
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



public class A7_BubbleSort {
	
	public static void main(String[] args) {
		
		ArrayBub arr = new ArrayBub(100);
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
		
		arr.bubbleSort();
		
		arr.display();
		
	}

}
