package DSA_Java.A4_Queue;

import java.util.Arrays;

class Queue2
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue2(int s)
	{
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int j)
	{
		if(rear == maxSize-1)
		{
			rear = -1;
		}
		queArray[++rear] = j;
		nItems++;
	}
	
	public void show()
	{
		System.out.println(Arrays.toString(queArray));
	}
	
	
}



public class A2_Queue {
	public static void main(String[] args) {
		
		Queue2 q  = new Queue2(5);
		q.insert(1);		
		q.insert(2);		
		q.insert(3);		
		q.insert(4);
		q.insert(5);
		q.insert(6);
		
		q.show();
	}
}
