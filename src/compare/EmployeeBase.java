package compare;

import java.util.*;
import java.util.stream.Stream;

public abstract class EmployeeBase {
	private String name;
	private int age;
	private String id;
	private String department;
	
	public EmployeeBase(String name, int age, String id, String department) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.department=department;
	}
	
	abstract void search(String id);

	//gettersetter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String Department) {
		this.department=department;
	}
	public String toString(){
		return "Name: "+ name+" ID: "+ id+" Age: "+ age +" Departement" + department;
	}
	
	//abstract void search();
	
	public static void main(String[] args) {
		
		List<EmployeeBase> list=new ArrayList<>();
		list.add(new Developer("Niranjana",23,"30020010","Software","Java","3"));
		list.add(new Developer("Aisvarya",21,"30028021","IT","Java,C","5"));
		list.add(new Developer("Mega",22,"30023133","Software","C,Java,Python","5"));
		
		
		list.add(new Tester("Kavya",22,"20012343","IT","Selenium", "4"));
		list.add(new Tester("Sakti",23,"23143233","Software","TestGrid","5"));
		list.add(new Tester("Alice",22,"22211324","IT","Lambda Test","5"));
		
		int total=list.size();
		System.out.println("Total Count: "+total);
		
		Stream<EmployeeBase> stream=list.stream();
		long countD=list.stream().filter(EmployeeBase->EmployeeBase instanceof Developer).count();
		System.out.println("Total Developers: "+countD);
		long countT=list.stream().filter(EmployeeBase->EmployeeBase instanceof Tester).count();
		System.out.println("Total Testers: "+countT);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the searchId: ");
		String searchId=sc.nextLine();
		System.out.println("Searching for Employee with ID: "+searchId);
		list.stream().filter(e -> e.getId().equals(searchId)).forEach(System.out::println);
		
		
		

	}

}

class Developer extends EmployeeBase{
	private String proLanguage;
	private String projectHandled;
	public Developer(String name,int age,String id,String department,String proLanguage,String projectHandled) {
		super(name, age, id, department);
		this.proLanguage=proLanguage;
		this.projectHandled=projectHandled;
	}
	//gettersetter
	private String getProLanguage() {
		return proLanguage;
	}
	private void setProLanguage(String proLanguage) {
		this.proLanguage=proLanguage;
	}
	private String getProjectHandled() {
		return projectHandled;
	}
	private void setProjectHandled() {
		this.projectHandled=projectHandled;
	}
	public String toString() {
		return "Name: "+getName()+" ID: "+getId()+" Age: "+getAge()+" Program Languages known: "+proLanguage+" Project Handled: "+projectHandled;
	}
	@Override
	void search(String id) {
		// TODO Auto-generated method stub
		if(this.getId().equals(id))
			System.out.println("Details: "+this);
	}
	
	
}
class Tester extends EmployeeBase{
	private String testtools;
	private String bugreport;
	
	public Tester(String name,int age,String id,String department,String testtools,String bugreport) {
		super(name, age, id, department);
		this.testtools=testtools;
		this.bugreport=bugreport;
	}
	//gettersetter
	public String getTesttools() {
		return testtools;
	}
	public void setTesttools(String Testtools) {
		this.testtools=testtools;
	}
	public String getBugreport() {
		return bugreport;
	}
	public void setBugreport(String bugreport) {
		this.bugreport=bugreport;
	}
	@Override
	void search(String id) {
		if(this.getId().equals(id))
			System.out.println("Details: "+this);
		
	}
	public String toString() {
		return "Name: "+getName()+" ID: "+getId()+" Age: "+getAge()+" Department: "+getDepartment()+" Test tools known: "+testtools+" Bug reported: "+bugreport;
	}
	
	
	
}



