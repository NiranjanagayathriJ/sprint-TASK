package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
				/*Collection c= new ArrayList();
				c.add("ABC");
				c.add(34.67);
				c.add(23);
				System.out.println("before remove:"+c);
				c.remove(34.67);
				System.out.println("contains:"+c.contains("ABC"));
				System.out.println("after remove:"+c);*/
				
				List<Integer> l= new ArrayList<>();
				
				l.add(12);
				l.add(32);
				l.add(24);
				l.add(11);
				
				System.out.println("Lis:"+l);
				
				System.out.println("IndexOf:"+l.indexOf(11));
				
				System.out.println("get:"+l.get(2));
				
				System.out.println("size:"+l.size());
				
				l.set(1, 44);
				
				System.out.println("Lis:"+l);
				
				
				Iterator it=l.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				List<Integer> nl= new LinkedList<>();
				nl.add(1);
				nl.add(2);
				nl.add(3);
				
				l.addAll(nl);
				
				System.out.println("Lis:"+l);
				
	}

}
