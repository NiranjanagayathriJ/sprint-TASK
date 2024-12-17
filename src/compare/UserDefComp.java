package compare;
import java.util.*;

public class UserDefComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Tenant2> ll= new LinkedList<>();
		UserDefComp u=new UserDefComp();
		ll.add(u.new Tenant2(3,"Niranjana",9000,"CG1"));
		ll.add(u.new Tenant2(6,"Kaviya",11000,"CG2"));
		ll.add(u.new Tenant2(5,"Alice",9500,"CG2"));
		ll.add(u.new Tenant2(2,"Sakthi",6000,"CG3"));
		Collections.sort(ll);
		
		Tenant2[] tent=new Tenant2[4];
		tent[0]=u.new Tenant2(3,"Niranjana",9000,"CG1");
		tent[1]=u.new Tenant2(6,"Kaviya",11000,"CG2");
		tent[2]=u.new Tenant2(5,"Alice",9500,"CG2");
		tent[3]=u.new Tenant2(2,"Sakthi",6000,"CG3");
		System.out.println("Arry sorted:");
		Arrays.sort(tent);
		System.out.println(Arrays.toString(tent));
		
	}

class Tenant2 implements Comparable<Tenant2>{
	private int members;
	private String name;
	private int rent;
	private String job;
	
	Tenant2(int members,String name,int rent,String job){
		this.members=members;
		this.name=name;
		this.rent=rent;
		this.job=job;
	}
	
	public String toString() {
		return "Name:"+name+" Job:"+job+" No. of members:"+members+" Rent:"+rent;
	}

	@Override
	public int compareTo(Tenant2 o) {
		// TODO Auto-generated method stub
		return this.members-o.members;
	}
	
	int getmembers() {
		return members;
	}
	int getrent() {
		return rent;
	}
	String getname() {
		return name;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tenant2)) return false;
        Tenant2 tenant2 = (Tenant2) o;
        return members == tenant2.members &&
                rent == tenant2.rent &&
                name.equals(tenant2.name) &&
                job.equals(tenant2.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, name, rent, job);
    }
}
}