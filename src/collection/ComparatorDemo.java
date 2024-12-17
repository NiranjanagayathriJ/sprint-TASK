package collection;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Tenant> lt=new LinkedList<>();
		lt.add(new Tenant(2,"Niranjana",7500));
		lt.add(new Tenant(3,"Subashini",6500));
		lt.add(new Tenant(1,"Aisvarya",9500));
		lt.add(new Tenant(1,"Kaviya",10000));
		lt.add(new Tenant(3,"Krithika",3500));
		
		ListIterator It=lt.listIterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
	}

}

class Tenant implements Comparable<Tenant>{
	private int members;
	private String Name;
	private int rent;
	
	Tenant(int members,String Name,int rent){
		this.members=members;
		this.Name=Name;
		this.rent=rent;
	}
	public String toString() {
		return "Tenant Name:"+Name+"  No. Of Members:"+members+"  Rent Amount:"+rent;
	}
}


