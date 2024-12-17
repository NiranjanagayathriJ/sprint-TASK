package functInterface;

import java.util.*;
import java.util.function.BiConsumer;

public class DemoFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> l=new HashMap<>();
		l.put("Alice",21);
		l.put("Kavya",22);
		l.put("Kirithika",20);
		
		BiConsumer<Map<String,Integer>,String> bc=Admission::allotment;
		bc.accept(l, "Alloted");
		
	}

}
class Admission{
	static void allotment(Map<String,Integer>l,String adm) {
		l.forEach((name,age)->{System.out.println("Name:"+name+" Age:"+age);});
	}
}
	
	


