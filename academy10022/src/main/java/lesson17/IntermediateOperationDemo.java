package lesson17;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IntermediateOperationDemo {
	public static void main(String... args) {


		List<String> list = 
				Stream.generate(() -> new Random().nextInt(1000))
				.limit(1000)
				.skip(50)
				.filter(o -> o % 2 == 0 && o != 0)
				.sorted()
				.distinct()
				.map(o -> "Число " + o)
				.limit(200)
				.collect(Collectors.toList());

		System.out.println(list);
	}
}