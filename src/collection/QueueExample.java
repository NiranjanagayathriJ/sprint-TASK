package collection;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>();
		q.add(66);
		q.add(21);
		q.add(112);
		q.add(3);
		System.out.println(q);
		q.peek();
		q.poll();
		q.remove(21);
		//q.removeIf(n->{n=21;});
		System.out.println(q);
		
		Deque<Integer> d=new LinkedList<>();
		d.addAll(q);
		d.add(21);
		System.out.println(d);
		
		Deque<String> ds=new ArrayDeque<>();
		ds.add("Apple");
		ds.add("Orange");
		ds.add("Mango");
		ds.add("apple");
		ds.add("MANGO");
		System.out.println(ds);
		ds.addFirst("Strawberry");
		ds.addLast("Grapes");
		System.out.println(ds.descendingIterator());
		System.out.println(ds);
		
	}

}
