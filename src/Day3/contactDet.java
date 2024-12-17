package Day3;

import java.util.Scanner;

public class contactDet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentMngt sm=new StudentMngt();
		ContactDetails c=sm.new ContactDetails();
		System.out.println("Enter your residing city:");
		c.city=sc.next();
		System.out.println("Enter your State:");
		c.state=sc.next();
		System.out.println("Enter phone number:");
		c.phone=sc.nextDouble();
		System.out.println("Applied successfully");
		

	}
	class ContactDetails{
		String city;
		String state;
		double phone;
		
		ContactDetails(String city,String state,double phone){
			this.city=city;
			this.state=state;
			this.phone=phone;
		}
		ContactDetails(){
			city="";
			state="";
			phone=0;
		}
		void personal() {
			System.out.println("City:"+city);
			System.out.println("State:"+state);
			System.out.println("Phone No.:"+phone);
		}
	}

}
