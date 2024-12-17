package compare;
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import compare.UserDefComp.Tenant2;

public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> strEmpty=Stream.empty();
		Set<Tenant2> ll= new HashSet<>();
		UserDefComp u=new UserDefComp();
		ll.add(u.new Tenant2(3,"Niranjana",9000,"CG1"));
		ll.add(u.new Tenant2(6,"Kaviya",11000,"CG2"));
		ll.add(u.new Tenant2(3,"Niranjana",9000,"CG1"));
		ll.add(u.new Tenant2(2,"Sakthi",6000,"CG3"));
		
		
		Stream<Tenant2>strTent=ll.stream();
		
		Tenant2[] tent=new Tenant2[4];
		tent[0]=u.new Tenant2(3,"Niranjana",9000,"CG1");
		tent[1]=u.new Tenant2(6,"Kaviya",11000,"CG2");
		tent[2]=u.new Tenant2(3,"Niranjana",9000,"CG1");
		tent[3]=u.new Tenant2(2,"Sakthi",6000,"CG3");
		
		Stream<Tenant2> streamarray=Arrays.stream(tent);
		
		Set<Tenant2> setTent=strTent.filter(c->c.getmembers()>2)
				.collect(Collectors.toSet());
				System.out.println("Set customer who has members >2"+setTent);

		Map<String,Integer> mapTent=ll.stream()
				.collect(Collectors.toMap(c->c.getname(), c->c.getrent()));
		System.out.println("List to Map:"+mapTent);
		
		int total=ll.stream()
				.map(c->c.getrent())
				.reduce(0, (sum,rent)->sum+rent);
		System.out.println("Total Rent:"+total);
		
		Tenant2 max=ll.stream()
				.max((t1,t2)->t1.getrent()>t2.getrent()?1:-1).get();
				
		System.out.println("Highest Rent:"+max);
		
		Tenant2 min=ll.stream()
				.min((t1,t2)->t1.getrent()>t2.getrent()?1:-1).get();
		System.out.println("Lowest Rent:"+min);
	}

}
