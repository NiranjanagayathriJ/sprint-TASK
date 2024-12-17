package collection;
import java.util.*;
public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l=new LinkedList<>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
			l.add(r.nextInt(100));
		}
		System.out.println("Before Natural Sort:"+l);
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Natural Sort:"+l);
		
		l.sort((b,a)->{return (b-a);});
		System.out.println("reverse sort:"+l);
		
		l.sort((b,a)->{return (a-b);});
		System.out.println("reverse sort:"+l);
		
		l.sort((a,b)->{return (b-a);});
		System.out.println("reverse sort:"+l);
		
		l.sort((a,b)->{return (a-b);});
		System.out.println("reverse sort:"+l);
		
		l.sort((b,a)->{return (0);});
		System.out.println("reverse sort:"+l);
		
		l.sort((a,b)->{return (0);});
		System.out.println("reverse sort:"+l);
		
		l.add(3, 999);
		System.out.println("List:"+l);
		
		
		List<String> ls=new LinkedList<>();
		ls.add("apple");
		ls.add("Apple");
		ls.add("mango");
		ls.add("Mango");
		ls.add("APPLE");
		ls.add("grapes");
		ls.add("kiwi");
		String[] s1=new String[ls.size()];
		ls.toArray(s1);
		for(String i:s1) {
			System.out.println(i);
		}
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
		
		ls.listIterator();
		System.out.println(ls);
		List<Float>f=new LinkedList<>();
		f.add(12.43f);
		f.add(33.45f);
		f.add(554.324f);
		System.out.println(f);
		
		Float []la=new Float[f.size()];
		f.toArray(la);
		for(float i:la) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(la));
		
		List<Float>n=Arrays.asList(la);
		System.out.println(n);
	}

}
