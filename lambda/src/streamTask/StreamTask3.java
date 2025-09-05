package streamTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//		                          10 ~ 100
		ArrayList<Integer> list = new ArrayList<Integer>();
	    IntStream.rangeClosed(0, 4).map(c -> ((c + 1)* 10)).map(c -> (c - 5) * 2).forEach(c -> list.add(c));
	    
	    list.stream().forEach(System.out::print);
	    ArrayList<String> newList = IntStream
	    		.rangeClosed(0, 4) // Integer
			    .map(c -> ((c + 1)* 10)) // IntStream
			    .map(c -> (c - 5) * 2) // IntStream
			    .mapToObj(String::valueOf) // Stream<String>
			    .collect(Collectors.toCollection(ArrayList::new)); //ArrayList<String>
		
	}
}
