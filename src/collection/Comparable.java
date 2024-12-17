package collection;

import java.util.Arrays;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tenant[] tent=new Tenant[5];
		tent[0]=new Tenant(2,"Niranjana",7500);
		tent[1]=new Tenant(3,"Subashini",6500);
		tent[2]=new Tenant(1,"Aisvarya",9500);
		tent[3]=new Tenant(1,"Kaviya",10000);
		tent[4]=new Tenant(3,"Krithika",3500);
		
		Arrays.sort(tent);
		
		System.out.println("Sorted:"+ Arrays.toString(tent));
	}

}
