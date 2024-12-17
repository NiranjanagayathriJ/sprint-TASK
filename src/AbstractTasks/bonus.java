package AbstractTasks;

import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a[]=new String[3];
		for(int k=0;k<10;k++) {
		System.out.println("Enter your Name, Years of Experience(in numbers),Designation(A1/A2):");
		
		for(int i=0;i<3;i++) {
			a[i]=sc.next();
		}
		int bonus=0;
		if(a[1].equals("2") && (a[2].equals("A1") || a[2].equals("A2"))) {
			bonus=1500;
		}
		else if(a[1].compareTo("2")>0 && a[1].compareTo("6")<0 && a[2].equals("A1")){
			bonus=3000;
		}
		else if(a[1].compareTo("2")>=0 && a[1].compareTo("6")<0 && a[2].equals("A2")){
			bonus=2500;
		}
		else {
			bonus=4500;
		}
		
		System.out.println("Your Bonus:"+bonus);
	}
	}
}

