package firstDay;

import java.util.Scanner;

public class customerBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter Customer Name:");
		c.CustName=sc.next();
		System.out.println("Enter Bill No. :");
		c.billNo=sc.nextInt();
		System.out.println("Enter no. of items:");
		c.items=sc.nextInt();
	c.display();
		 
		
		/*Customer c1=new Customer(1234,"Niranjanagayathri",3);
		c1.display();
		c1.total();*/
	}

}

class Customer{
	int billNo;
	String CustName;
	int items;
	int Total;
	
	Customer(int billNo, String CustName, int items){
		this.billNo=billNo;
		this.CustName=CustName;
		this.items=items;
	}
	
	Customer(){
		billNo=0;
		CustName="";
		items=0;
	}
	
	void display() {
	System.out.println("Bill No. :"+billNo);
	System.out.println("Customer Name :"+CustName);
	System.out.println("NO. of items purchased: "+items);
	}
	
	void total() {
		int Total=items*200;
		System.out.println("Total amount: Rs."+Total);
	}
	Customer orders() {
		return new Customer();
	}
	
}


