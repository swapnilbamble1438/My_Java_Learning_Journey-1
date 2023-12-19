package com;

import java.util.ArrayList;
import java.util.List;

public class A6_Freq_of_each_String_object_in_ArrayList {
	
	
	public static void main(String args[])
	{
		ArrayList<String> str = new ArrayList<String>();
		str.add("Swapnil");
		str.add("Yash");
		str.add("Pratik");
		str.add("Zurez");
		str.add("Swapnil");
		str.add("Om");
		
		
	 Object[] a = str.toArray();
	
	List<Integer> inte = new ArrayList<Integer>();
	
	for(int i= 0; i< a.length -1;i++)
	{
		int count = 1;
		
		for(int j = i + 1; j < a.length; j++)
		{
			
			if(a[i] == a[j])
			{
				inte.add(j);
				count ++;
			}
			
		}
		
		if(!inte.contains(i))
		{
		System.out.println(a[i] +" : "+ count);
		}
		
		
	}
		

  }
}
