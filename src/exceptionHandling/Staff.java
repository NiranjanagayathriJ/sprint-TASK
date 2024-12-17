package exceptionHandling;

import java.util.*;

public abstract class Staff {
	
	protected String name;
	protected int age;
	protected String id;
	protected String dept;
	
	public Staff(String name,int age,String id,String dept) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.dept=dept;
	}
	//getter and setter
	public String name() {
		return name;
	}
	void setName() {
		this.name=name;
	}
	public int age() {
		return age;
	}
	void setAge() {
		this.age=age;
	}
	public String id() {
		return id;
	}
	void setId() {
		this.id=id;
	}
	public String dept() {
		return dept;
	}
	void setDept() {
		this.dept=dept;
	}

	public abstract void search();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Staff> list=new LinkedList<>();
		list.add(new Nurse("Abc",31,"1","neuro",8,250));
		list.add(new Doctor("Dr.xyz",31,"1","neuro","neurology",500));
		list.add(new Nurse("Def",29,"2","ortho",6,200));
		list.add(new Nurse("Ghi",25,"4","ortho",6,200));
		list.add(new Nurse("Jkl",29,"3","ENT",10,200));
		list.add(new Nurse("Mno",33,"6","ENT",6,200));
		list.add(new Doctor("Dr.tuv",54,"25","Emergengy","neurology",1000));
		list.add(new Doctor("Dr.pqr",45,"33","ENT","ENT",600));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nSearching for an ID:");
		int n=sc.nextInt();
		for(Staff s:list) {
			s.search();
		}
		Doctor doc=new Doctor("Dr.pqr",45,"33","ENT","ENT",600);
		doc.search();
		doc.Dcount(list);
		nurse.Ncount(list);
		
		/*for(Staff s:list) {
			s.search();
		}*/
		
	}
	

}


//Doctor
class Doctor extends Staff{
	private String Specialization;
	private int fee;
	int dcount=0;
	public Doctor(String name, int age, String id, String dept,String Specialization,int fee) {
		super(name, age, id, dept);
		this.Specialization=Specialization;
		this.fee=fee;
	}
	@Override
	public void search() {
		if(id.equals(id))
			System.out.println("Name:"+name+" Age:"+age+" ID:"+id+" Department:"+dept+" Specialization:"+Specialization+" Consultation Fee:"+fee);
		
	}
	
	public void Dcount(List<Staff> list) {
		for(Staff s:list) {
			if(s instanceof Doctor)
				dcount++;
		}
		System.out.println("No. Of Doctors="+dcount);
	}
	
}


//Nurse
class Nurse extends Staff{
	private int shift;
	private int hrwage;
	int ncount=0;
	public Nurse(String name, int age, String id, String dept, int shift, int hrwage) {
		super(name, age, id, dept);
		this.shift=shift;
		this.hrwage=hrwage;
	}
	@Override
	public void search() {
		if(id.equals(id))
			System.out.println("Name:"+name+" Age:"+age+" ID:"+id+" Department:"+dept+" Shift timings:"+shift+" Hourly Wage:"+hrwage);
		
	}
	
	public void Ncount(List<Staff> list) {
		for(Staff s:list) {
			if(s instanceof Nurse)
				ncount++;
		}
			System.out.println("No. Of Nurses="+ncount);
	}
	
	
	
}

