package Day3;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		Details d=e.new Details();
		System.out.println("Basic pay:"+d.sal);
		System.out.println("Provident Fund:"+d.pfund);
		System.out.println("Salary after pf deduction:"+d.pf(30000,3500));
		System.out.println("Tax detection:"+d.tds);
		System.out.println("Salary after tax deduction:"+d.tax(30000,2000));
		System.out.println("Salary along with overtime pay:"+d.overtime(30000));
		d.insurance();
		d.bonus();
	}
	
class Details {
	int sal;
	int ot;
	int pfund;
	int tds;
	int pay;
	int bonus;
	Details(int sal,int ot,int pf,int tds,int pay,int bonus){
		this.sal=sal;
		this.ot=ot;
		this.pfund=pfund;
		this.tds=tds;
		this.pay=pay;
		this.bonus=bonus;
	}
	Details(){
		sal=0;
		ot=0;
		pfund=0;
		tds=0;
		pay=0;
		bonus=3500;
	}
	void salary(int sal) {
		System.out.println("Salary: "+sal);
	}
	float pf(int sal,int pfund) {
		return sal-pfund;
	}
	int tax(int sal,int tds) {
		return sal-tds;
	}
	void insurance() {
		int insurance=1500;
		System.out.println("Insurance:"+insurance);
	}
	float overtime(int sal) {
		int pay=500*ot;
		return sal+pay;
	}
	void bonus() {
		System.out.println("Bonus:"+bonus);
	}
	
	
}
}
