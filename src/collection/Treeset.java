package collection;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> tree=new TreeSet<>();
		tree.add(123);
		tree.add(22);
		tree.add(44);
		tree.add(65);
		tree.add(22);
		System.out.println(tree);
		
		Set<Integer> tree1=new TreeSet<>();
		tree1.add(3);
		tree1.add(2);
		tree1.add(4);
		tree1.add(5);
		//int c[]=new int[tree1.size()];
		//tree1.toArray();
		tree1.addAll(tree);
		System.out.println(tree1.containsAll(tree));
		System.out.println(tree1.retainAll(tree));
		System.out.println(tree1);
		
		Set hs=new HashSet();
		hs.add(tree1);
		hs.add(tree);
		hs.clear();
		System.out.println(hs.getClass());
		System.out.println(hs);
		//int b[]=new int[hs.size()];
		//hs.toArray();
		Set<String> lh=new LinkedHashSet<>();
		lh.add("Apple");
		lh.add("Orange");
		lh.add("Pineapple");
		lh.add("Orange");
		System.out.println(lh);
		String a[]=new String[lh.size()];
		lh.toArray(a);
		for(String i:a) {
			System.out.println(i);
		}
	}

}
