package AbstractTasks;

import java.util.Scanner;

public class concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter array1");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter array2");
		for(int i=0;i<5;i++) {
			b[i]=sc.nextInt();
		}
		int c[]=new int[10];
		for(int i=0;i<5;i++) {
		c[i]=a[i];
		c[i+5]=b[i];
		}
		for(int i=0;i<10;i++) {
		System.out.print(c[i]+" ");
		}
		
	}

}
