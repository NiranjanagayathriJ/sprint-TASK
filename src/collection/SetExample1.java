package collection;

import java.util.*;

public class SetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1=new HashSet<>();
		s1.add("abc");
		s1.add("hi");
		System.out.println(s1);
		
		Set<College> col=new HashSet<>();
		College c1=new College(123,"KCT");
		College c2=new College(879,"KG");
		College c3=new College(234,"Sankara");
		College c4=new College(123,"KCT");
		College c5=new College(333,"KCT");
		col.add(c1);
		col.add(c3);
		col.add(c4);
		col.remove(c2);
		System.out.println(col);
	}

}
class College{
	private int num;
	private String Name;
	
	College(int num,String Name){
		this.Name=Name;
		this.num=num;
	}
	public String toString() {
		return "Number:"+num+" Name:"+Name;
	}
	public boolean equals(Object obj) {
		College c=(College)obj;
		if((this.Name.equals(Name))&&(this.num==c.num)) 
			return true;
			else
				return false;
	}
	public int hashCode() {
		return num+Name.hashCode();
		}
}
