/*
  The Queue class without nItems
 */

package DSA_Java.A4_Queue;

import java.util.Arrays;

class Queue3
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	
//---------------------------------------------------
public Queue3 (int s)
{
	maxSize = s+1;
	queArray = new int[maxSize];
	front = 0;
	rear = -1;
}
//---------------------------------------------------
public void insert(int j)
{
	if(rear == maxSize -1)
	{
		rear = -1;
	}	
		queArray[++rear] = j;
}	
//---------------------------------------------------
	
public void show()
{
	System.out.println(Arrays.toString(queArray));
}




}




public class A3_Queue {

	public static void main(String[] args) {
		
		Queue3 q = new Queue3(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);
		q.insert(7);
		q.insert(8);
		
		q.show();
	}
}
