package sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SortExample {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("dog");
		animals.add("elephant");
		animals.add("giraffe");
		animals.add("bat");
		animals.add("catt");
		animals.add("foxxxxxxxxxxx");
		
		Collections.sort(animals, new StringComparator());
		for(String animal:animals){
			System.out.println(animal);
		}
		
		List<Integer> numbers1 = new ArrayList<Integer>();
		
		numbers1.add(25);
		numbers1.add(125);
		numbers1.add(225);
		numbers1.add(5);
		numbers1.add(14);
		numbers1.add(2);
		
		Collections.sort(numbers1,new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				
				return -num1.compareTo(num2);
			}
			
		});
		for(Integer number:numbers1){
			System.out.println(number);
		}
		
/*		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(25);
		numbers.add(125);
		numbers.add(225);
		numbers.add(5);
		numbers.add(14);
		numbers.add(2);
		
		Collections.sort(numbers);
		for(Integer number:numbers){
			System.out.println(number);
		}
		
List<String> animals1 = new ArrayList<String>();
		
		animals1.add("dog");
		animals1.add("elephant");
		animals1.add("giraffe");
		animals1.add("bat");
		animals1.add("cat");
		animals1.add("fox");
		
		Collections.sort(animals1);
		for(String animal:animals1){
			System.out.println(animal);
		}
 */
	}
}
