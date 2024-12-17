package AbstractTasks;

import java.util.Scanner;

public class thirdlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int large=0,n=0;
		System.out.println("Enter n:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("3rd Largest number:"+a[2]);
	}

}
