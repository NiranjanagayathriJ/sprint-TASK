package Dayarray;

import java.util.Scanner;

public class mutliD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row:");
		int r=sc.nextInt();
		System.out.println("Enter column:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the elements of a:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			a[i][j]=sc.nextInt();
		}
		}
		int b[][]=new int[r][c];
		System.out.println("Enter the elements of b:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			b[i][j]=sc.nextInt();
	}
		}
		int ans[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			ans[i][j]=a[i][j]+b[i][j];
	}
		}
		
		System.out.println("Array a:");
		print(a);
		System.out.println("Array b:");
		print(b);
		System.out.println("Sum of two arrays:");
		print(ans);
		
	}

static void print(int[][]multiDimension) {
	for(int[]r:multiDimension) {
		for(int elements:r) {
			System.out.print(elements+" ");
		}
		System.out.println();
	}
}
}