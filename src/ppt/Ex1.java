package ppt;

public class Ex1 {

	public static void main(String[] args) {
		args=new String[] {"1","null"};
		boolean a=new Boolean(Boolean.valueOf(args[0]));
		boolean b=new Boolean(args[1]);
		System.out.println(a+" "+b);
	}

}
			// Both 1 and null is not recognized by boolean. So, false.