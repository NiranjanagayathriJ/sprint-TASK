package AbstractTasks;

import java.util.Scanner;

public class numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of Array:");
		int a[]=new int[9];
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int start=0;
		int end=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				b[i]=a[end--];
			}
			else {
				b[i]=a[start++];
			}
		}
		System.out.println("Array after rearrangement:");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		}

}
