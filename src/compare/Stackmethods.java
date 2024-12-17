package compare;

import java.util.Stack;

public class Stackmethods {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		st.push("abcd");
		st.push(1234.65f);
		st.push(324765L);
		
		System.out.println(st.firstElement());
		System.out.println(st.contains("abcd"));
		System.out.println(st.peek());
		System.out.println(st.capacity());
		System.out.println(st.clone());

	}

}
