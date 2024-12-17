package compare;
import java.util.*;
public class TenantR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Tenant> ll= new LinkedList<>();
		
		ll.add(new Tenant(3,"Niranjana",9000,"CG1"));
		ll.add(new Tenant(6,"Kaviya",11000,"CG2"));
		ll.add(new Tenant(5,"Alice",9500,"CG2"));
		ll.add(new Tenant(2,"Sakthi",6000,"CG3"));
		
			
		Collections.sort(ll, Tenant.memberscomp);
		System.out.println("Sorting based on Members:");
		ListIterator lt= ll.listIterator();
		while(lt.hasNext())
		{
			System.out.print(lt.next());
		}
		System.out.println("Sorting based on Rent:");
		Collections.sort(ll, Tenant.rentcomp);
		System.out.println(ll);
		
		System.out.println("Sorting based on Name:");
		Collections.sort(ll, Tenant.t);
		System.out.println(ll);
		
		System.out.println("Sorting based on Job:");
		Collections.sort(ll, Tenant.j);
		System.out.println(ll);
	}

}

class Tenant{
	private int members;
	private String name;
	private int rent;
	private String job;
	
	Tenant(int members,String name,int rent,String job){
		this.members=members;
		this.name=name;
		this.rent=rent;
		this.job=job;
	}
	public String toString() {
		return "Name:"+name+" Job:"+job+" No. of members:"+members+" Rent:"+rent;
	}
	public static Comparator<Tenant>memberscomp=new Comparator<Tenant>() {
		public int compare(Tenant t1,Tenant t2) {
			return t1.members-t2.members;
		}
	};
	public static Comparator<Tenant>rentcomp=new Comparator<Tenant>() {
		public int compare(Tenant t1,Tenant t2) {
			return t1.rent-t2.rent;
		}
};
public static Comparator<Tenant> t=new Comparator<Tenant>() {
	public int compare(Tenant t1,Tenant t2) {
		return t1.name.compareTo(t2.name);
	}
};
public static Comparator<Tenant> j=new Comparator<Tenant>() {
	public int compare(Tenant t1,Tenant t2) {
		return t1.job.compareTo(t2.job);
	}
};
}