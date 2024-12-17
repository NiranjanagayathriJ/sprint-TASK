package functInterface;

import java.util.*;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.LongFunction;

public class OptionalWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleUnaryOperator ds= (value)->Math.pow(value, 5);
		double result=ds.applyAsDouble(5);
        System.out.println("Result="+result);
        LongFunction<String> str=value->"String ="+value;
        String resultStr=str.apply(213345646L);
        System.out.println(resultStr);
        
        
	}

}
