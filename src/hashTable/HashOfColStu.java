package hashTable;

import java.util.*;
import java.util.stream.Stream;

public class HashOfColStu {
	
	private LinkedList<StoredColStudent>list;
	
	public HashOfColStu() {
		this.list=new LinkedList<>();
	}
	public LinkedList<StoredColStudent> getList() {
		return list;
	}
	public void setList(LinkedList<StoredColStudent>list) {
		this.list=list;
	}

	int hash_func(String key) {
		return key.hashCode();
	}

	void put(String key,StoredColStudent cs) {
		int h=hash_func(key);
		if(h==0)
			System.out.println("It is NOT empty");
		else
		list.add(cs);
	}
	public  void get(String key) {
		int hashkey=hash_func(key);
		
		//public LinkedList<StoredColStudent> retrieve(String key){
		//	LinkedList<StoredColStudent> result=new LinkedList<>();
			for(StoredColStudent cs:list) {
				if(cs.getkey().equals(key)) {
					System.out.println(cs.getCollegeStudent());
					//result.add(cs);
				}
			}
			}
//	}
	public void print()
	{
		for(StoredColStudent s:list)
		{
			System.out.println(s);
		}
	}
}

	

		//CollegeStudent col=cs.getCollegeStudent();
		//System.out.println(col);
		//Stream<StoredColStudent>stream=list.stream();






