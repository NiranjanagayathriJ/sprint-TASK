package firstDay;

import java.util.Scanner;

public class customerPreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*singleInheritance s=new singleInheritance(123,"abc",4,1);
		s.display();*/
		for(int i=0;i<3;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String CustName=sc.next();
		System.out.println("Enter Bill No. :");
		int billNo=sc.nextInt();
		System.out.println("Enter no. of items:");
		int items=sc.nextInt();
		System.out.println("Enter choice:");
		int choice=sc.nextInt(); 
		System.out.println("Feedback:");
		String fb=sc.next();
		fB s=new fB(billNo,CustName,items,choice,fb);
		System.out.println("fB object");
		s.display();
		System.out.println("fB object from method orders");
		s.orders().display();
		
		
	
	}
	}
}

/*class foodChoice extends Customer{
	int choice;
	foodChoice(int billNo, String CustName, int items,int choice){
		super(billNo,CustName,items);
		this.choice=choice;
	}*/
	
class fC extends Customer{
	int choice;
	fC(int billNo, String CustName, int items,int choice){
		super(billNo,CustName,items);
		this.choice=choice;
	}		
void display() {
	super.display();
	if(choice==1)
		System.out.println("Vegetarian");
	if(choice==2)
		System.out.println("Non-Vegetarian");
}
}

class fB extends fC{
	String fb;
	fB(int billNo, String CustName, int items,int choice,String fb){
		super(billNo,CustName,items,choice);
		this.fb=fb;
	}
void display(){
	super.display();
	super.total();
	String g="Good";
	String b="Bad";
	if(fb.equals(g))
		System.out.println("Thank you");
if(fb.equals(b))
	System.out.println("Sorry. We'll improve");
}
fB orders() {
	return new fB(billNo,CustName,items,choice,fb);
}
}



	
