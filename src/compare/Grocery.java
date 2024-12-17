package compare;

import java.util.*;

public class Grocery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Grocery grocery=new Grocery();
		PurchaseList purchaselist=grocery.new PurchaseList();
		BillingSystem billingsystem=grocery.new BillingSystem();
		TaxCollector taxcollector=grocery.new TaxCollector();
		while(true) {
		System.out.println("Welcome! Choose one");
		 System.out.println("1. Purchase\n2.More Products\n3.Generating Invoice\n4.Final Bill Amount\n5.Exit");
		int number=sc.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("Available products:\nRice(Rs.50/kg),Dhal(Rs.70/kg),Sugar(Rs.30/kg),Oil(Rs.150/L)");
			String name=sc.next();
			System.out.println("Enter quantity:");
			int quantity=sc.nextInt();
			System.out.println("Discount:20% on all products");
			float discount=0.20f;
			Product product=grocery.new Product(name,getProductPrice(name),"Description of "+name);
			Purchase purchase=grocery.new Purchase(discount,quantity,product);
			purchaselist.addPurchase(purchase);
			break;
			
		case 2:
			if(purchaselist.isEmpty()){ 
				System.out.println("No Products in purchase list.");
			}
			break;
		case 3:
			billingsystem.GenerateInvoice(purchaselist,taxcollector);
			break;
		case 4:
			System.out.println("Final Bill Amount: Rs."+billingsystem.finalBill(purchaselist, taxcollector));
			break;
		case 5:
			System.out.println("Exiting. Thank you");
			
		}
		}
	}
		private static int getProductPrice(String name) {
			switch(name.toLowerCase()) {
			case "rice":
				return 50;
			case "dhal":
				return 70;
			case "sugar":
				return 30;
			case "oil":
				return 150;
				default:
					return 0;
			}
		
}

//Product
class Product{
	private int price;
	private String name;
	private String description;
	
	public Product(String name,int price,String description) {
		this.price=price;
		this.name=name;
		this.description=description;
	}
	//getterSetter
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description=description;
	}
}

//Purchase
class Purchase{
	private float discount;
	private int quantity;
	private Product product;
	public Purchase(float discount, int quantity,Product product) {
		this.discount=discount;
		this.quantity=quantity;
		this.product=product;
	}
	
	//getterSetter
	public float getdiscount() {
		return discount;
	}
	public void setdiscount(float discount) {
		this.discount=discount;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}

	public Product getProduct() {
		// TODO Auto-generated method stub
		return product;
	}
	public void setProduct(Product product) {
		this.product=product;
	}
}

//Purchase List
class PurchaseList{
	private List<Purchase> purchaseobj;
	
	public PurchaseList() {
		this.purchaseobj=new LinkedList<>();
	}
	public void addPurchase(Purchase purchase) {
		purchaseobj.add(purchase);
	}
	public boolean isEmpty() {
		return purchaseobj.isEmpty();
	}
	public List<Purchase>getpurchaseobj() { // Method to get the list of purchase
		return purchaseobj;
}
}
//Billing System
class BillingSystem extends PurchaseList{
	
	public BillingSystem() {
		super();
	}
	
	public void GenerateInvoice(PurchaseList purchaselist,TaxCollector taxcollector) {
		int total=0;
		for(Purchase purchase:purchaselist.getpurchaseobj()) {
			int price=purchase.getProduct().getprice();
			int quantity=purchase.getquantity();
			float discount=purchase.getdiscount();
			total+=(price*quantity)*(1-discount);
		}
			System.out.println("Invoice Generated(without tax charges): "+total);
			
			System.out.println("Products in the cart:");
			//purchaseobj.forEach(System.out::println);
		
	}
	public float finalBill(PurchaseList purchaselist,TaxCollector taxcollector) {
		float total=0;
		for(Purchase purchase:purchaselist.getpurchaseobj()) {
			int price=purchase.getProduct().getprice();
			int quantity=purchase.getquantity();
			float discount=purchase.getdiscount();
			total+=(price*quantity)*(1-discount);
		}
		float tax=total*taxcollector.getTaxrate();
		total+=tax;
		return total;
	}
}

//Tax Collector
class TaxCollector{
	private float taxrate=0.07f;
	
	public float getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(float taxrate) {
		this.taxrate=taxrate;
	}
	
	
}
}