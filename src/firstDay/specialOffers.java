package firstDay;

import java.time.Month;
import java.util.Scanner;

public class specialOffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String CustName=sc.next();
		System.out.println("Enter Special/Non-Special Offer:");
		String sp=sc.next();
		System.out.println("Enter Bill No. :");
		int billNo=sc.nextInt();
		System.out.println("Enter no. of items:");
		int items=sc.nextInt();
		Special off=new Special(billNo,CustName,items,sp);
		off.display();
	}

}
class Special extends Customer{
	String sp;
	Special(int billNo, String CustName, int items,String sp){
		super(billNo,CustName,items);
			this.sp=sp;
		}
	void display() {
		super.display();
		String a="Special";
		String b="Non-Special";
		if(sp.equals(a)) {
		
			System.out.println("Special Offers:");
			System.out.println("Flat 25% offer on all Veg.Foods");
			System.out.println("Flat 30% offer on all Non-Veg.Foods");
				int total=items*200;
				Scanner sc=new Scanner(System.in);
				System.out.println("Veg/Non-Veg");
				String v=sc.next();
				String veg="Veg";
				String nveg="Non-Veg";
				if(v.equals(veg)) {
				float discount=(float) (total*0.25);
				int r=(int) (total-discount);
				System.out.println("Total Amount:"+r);
			}
				if(v.equals(nveg)) {
					float discount=(float) (total*0.30);
					int r=(int) (total-discount);
					System.out.println("Total Amount:"+r);
				}
			}
		
			if(sp.equals(b)) {
			System.out.println("NO OFFERS");
			int total=items*200;
			System.out.println("Amount:"+total);
			}
	}
	
}
