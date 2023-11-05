package DSA_Java.A2_Array;

import java.util.Arrays;

class ArrayBubble
{
	private int[] arr;
	private int nElems;
	
//----------------------------------------------------------------
	public ArrayBubble(int size)
	{
		arr = new int[size];
		nElems =0;
	}
//----------------------------------------------------------------
	public void insert(int value)
	{
		arr[nElems] = value;
		nElems++;
	}

//---------------------------------------------------------------
	public void show()
	{
		System.out.println(Arrays.toString(arr));
	}
//--------------------------------------------------------------
	public void bubbleSort()
	{
		for(int i = 0; i < nElems - 1; i++)
		{
			for(int j = i + 1; j < nElems; j++)
			{
				int tmp = 0;
				if(arr[i] > arr[j])
				{
					swap(i,j);
				}
			}
		}
	}
//--------------------------------------------------------------

	public void swap(int i, int j) 
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j]  = tmp;
	}
	
//--------------------------------------------------------------

	public void display()
	{
		for(int j = 0; j < nElems; j++)
		{
			System.out.print(arr[j] + " ");
		}
	}
	
	
	
}


public class Z {
	
	public static void main(String args[])
	{
ArrayBubble arr = new ArrayBubble(5);
	
	arr.insert(8);
	arr.insert(4);
	arr.insert(2);
	arr.insert(7);
	arr.insert(6);
	
	arr.bubbleSort();

	arr.display();
}

}
