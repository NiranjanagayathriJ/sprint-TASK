package day2;

public class message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Msg m=new Msg();
		m.setName("Niranjana");
		m.setCategory("Gold");
		System.out.println("Hello!"+m.getName()+" Membership:"+m.getCategory());
		m.display();
	}

}

class Msg{
	private String Name;
	private String Category;
	
	void display() {
		System.out.println("Name:"+Name+"Category:"+Category);
	}
	void setName(String Name) {
		this.Name=Name;
	}
	void setCategory(String Category) {
		this.Category=Category;
	}
	String getName() {
		return Name;
	}
	String getCategory() {
		return Category;
	}
}

	
