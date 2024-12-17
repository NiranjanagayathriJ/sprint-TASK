package compare;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=12;
		a[1]=15;
		a[2]=24;
		a[3]=35;
		a[4]=6;
		a[5]=17;
		
		System.out.println("Array:"+Arrays.toString(a));
		
		int result=bubble(a);
		if (result!=-1)
			System.out.println("Bubble Sort:"+Arrays.toString(a));
				
	}
		/*int temp=0;
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("Bubble Sort:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		public static int bubble(int[]a) {	
		int temp=0;
		for(int j=0;j<a.length-1;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
					temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
		}
	}
		return temp;
		}
	}
