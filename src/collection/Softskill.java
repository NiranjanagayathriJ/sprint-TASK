package collection;

import java.util.*;

public class Softskill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code: List Implementation
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		System.out.println("OUTPUTS FOR LIST:");
		System.out.println(list.isEmpty());
		System.out.println("List:"+list);
		
		// Code: Set Implementation
		Set<String> set = new TreeSet<>();
		set.add("Collections");
		set.add("Hash");
		set.add("Collections");
		set.add("Datatypes");
		System.out.println();
		System.out.println("OUTPUTS FOR SET:");
		System.out.println("Set:"+set);
		set.clear();
		System.out.println("Set after clear:"+set);
		
		//Code: Map Implementation
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		System.out.println();
		System.out.println("OUTPUTS FOR MAP:");
		System.out.println("Value for key 1: " + map.get(1));  // Output: Apple
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		
		//Code: Queue Implementation
		 Queue<String> queue = new LinkedList<>();
	     queue.add("Apple");
	     queue.add("Banana");
	     queue.add("Cherry");
	     System.out.println();
	     System.out.println("OUTPUTS FOR QUEUE:");
	     // Removing and printing elements from the queue
	     System.out.println("Removed: " + queue.poll()); 
	     System.out.println("Removed: " + queue.poll()); 
	     System.out.println("Remaining queue: " + queue);
	 }
}
