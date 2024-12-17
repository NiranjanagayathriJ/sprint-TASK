package interfaceAbstract;

import java.util.Scanner;

public class Onlinestore implements ProductsAvailable{
	
	private String name;
	private int products;
	private int items;
	
	public Onlinestore() {
		this.name=name;
		this.products=products;
		this.items=items;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		for(int i:a) {
		Scanner sc=new Scanner(System.in);
		String name;
		int products,items,amount=0;
		System.out.println("Enter customer name:");
		name=sc.next();
	System.out.println("Enter prduct choice: 1.groceries 2.clothing 3.home appliances");
		products=sc.nextInt();
		if(products>3) {
			System.out.println("Invalid");
		}else {
	System.out.println("No.of items purchased:");
	items=sc.nextInt();
		ProductsAvailable pa=new Onlinestore();
		pa.name();
		pa.cart(items);
		Amount.amount(items, amount);
	}
	}
	}
	@Override
	public void name() {
		// TODO Auto-generated method stub
		String name="abc";
		System.out.println("Customer Name:"+name);
	}



}
