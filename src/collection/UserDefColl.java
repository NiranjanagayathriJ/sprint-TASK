package collection;

import java.util.*;

public class UserDefColl 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Tenant1>lt=new LinkedList<>();
		lt.add(new Tenant1(2,"Niranjana",7500));
		lt.add(new Tenant1(3,"Subashini",6500));
		lt.add(new Tenant1(1,"Aisvarya",9500));
		lt.add(new Tenant1(1,"Kaviya",10000));
		lt.add(new Tenant1(2,"Niranjana",7500));
		Collections.sort(lt);
		
		System.out.println("Sorted:"+ lt);
		ListIterator It=lt.listIterator();
//		while(It.hasNext()) {
//			System.out.println(It.next());
//		}
//		
		}

}

class Tenant1 implements Comparable<Tenant1>
{
	private int members;
	private String Name;
	private int rent;
	
	Tenant1(int members,String Name,int rent)
	{
		this.members=members;
		this.Name=Name;
		this.rent=rent;
	}
	
	public String toString() 
	{
		return "Tenant Name:"+Name+"  No. of Members:"+members+"  Rent Amount:"+rent;
	}
	public int compareTo(Tenant1 o) 
	{
		return this.rent-o.rent;
	}
	

}
