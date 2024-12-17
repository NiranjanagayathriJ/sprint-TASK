package compare;

import java.util.Arrays;

public class Comparable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tenant2[] tent=new Tenant2[4];
		tent[0]=new Tenant2(3,"Niranjana",9000,"CG1");
		tent[1]=new Tenant2(6,"Kaviya",11000,"CG2");
		tent[2]=new Tenant2(5,"Alice",9500,"CG2");
		tent[3]=new Tenant2(2,"Sakthi",6000,"CG3");
		
		Arrays.sort(tent,Tenant.memberscomp);
		
		System.out.println("Sorting based on members:"+Arrays.toString(tent));
		Arrays.sort(tent,Tenant.rentcomp);
		System.out.println("Sorting based on Rent:"+Arrays.toString(tent));
	}

}
