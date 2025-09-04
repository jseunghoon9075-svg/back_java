package streamTest.filterTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterTest {
	public static void main(String[] args) {
			IntStream.rangeClosed(1, 10).filter((d) -> d % 2 == 0).forEach(System.out::print);
			List<Integer> list = IntStream.rangeClosed(1, 10).filter((d) -> d % 2 == 0).boxed()
					.collect(Collectors.toList());
	}
}
