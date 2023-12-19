package Collection_Framework.A1_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A6_ListTraverse {

	public static void main(String[] args) {
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Swapnil");
		listStr.add("Yash");
		listStr.add("Pratik");
		listStr.add("Zurez");
		
		// simple loop ================================================
		System.out.println("Simple loop:");
		System.out.println("-----------------------------------------");

		for(int i = 0; i < listStr.size();i++)
		{
			System.out.println(listStr.get(i));
		}
		
		System.out.println("-----------------------------------------");
		
		// for each ====================================================
		System.out.println("for each:");
		System.out.println("-----------------------------------------");

		for(String str: listStr)
		{
			System.out.println(str);
		}
		
		System.out.println("-----------------------------------------");

		// iterator ==================// we can only travers in forward direction
		System.out.println("iterator:");
		System.out.println("-----------------------------------------");

		Iterator itr = listStr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------------------");

		// ListIterator =================// we can traverse in both forward and backward direction
		// (List(ArrayList,LinkedList,Vector))
		System.out.println("ListIterator:");
		System.out.println("-----------------------------------------");

		System.out.println("forward traverse:");
		ListIterator litr = listStr.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println();
		
		System.out.println("backward traverse:");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		System.out.println("-----------------------------------------");

		// lambda function for each loop ===========================================
		// it works only with version after java 8
		System.out.println("lambda function loop:");
		System.out.println("-----------------------------------------");
		
		listStr.forEach((element)->
		{
			System.out.println(element);
		});
		
		System.out.println("-----------------------------------------");
		
		// listStr.stream().forEach(null);
		
		
		
	}
}
