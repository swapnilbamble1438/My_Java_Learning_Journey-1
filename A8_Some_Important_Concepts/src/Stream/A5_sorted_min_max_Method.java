package Stream;

import java.util.List;

public class A5_sorted_min_max_Method {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(1,2,3,4,5);
		
		// sorted
		numbers.stream().sorted().forEach(System.out::print);

		System.out.println();
		
		// min
		Integer integer1 = numbers.stream().min((a,b) -> a.compareTo(b)).get();
		System.out.println("min: " +integer1);
		
		// max
		Integer integer2 = numbers.stream().max((a,b) -> a.compareTo(b)).get();
		System.out.println("max: " +integer2);
		
		
	}

}
