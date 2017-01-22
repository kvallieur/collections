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
		
		//Retrieving 
		System.out.println(numbers.get(2));
		
		System.out.println("\nIteration #1: ");
		// Indexed for loop iteration
		for(int i=0;i< numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		
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
	}

}
