package collection;
import java.util.ArrayList;
import java.util.List;
public class S1 {

	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Element at index 1: " + list.get(1));  
	        list.set(1, "Blueberry");
	        System.out.println("Updated element at index 1: " + list.get(1));
	        list.add(1, "Orange");
	        System.out.println("List after adding Orange at index 1: " + list);
	        list.remove(2);  
	        System.out.println("List after removing element at index 2: " + list);
	        System.out.println("Index of 'Orange': " + list.indexOf("Orange")); 
	        System.out.println("Last index of 'Cherry': " + list.lastIndexOf("Cherry")); 
	        List<String> subList = list.subList(0, 2);
	        System.out.println("Sublist: " + subList);
	    }

}
