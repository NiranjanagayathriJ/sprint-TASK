package compare;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int a[]= {2,1,4,5,3,7};
		System.out.println("Before Sorting:"+Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println("Sorted Array:"+Arrays.toString(a));
	}
	public static void mergeSort(int[] a,int left,int right) {
		if(left<right) {
			int middle=(left+right)/2;
			
			mergeSort(a,left,middle); //sorting left half
			mergeSort(a,middle+1,right); //sorting right left
			mergeLast(a,left,middle,right);// merging at last 
		}
	}
	public static void mergeLast(int[]a,int left,int middle,int right) {
		int n1=middle-left+1;
		int n2=right-middle;
		
		int[] leftA=new int[n1];
		int[] rightA=new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftA[i]=a[left+i];
		}
		for(int j=0;j<n2;j++) {
			rightA[j]=a[middle+1+j];
		}
		
		//logic
		
		int i=0,j=0,k=left;  //left=0
		while(i<n1 && j<n2) {
			if(leftA[i]<=rightA[j]) {
				a[k]=leftA[i];
				i++;
				System.out.println("LeftSide:"+Arrays.toString(a));
			}else {
				a[k]=rightA[j];
				j++;
				System.out.println("RightSide:"+Arrays.toString(a));
			}
			k++;
			
		}
		
		//copying remaining to left array
		while(i<n1) {
			a[k]=leftA[i];
			i++;
			k++;
			System.out.println(Arrays.toString(a));
		}
		//copying remaining elements to right array
		while(j<n2) {
			a[k]=rightA[j];
			j++;
			k++;
			System.out.println(Arrays.toString(a));
		}
		
	}
}
