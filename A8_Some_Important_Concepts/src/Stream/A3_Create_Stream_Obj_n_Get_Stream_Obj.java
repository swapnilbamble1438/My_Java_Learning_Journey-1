package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A3_Create_Stream_Obj_n_Get_Stream_Obj {

	
	public static void main(String[] args) {
		
		
		//Stream API - collection process
		// collection /group of object
		
		// creating blank Stream object
		Stream<Object> stream1 = Stream.empty();
		stream1.forEach(e ->{
			System.out.println(e);
		}); // it will not print anything
		
		
		// Array, Object, Collection
		String names[] = {"Swapnil","Ajay","Ankit","Vaibhav"};
		Stream<String> stream2 = Stream.of(names);
		
		stream2.forEach(e->{
			System.out.println(e);
		});
		
		//StreamBuilder
	Stream<Object> stream3 = Stream.builder().build();
		
		//IntStream
	IntStream intstream4 =  Arrays.stream(new int[] {1,2,3,4,5});
		intstream4.forEach(e->{
			System.out.println(e);
		});
		
		
		// List,Set,
		List<Integer> list = List.of(6,7,8,9,10);
		Stream<Integer> stream5 = list.stream();
		stream5.forEach(e->{
			System.out.println(e);
		});
		
		
		
		
	
	}
	
}
