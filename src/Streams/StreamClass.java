package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				sum+= array[i];
			}
		}
		System.out.println(sum);
		
		int[] arr = {1,2,3,4,5,6};
		IntStream tot = Arrays.stream(arr).filter(n -> n % 2 == 0);
		System.out.println(tot);
		
		List<String> list = Arrays.asList("Java","Python","Angular");
		Stream<String> myStream = list.stream();
//		String[] arr = {"Java","Python","Angular"};
//		Stream<String> myStreamarr = Arrays.stream(arr);
		Stream<Integer> integerStream = Stream.of(1,2,3);
		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);
		Stream<String> limitString = Stream.generate(() -> "Wiley").limit(5);
		Stream<Integer> limitrandom = Stream.generate(() -> (int) Math.random() *100).limit(5);
//		list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//		List<Integer> filteredData = 
//				list.stream()
//					.filter(x -> x%2 == 0)
//					.map(n->n/2)
//					.distinct()
//					.sorted()
//					.collect(Collectors.toList());
//		System.out.println(filteredData);
 	}
}
