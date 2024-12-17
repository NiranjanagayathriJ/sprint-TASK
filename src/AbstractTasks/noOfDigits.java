package AbstractTasks;

import java.util.Scanner;

public class noOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int n1=0,n2=0,n3=0;
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			int c=a[i];
			int count=0;
			while(c!=0) {
			c/=10;
			count++;
		}
			if(count==3) {
				n1++;
		}
			if(count==2) {
				n2++;
			}
			if(count==1) {
				n3++;
			}
		}
System.out.println("No.of three digit numbers="+n1+" No.of two digit numbers="+n2+" No.of one digit numbers:"+n3);
}
}
