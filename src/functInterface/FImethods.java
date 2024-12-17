package functInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FImethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String ,Float> bicon1=(name,marks)->System.out.println("Name:"+name+" Marks:"+marks);
		bicon1.accept("Niranjana", 88.65f);
		
		Consumer<Long>ph=(phone)->{System.out.println("Phone:"+phone);};
		ph.accept(1232228L);
		
		Function<String, Character>F1=(name)->{return name.charAt(0);};
		System.out.println("First Letter:"+F1.apply("Niranjana"));
		
		BiFunction<String,Integer,Character>b=(name,letter)->{return name.charAt(2);};
		System.out.println("2nd Index letter:"+b.apply("Niranjana",23));
		
		Predicate<Float> p=(marks)->{return marks>60;};
		System.out.println("Check marks:"+p.test(66.54f));
	}

}
