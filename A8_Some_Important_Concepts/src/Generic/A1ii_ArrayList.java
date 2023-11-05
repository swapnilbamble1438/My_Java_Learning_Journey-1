
package Generic;

import java.util.ArrayList;

public class A1ii_ArrayList {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> alist = new ArrayList(); // but if we define here out datatype we  
		
		alist.add(54);
		alist.add(643);
		
		int a = alist.get(1); // dont have to mention here the datatype . but now out arraylist will only allow the mention datatype variables in the list.
		System.out.println(a);
	}

}
