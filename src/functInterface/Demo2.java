package functInterface;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=(s1)->{System.out.println("Marks:"+s1);};
		stu.marks(78.96f);
	}
	public void marks(Float m) {
		System.out.println("Marks obtained:"+m);
	}


}
@FunctionalInterface
interface Student{
	void marks(Float m);
}

@FunctionalInterface
interface Standard extends Student{
	default void stand() {
		System.out.println("8th Standard");	
	}
}
