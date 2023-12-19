package Collection_Framework.A1_List;

import java.util.ArrayList;
import java.util.List;

public class A7_Freq_of_each_elem {
	
	public static void main(String[] args) 
	{

		ArrayList<String> str = new ArrayList<String>();
		str.add("Swapnil");
		str.add("Yash");
		str.add("Pratik");
		str.add("Zurez");
		str.add("Swapnil");
		str.add("Om");
		
		List<Integer> inte = new ArrayList<Integer>();
		
		
		for(int i = 0; i < str.size();i++)
		{
			int count = 1;
			for(int j = i+1; j < str.size()-1; j++)
			{
				if(str.get(i) == str.get(j))
				{
					inte.add(j);
					count ++;
				}
			}
			
			if(!inte.contains(i))
			{
				System.out.println(str.get(i) + " : " + count);
			}
		}
		
	}
	

}
