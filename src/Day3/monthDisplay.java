package Day3;

import java.util.Scanner;

public class monthDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter voucher no.");
		int voucher=sc.nextInt();
		System.out.println("Your Name:");
		String name=sc.next();
		month mon=month.November;
		Validity val=new Validity(voucher,name,mon);
		val.show();
		
	}

}
class Validity{
	private int voucher;
	private String name;
	private month m;
	
	Validity(int voucher,String name,month m){
		this.voucher=voucher;
		this.name=name;
		this.m=m;
	}
	void show() {
		System.out.println("Voucher Number:"+voucher+" Name:"+name);
		System.out.println("Offer valid till "+m);
	}
}
