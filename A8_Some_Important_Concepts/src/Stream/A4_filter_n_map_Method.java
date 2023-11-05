package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class A4_filter_n_map_Method {
	
	public static void main(String[] args) {
		
		// filter(Predicate) 
		// boolean value function
		// e->{ return true }
		
		
		
		// map(Function)
		/*
			using map we can perform action
			on each element
		 */
		
		
		// using filter method
		List<String> names = List.of("Aman","Ankit","Abhinav","Durgesh");
		
		List<String> newNames =	names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
		names.stream().filter(e->e.startsWith("A")).forEach(e->{
			System.out.print(e + " ");
		});
		
		System.out.println();
		
		// using map method
		List<Integer> numbers = List.of(1,2,3,4,5);
		
		List<Integer> newNumbers =	numbers.stream().map(e->e*e).collect(Collectors.toList());
		
		System.out.println(newNumbers);
		
		// Print
		numbers.stream().map(e->e*e).forEach(e->{
			System.out.print(e + " ");
		});
		
		System.out.println();
		
		newNames.stream().forEach(System.out::println);
		
		
		
		
		
		
	}

}
