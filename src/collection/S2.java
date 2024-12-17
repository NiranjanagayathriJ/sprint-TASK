package collection;
import java.util.HashSet;
import java.util.Set;
public class S2 {
	    public static void main(String[] args) {
	        Set<Integer> numbers = new HashSet<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        System.out.println("Does the set contain 20? " + numbers.contains(20)); 
	        System.out.println("Does the set contain 50? " + numbers.contains(50));  
	        System.out.println("Is the Set empty? " + numbers.isEmpty());  
	        System.out.println("Size of the Set: " + numbers.size());  
	        numbers.remove(20);  
	        System.out.println("Set after removing 20: " + numbers); 
	        numbers.clear();
	        System.out.println("Set after clear: " + numbers); 
	        System.out.println("Is the Set empty now? " + numbers.isEmpty());
	    }
}
