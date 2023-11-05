package DSA.A1_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class A6_Dynamic_array_Arraylist {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(67);  // add
		list.add(234);
		list.add(11);
		list.add(35);
		list.add(55);
		list.add(323);
		list.add(66);
		list.add(89);
		
		
		list.set(0,99);  // update
		list.remove(2);	// remove
		
		System.out.println(list);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		
		
	}
	

}
