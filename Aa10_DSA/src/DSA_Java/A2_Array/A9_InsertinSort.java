package DSA_Java.A2_Array;

class ArrayIns
{
	private int[] arr;
	private int nElems;
//------------------------------------------------------	
	
	public ArrayIns(int max)
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
		
	public void insertionSort()
	{
		//
		for(int i = 0; i < nElems-1; i++)
		{
			
			for(int j= i+ 1; j > 0; j--)
			{
				if(arr[j] < arr[j-1])
				{
					swap(j,j-1);
				}
				else
				{
					break;
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


public class A9_InsertinSort {

	public static void main(String[] args) {
	
		
		ArrayIns arr = new ArrayIns(100);
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
		
		arr.insertionSort();
		
		arr.display();
	}
}
