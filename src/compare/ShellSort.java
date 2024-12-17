package compare;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,34,54,2,3};
		for(int gap=a.length/2;gap>0;gap/=2) {
			for(int i=gap;i<a.length;i++) {
				int temp=a[i];
				int j;
			
				for(j=i;j>=gap && a[j-gap]>temp; j-=gap) {
					a[j]=a[j-gap];
				}
				a[j]=temp;
				System.out.println(Arrays.toString(a));
			}
			
		}
		System.out.println("ANS:"+Arrays.toString(a));
	}

}
