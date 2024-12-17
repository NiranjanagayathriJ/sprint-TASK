package AbstractTasks;

public class wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		int l=i;
		l++;
		Integer a=new Integer(12);
		Integer b=new Integer("13");
		Byte b1=a.byteValue();
		Short s=b.shortValue();
		Double d=b.doubleValue();
		long lo=b.longValue();
		float f=new Float(12.43);
		Short sh=new Short((short) 1);
		float f1=a.floatValue();
		double d1=new Double(1234);
		
		String st=new String("Apple");
		String ss=st.concat(st);
		boolean o=new Boolean(true);

		System.out.println(a);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(s);
		System.out.println(d);
		System.out.println(lo);
		System.out.println(f);
		System.out.println(sh);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(st);
		System.out.println(ss);
		System.out.println(o);
		
	}

}
