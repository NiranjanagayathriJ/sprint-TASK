package collection;
import java.util.LinkedList;
import java.util.Queue;
public class S4 {
	    public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();
	        queue.offer("A");  
	        queue.offer("B");
	        queue.offer("C");
	        queue.add("D"); 
	        System.out.println("Queue: " + queue);
	        System.out.println("Peek (front element): " + queue.peek());
	        System.out.println("Poll (removed element): " + queue.poll()); 
	        System.out.println("Queue after poll: " + queue);  
	        System.out.println("Remove (removed element): " + queue.remove()); 
	        System.out.println("Queue after remove: " + queue);
	        System.out.println("Is the Queue empty? " + queue.isEmpty()); 
	        System.out.println("Size of the Queue: " + queue.size()); 
	    }
}
