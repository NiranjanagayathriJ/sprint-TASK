package AbstractTasks;

public class stringbufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Niranjana";
		String b=new String("gayathri");
		String c="J";
		System.out.println(a==b);
		System.out.println(a.concat(c));
		System.out.println(a.length());
		System.out.println(a.isBlank());
		
		StringBuffer s1=new StringBuffer("Apple Apple");
		System.out.println(s1.capacity());//Default Constructor:
						//If you create a StringBuffer without any arguments (using the default constructor), the initial capacity is typically 16.
		System.out.println(s1.substring(4, 9));
		System.out.println(s1.replace(4, 6, c));
		System.out.println(s1.subSequence(0, 2));//start: The starting index (inclusive) from where to begin the extraction.
						//end: The ending index (exclusive) at which to stop the extraction.
		System.out.println(s1.reverse());
		
		StringBuilder s2=new StringBuilder("abc");
		System.out.println(s2.isEmpty());
		System.out.println(s2.insert(2, b));
		System.out.println(s2.append(4));
	}

}
