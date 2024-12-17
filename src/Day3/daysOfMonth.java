package Day3;

import java.util.Scanner;

public class daysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int day=sc.nextInt();
		daysCount dC=daysCount.January;
		switch(day) {
		case 30:
			System.out.println(daysCount.April);
			System.out.println(daysCount.June);
			System.out.println(dC=daysCount.September);
			System.out.println(dC=daysCount.November);
			break;
			
		case 31:
			System.out.println(dC=daysCount.January);
			System.out.println(dC=daysCount.March);
			System.out.println(dC=daysCount.May);
			System.out.println(dC=daysCount.July);
			System.out.println(dC=daysCount.August);
			System.out.println(dC=daysCount.October);
			System.out.println(dC=daysCount.December);
			break;
			
		case 28:
			System.out.println(dC=daysCount.February);
			break;
		
		default:
			System.out.println("Enter correct days");
		}
		
	}

}
