package ppt;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+new StringBuilder("Java SE 8"));
				//toString() method of StringBuilder invoked
		System.out.println("Hello "+new MyString("Java SE 8"));
				//Object doesn't override the toString() method. 
				//Default toString() method from object is called.
	}

}
class MyString{
	String msg;
	MyString(String msg){
		this.msg=msg;
	}
}
