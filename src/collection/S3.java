package collection;
import java.util.*;
public class S3 {
	    public static void main(String[] args) {
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");
	        map.put(4, "Four");
	        System.out.println("Value for key 2: " + map.get(2));
	        map.remove(3);
	        System.out.println("Map after removing key 3: " + map); 
	        System.out.println("Contains key 1: " + map.containsKey(1)); 
	        System.out.println("Contains key 5: " + map.containsKey(5)); 
	        System.out.println("Contains value 'Four': " + map.containsValue("Four"));  
	        System.out.println("Contains value 'Five': " + map.containsValue("Five"));
	        Set<Integer> keys = map.keySet();
	        System.out.println("Keys: " + keys);
	        System.out.println("Values: " + map.values()); 
	        System.out.println("Entries: " + map.entrySet());
	        System.out.println("Size of the map: " + map.size()); 
	        System.out.println("Is the map empty? " + map.isEmpty()); 
	    }
}
