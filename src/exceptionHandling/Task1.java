package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		try {
		int a[]= {12,3,2,1};
		a[4]=44;
		//for(int i=0;i<4;i++) {
		//System.out.println(a[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception 1");
		}
		try {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			if(n<0) {
			System.out.println(n);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Exception 2");
		}
		try {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
			if(num>10) {
				System.out.println("wrong num");
			}
		}
		catch(Exception e){
			System.out.println("Exception 3");
		}
	}

}
