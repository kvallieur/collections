package list;

import java.util.LinkedList;
import java.util.List;

public class SortListJava8 {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<>();

		// Adding elements to List
		numbers.add(10);
		numbers.add(500);
		numbers.add(14);
		numbers.add(31);
		numbers.add(17);
		numbers.add(23);
		numbers.add(41);
		numbers.add(114);
		numbers.add(211);
		numbers.add(30);
		numbers.add(2);
		numbers.add(4);

		// Retrieving - get the nth element in List
		System.out.println(numbers.get(2) + " 2nd element is");

		// Iterating in java 8 with lambda
		numbers.forEach(number -> System.out.println(number));
	}

}
