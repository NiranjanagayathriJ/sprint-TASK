package functInterface;

import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class Predefined {
	    public static void main(String[] args) {
	        // Using a lambda expression to create a DoubleSupplier
	        DoubleSupplier ds = ()->Math.pow(2, 5);
	        System.out.println(ds.getAsDouble());
	        
	        DoubleToIntFunction dif=Predefined::cube;
	        double cubeValue=3.8;
	        int result=dif.applyAsInt(cubeValue);
	        System.out.println("D to I Result="+result);
	        
	        DoubleToLongFunction dlf=Predefined::cube;
	        double cubevalue=44.532;;
	        int result1=dif.applyAsInt(cubevalue);
	        System.out.println("D to L Result="+result1);

	 
	}
public static int cube(double value) {
	return(int)(value*value*value);
}

}
