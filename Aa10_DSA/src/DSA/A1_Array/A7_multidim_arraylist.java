package DSA.A1_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class A7_multidim_arraylist {

	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	for(int i = 0; i < 3; i++)
	{
		list.add(new ArrayList<>());
	}
	
	for(int i = 0; i < 3; i++)
	{
		for(int j = 0; j < 3; j++)
		{
			list.get(i).add(sc.nextInt());
		}
	}
	System.out.println(list);
	
	
 }
}