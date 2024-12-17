package compare;

import java.util.Vector;

public class Vectormethods {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(0, 1234876D);
		v.add(1, "niranjana");
		System.out.println(v.elementAt(0));
		System.out.println(v.toString());
		System.out.println(v.elements());
		System.out.println(v.get(1));

	}

}
