package list;

import java.util.LinkedList;
import java.util.List;

public class ExampleAL {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<Integer>();
		
		//Adding 
		numbers.add(10);
		numbers.add(500);
		numbers.add(87);
		numbers.add(-51);
		numbers.add(200);
		numbers.add(41);
		numbers.add(75);
		numbers.add(12);
		numbers.add(2);
		
		//Retrieving - get the nth element
		System.out.println(numbers.get(2));
		
		System.out.println("\nIteration #1: ");
		// Iterating using traditional for loop
		for(int i=0;i< numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		
		// Iterating using advanced for loop
		System.out.println("\nIteration #2: ");
		for(Integer value:numbers){
			System.out.println(value);
		}
		
		//Removing items()
		numbers.remove(0);
		System.out.println();
		
		System.out.println("\nIteration #3: ");
		for(Integer value:numbers){
			System.out.println(value);
		}
		
		// using java8 for each
		numbers.forEach(no ->{
			System.out.println(no);
		});
	}

}
