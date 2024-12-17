package functInterface;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Cust=new String[5];
		Cust[0]="Niranjana";
		Cust[1]="Kavya";
		Cust[2]="Aisvarya";
		Cust[3]="Alice";
		
		System.out.println(Cust[0].concat("gayathri"));
		
		
		for(String c:Cust) {
			Optional<String> op=Optional.ofNullable(c);
		op.filter(a->a.length()>6).ifPresent(System.out::println);

		}

		Optional<String>name=Optional.of(Cust[1]);
		Optional<String>em=Optional.empty();
		
		String Result=name.orElseGet(()->"No Name Found");
		System.out.println(Result);
	}

}
