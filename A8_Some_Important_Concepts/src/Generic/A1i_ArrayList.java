package Generic;

import java.util.ArrayList;

public class A1i_ArrayList {
	
	public static void main(String[] args)
	{
		ArrayList alist = new ArrayList();
		
		alist.add(54);
		alist.add(643);
		
		int a = (int)alist.get(0); // try it with removin int it will give error
		System.out.println(a);
	}

}
