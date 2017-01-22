package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {

	public static void main(String[] args) {
	 
	Set<String> set1 = new HashSet<String>();
    // Commonly used no duplicates insertion order not preserved
	Set<String> set2 = new LinkedHashSet<String>();
	// no duplicates + insertion order preserved
	Set<String> set3 = new TreeSet<String>();
	// no duplicates + natural sorting order
	 
		set1.add("Apple");
		set1.add("Banana");
		set1.add("pineapple");
		set1.add("mango");
		set1.add("strawberry");
		
		System.out.println(set1+"set1");
		for(String element:set1){
			System.out.println(element+" : Set1");
		}
		
		set2.add("mango");
		set2.add("strawberry");
		set2.add("Apple");
		set2.add("pineapple");
		set2.add("Banana");
		
		System.out.println(set2+"set2");
		for(String element:set2){
			System.out.println(element+" : Set2");
		}
		
		set3.add("mango");
		set3.add("Banana");
		set3.add("strawberry");
		set3.add("Apple");
		set3.add("pineapple");
		System.out.println(set3+" set3");
		for(String element:set3){
			System.out.println(element+" : Set3");
		}
		
	 
	Fruit fruit = new Fruit("Mango","green");
	Fruit fruit1 = new Fruit("Mango","green");
	Fruit fruit2 = new Fruit("Mango","green");
	Fruit fruit3 = new Fruit("Mango","green");
	
	if(fruit.equals(fruit1)){
		System.out.println("tutut");
	}
	
	}
}
