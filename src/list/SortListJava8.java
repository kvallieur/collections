package list;

import java.util.LinkedList;
import java.util.List;

public class SortListJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();

		// Adding
		numbers.add(10);
		numbers.add(500);
		numbers.add(87);

		// Retrieving
		System.out.println(numbers.get(2));

		// Iterating in java 8 with lambda
		numbers.forEach(number -> System.out.println(number));
	}

}
