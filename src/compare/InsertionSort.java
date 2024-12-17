package compare;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {22,3,14,2,55,1};
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
				System.out.println("WHILE:"+Arrays.toString(a));
			}
			a[j+1]=temp;
			System.out.println(Arrays.toString(a));
		}
	}

}
