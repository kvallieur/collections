package list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Example1LL {
/*
 *  when to use arraylist and Linked List
 * If you want to add/remove items from the end of the list use ArrayList
 * If you want to add/remove items from middle/anywhere use LinkedList 
 * 
 *  
 *  AL is best suitable for retrieval of records and worst for insertion or deletion
 *  LL is best suitable for insertion or deletion in the middle and worst for retrieval
 */
	
	public static void main(String[] args) {

		/**
		 * ArrayLists manage Arrays internally
		 * data looks like this [0][1][2][3][4][5][6]...............
		 * when we insert in to it creates another array and dumps all the elemnts
		 * if we are inserting at the end it is very faster, if we are inserting at the 
		 * beginning it is significantly slower than Linked lists and only when we deal with huge 
		 * no of elements in list we can notice the significance
		 */
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		/**
		 * LinkedLists consists of elements where each element has a reference to the 
		 * previous and next element
		 * [0]->[1]->[2]->[3]
		 *    <-   <-   <-
		 * when we insert in to linked lists at the beginning or middle it just 
		 * includes the references to the previous and next so it is faster   
		 */
		LinkedList<Integer> llList = new LinkedList<Integer>();
	
		arList.add(5);
		llList.add(6);
		doTimings("ArrayList ",arList);
		doTimings("LinkedList ",llList);
	}

	private static void doTimings(String type, List<Integer> list){
		
		System.out.println(type+""+list.get(0));
	}
}
