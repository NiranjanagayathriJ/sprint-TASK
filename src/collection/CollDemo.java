package collection;

import java.util.Arrays;

public class CollDemo {
			 
			public static void main(String[] args) {
				
				//Array of object Customer
				
				Customer[] cust= new Customer[4];
				
				cust[0]= new Customer(1,"Kaviya",22,1000);
				cust[1]= new Customer(6,"Dhiwagar",23,2000);
				cust[2]= new Customer(5,"Sameena",21,3000);
				cust[3]= new Customer(2,"Sakthi",24,4000);
				
				Arrays.sort(cust);
				
				System.out.println("Sorting:"+Arrays.toString(cust));
				
		 
	}

}
