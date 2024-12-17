package functInterface;

import java.util.*;
import java.util.function.BiConsumer;

public class TestFI {

	public static void main(String[] args) {
		        Set<Student1> set = new HashSet<>();
		        set.add(new Student1("Alice", 21, 232345345L));
		        set.add(new Student1("Niranjana", 23, 43545345L));
		        set.add(new Student1("Kavya", 22, 2323543325L));
		        Admission1 ad=new Admission1(null,0,0);
		        BiConsumer<Set<Student1>,Integer> bc=Admission1::display;
		        bc.accept(set, 1);
		        bc.accept(set, 2);
		        bc.accept(set, 0);
		    }
	}

class Student1 {
	  String name;
	  int age;
	  long phone;

	 Student1(String name, int age, long phone) {
	 this.name = name;
	 this.age = age;
	 this.phone = phone;
		    }
		}


class Admission1 extends Student1{
	Admission1(String name, int age, long phone) {
		super(name, age, phone);
		}
	static void display(Set<Student1> set,Integer id) {
		List<Student1> studentList = new ArrayList<>(set);
		 Student1 student = studentList.get(id);
		System.out.println("Name:"+student.name+" Age:"+student.age+" phone:"+student.phone);
	}

	
}
/*@FunctionalInterface
interface Admission {
	void details();

}*/


