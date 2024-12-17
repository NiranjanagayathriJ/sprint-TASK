package functInterface;

import java.util.LinkedList;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

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
	public double getRent() {
		return rent;
	}
	public String getName() {
		return name;
	}
}
public class OptionalCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Tenant> ll= new LinkedList<>();
		
		ll.add(new Tenant(3,"Niranjana",9000,"CG1"));
		ll.add(new Tenant(6,"Kaviya",11000,"CG2"));
		ll.add(new Tenant(5,"Alice",9500,"CG2"));
		ll.add(new Tenant(2,"Sakthi",6000,"CG3"));
		
		DoubleSupplier ds=()->ll.get(2).getRent();
		System.out.println("Rent:"+ds.getAsDouble());
		
		DoubleToIntFunction dif=rent->(int)rent;
		int f1=dif.applyAsInt(ll.get(1).getRent());
		System.out.println("Rent (as int):"+f1);
		
		DoubleToLongFunction dlf=rent->(long)rent;
		long f2=dlf.applyAsLong(f1);
		System.out.println("Rent (as long):"+f2);
	}

}
