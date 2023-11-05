package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A2_Operations_with_n_without_Stream_API {

	
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,2,3,4,5); 
		
		// adding even numbers to new list
		
		// without using Stream API -----------------------------------------
		List<Integer> listEven1 = new ArrayList<>();
		for(Integer i:list1)
		{
			if(i % 2 == 0)
			listEven1.add(i);
		}
		System.out.println(listEven1);
		
		// using Stream API -------------------------------------------------
		Stream<Integer> stream = list1.stream();
		List<Integer> listEven2 = stream.filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(listEven2);
		
		//-------------------------------------------------------------------
		List<Integer> listEven3	= list1.stream().filter(i-> i%2==0).collect(Collectors.toList());
		System.out.println(listEven3);

		
		
		
		
		
	}
	

}
