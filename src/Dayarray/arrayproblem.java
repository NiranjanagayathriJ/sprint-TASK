package Dayarray;

import java.util.Scanner;

public class arrayproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int large=0,n=0,sum=0;
		float Average=0;
		System.out.println("Enter n:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]>large) {
				large=a[i];
			}
			sum+=a[i];
			Average=(float)sum/n;	
		}
		System.out.println("Elements in the array:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Largest element="+large);
		System.out.println("Average="+Average);
	}

}
