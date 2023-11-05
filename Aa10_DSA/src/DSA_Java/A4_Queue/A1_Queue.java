package DSA_Java.A4_Queue;

import java.util.Arrays;

class Queue
{

	private int size;
	private int[] queArray;
	private int front;
	private int rear;
	private int nElems;
	
//--------------------------------------------------------------------------------	
	public Queue(int size) {
		this.size = size;
		queArray = new int[size];
		front = 0;
		nElems = 0;
	}
//--------------------------------------------------------------------------------
	public void insert(int value)
	{
		if(nElems == size)
		{
		int a = queArray[nElems -1];
			 nElems--;	
		}
		
		int temp1 = -1;
		int temp2 = -1;
		
		if(nElems > 0)
		{
			for(int i = 0; i < nElems; i++ )
			{
			
				temp1 = queArray[i+1];
				if(temp2 > -1)
				{
					queArray[i+1] = temp2;
				}
				else {
				queArray[i+1] = queArray[i];	
				}
				temp2 = temp1;
				
				
			}
		}
		queArray[0] = value;
		nElems++;
	}
//--------------------------------------------------------------------
	public int remove()
	{
		int temp = queArray[nElems-1];
		 nElems--;
		 return temp;
	
	}
//---------------------------------------------------------	
	public int peekFront()
	{
		return queArray[front];
	}
//----------------------------------------------------
	public boolean isEmpty()
	{
		return (nElems == 0);
	}
//----------------------------------------------------
	public boolean isFull()
	{
		return (nElems > -1);
	}
//----------------------------------------------------
	public int size()
	{
		return nElems;
	}
//-----------------------------------------------------
	public void display()   // display elements
	{
		for(int j= 0; j < nElems ;j++)   // display items
		{
			System.out.print(queArray[j] + " ");
		
		}
	}
	
//------------------------------------------------------------
	
	public void show()
	{
		System.out.println(Arrays.toString(queArray));
	}
}

/////////////////////////////////////////////////////////
public class A1_Queue {
	
	public static void main(String[] args) {
		
		Queue q = new Queue(3);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		
		
		q.display();
		System.out.println();
		System.out.println("Size: "+ q.size());
		System.out.println("Peek: "+ q.peekFront());
		
		
		System.out.println("Removed Elem: "+ q.remove());
		
		q.insert(50);
		q.insert(60);
		q.insert(70);
		
		q.display();
		System.out.println("Size: " + q.size());
		System.out.println("Peek: "+ q.peekFront());
		
		System.out.println("============================================");
		
		
		q.show();
		
		
		
	}
	
	
	
}
