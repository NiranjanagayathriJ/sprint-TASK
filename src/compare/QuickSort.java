package compare;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {22,3,14,2,55,1};
		int first=0;
		int last=a.length-1;
		
		if(first<last) {
			int pivot=a[last];
			System.out.println(Arrays.toString(a));
		}
	}

}
