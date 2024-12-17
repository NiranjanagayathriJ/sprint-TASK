package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Object>col= new LinkedList<>();
		String s="Good";
		col.add("$#");
		col.clear();
		col.add(44567);
		System.out.println("Size:"+col.size());
		System.out.println(col.removeAll(col));
		System.out.println("Collection:"+col.toString());
		System.out.println(col.equals(s));
		
		List<Integer> ab= new ArrayList<>();
		
		ab.add(12);
		ab.add(13);
		ab.remove(Integer.valueOf(12));
		ab.add(24);
		ab.add(11);
		ab.add(33);
		ab.add(100);
		ab.add(99);
		ab.add(45);
		System.out.println("List:"+ab);
		
		System.out.println("IndexOf:"+ab.indexOf(100));
		
		System.out.println("get:"+ab.get(5));
		
		System.out.println("hash code:"+ab.hashCode());
		
		System.out.println("List:"+ab.subList(2, 4));
		
		
		Iterator it=ab.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		List<Integer> nl= new ArrayList<>();
		nl.add(1);
		nl.add(2);
		nl.add(3);
		
		ab.addAll(nl);
		
		System.out.println("List:"+ab);
	}

}
