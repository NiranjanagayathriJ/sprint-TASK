package hashTable;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

public class CollegeStudent {
	private String name;
	private int id;
	public CollegeStudent(String name,int id) {
		this.id=id;
		this.name=name;
	}
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	 public String toString() {
	        return "CollegeStudent [name=" + name + ", id=" + id + "]";
	    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HashOfColStu hs=new HashOfColStu();
		CollegeStudent cs1=new CollegeStudent("Niranjana",123);
		CollegeStudent cs2=new CollegeStudent("Gayathri",456);
		CollegeStudent cs3=new CollegeStudent("Kavya",333);
		
		StoredColStudent col1=new StoredColStudent("key 1",cs1);
		StoredColStudent col2=new StoredColStudent("key 2",cs2);
		StoredColStudent col3=new StoredColStudent("key 3",cs3);
		
		
		hs.put("key1", col1);
		hs.put("key2", col2);
		hs.put("key3",col3);
		
		System.out.println("Existing Content:");
		hs.print();
		
		System.out.println("Retrieve key:");
		String ret=sc.next();
		System.out.println("Retrieved:"+hs.get(ret));
		//LinkedList<StoredColStudent> retrieve=hs.get(ret);
		
		/*for(StoredColStudent cs:retrieve) {
			CollegeStudent a=cs.getCollegeStudent();
			System.out.println(a);
			//Stream<StoredColStudent>stream=list.stream();
		}*/
		

	}

}
