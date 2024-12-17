package collection;

import java.util.*;

public class UserDefColl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Customer> ll= new LinkedList<>();
		
		ll.add(new Customer(1,"Kaviya",22,1000));
		ll.add(new Customer(6,"Dhiwagar",23,2000));
		ll.add(new Customer(5,"Sameena",21,3000));
		ll.add(new Customer(2,"Sakthi",24,4000));
		
			
		//Collections.sort
		
		ListIterator lt= ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
	}

}

class Customer implements Comparable<Customer>
{
	private int id;
	private String name;
	private int age;
	private int points;
 
	Customer(int id,String name,int age,int points)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.points=points;
	}
	//print Object
	public String toString()
	{
		return "Id:"+id+"Name:"+name+"Age:"+age+"Points:"+points;
	}
	
	public int compareTo(Customer o) {
		
		return this.name.codePointAt(0)-o.name.codePointAt(0);
	}
}