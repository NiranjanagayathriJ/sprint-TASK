package compare;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				int size,mid,element;
				boolean flag=false;
				System.out.println("Enter enter size of array");
				size=sc.nextInt();
				int a[]= new int[size];
				System.out.println("Enter elements to array");
				for(int i=0;i<=size-1;i++)
				{
				a[i]=sc.nextInt();
				}
//				1) create an array get elements and sort the array
				Arrays.sort(a);
				System.out.println("Sorted Array:"+Arrays.toString(a));
//				2)  mid=(start index+length-1)/2 find mid element
				mid=(0+(size-1))/2;
//				3) get search element
				System.out.println("Enter enter search element of array");
				element=sc.nextInt();
//				3)check from element == a[mid]
//				 	return a[mid]
				
//					4)  check from element > a[mid]
					
//					5) check  from index= mid+1 to length-1
						//					7)  check from element < a[mid]
				
				int index=search(a,0,size-1,element);
				if(index!=-1)
					System.out.println("Element found "+element+"at index "+index);
				else
					System.out.println("Element NOT found");
						}

public static int search(int[]a,int first,int last,int element) {
	if(first>last) {
		return -1;
	}
	int mid=(first+last)/2;
	
	if(a[mid]==element) {
		return mid;
	}else if(a[mid]<element) {
		return search(a,mid+1,last,element);
	}else {
		return search(a,0,mid-1,element);
	}
}
}
