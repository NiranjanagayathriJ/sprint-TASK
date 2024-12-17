package linearProbing;

import java.util.Scanner;


class HashOfColStu {
	
	private StoredColStudent[] arr;
	
	public HashOfColStu(int capacity) {
		arr=new StoredColStudent[capacity];
	}
	public StoredColStudent[] getarr() {
		return arr;
	}

	private int hash_func(String key) {
		return key.hashCode()%arr.length;
	}

	void put(String key,StoredColStudent cs) {
		int h=hash_func(key);
		int originalindex=h;
		//linear probing
		while(arr[h]!=null) {
			if(arr[h].getkey().equals(key)) {
			arr[h]=cs;
			return;
			}
		h=(h+1)%arr.length;// wrap around if reached end
	}
	arr[h]=cs; //Inserting in empty slot
}
	//Without linear probing
	/*public  StoredColStudent get(String key) {
		int hashkey=hash_func(key);
		return arr[hashkey];
			}*/
			
	//with linear probing
	public StoredColStudent get(String key) {
		int h=hash_func(key);
		int originalindex=h;
	 while(arr[h]!=null) {
		 if(arr[h].getkey().equals(key)) {
			 return arr[h]; //return if key found
		 }
		 h=(h+1)%arr.length;
	 if(h==originalindex)
		 break;
	}
	 return null; //key not found
	}
	 
	public void print()
	{
		for(StoredColStudent s:arr)
		{
			if(s!=null)
			System.out.println(s);
		}
	}
}

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
		HashOfColStu hs=new HashOfColStu(10);
		CollegeStudent cs1=new CollegeStudent("Niranjana",123);
		CollegeStudent cs2=new CollegeStudent("Gayathri",456);
		CollegeStudent cs3=new CollegeStudent("Kavya",333);
		CollegeStudent cs4=new CollegeStudent("Sakti",666);
		
		StoredColStudent col1=new StoredColStudent("key 1",cs1);
		StoredColStudent col2=new StoredColStudent("key 2",cs2);
		StoredColStudent col3=new StoredColStudent("key 3",cs3);
		StoredColStudent col4=new StoredColStudent("key 4",cs4);
		
		
		
		hs.put("key 1", col1);
		hs.put("key 2", col2);
		hs.put("key 3",col3);
		hs.put("key 4", col4);
		
		System.out.println("Existing Content:");
		hs.print();
		
		System.out.println("Retrieve key:");
		String ret=sc.next();
		StoredColStudent retrieved=hs.get(ret);
		if(retrieved!=null) {
			System.out.println("Retrieved: "+retrieved);
		}else {
			System.out.println("key not found");
		}
		
	}

}
class StoredColStudent {
	private String key;
	private CollegeStudent obj;
	
	public StoredColStudent(String key, CollegeStudent obj) {
		this.key=key;
		this.obj=obj;
	}
	//getter
	public String getkey() {
		return key;
	}
	public CollegeStudent getCollegeStudent() {
		return obj;
	}
	public String toString() {
		return "StoredColStudent [key="+key+" obj="+(obj!=null?obj.getName():"null")+"]";
	}
}
