package compare;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
				
/*		//	algorithm
				
//				1) create an array get elements
				
				int[] a= new int[5];
				a[0]=12 ;
				a[1]=13;
				a[2]=15;
				a[3]=16;
		 
				System.out.println("Before Insertion:"+Arrays.toString(a));
				
//				2) start loop from index 0 to length-1
				
				for(int i=0;i<=a.length-1;i++)
				{
				
//				3) check index==2 true
					if(i==2)
					{
//				4)start loop from index to length-1
						for(int j=a.length-1;j>=i;j--)//4//3
						{
//				5) a[index+1]=a[index]
							a[j]=a[j-1];//a[4]=a[3]=15//a[3]=a[2]
							
						}
//				6)a[2]=14
						a[2]=14;
		 
					}
		 
				}
				System.out.println("After Insertion:"+Arrays.toString(a));*/
		
		
//Inserting in a fully filled array
		
		int[] a= {12,13,15,16};
		int newElement=14;
		int insertIndex=2;
		
		int[] newArray=new int[a.length+1];
		for(int i=0;i<insertIndex;i++) {
			newArray[i]=a[i];
		}
		newArray[insertIndex]=newElement;
		
		for(int i=insertIndex;i<a.length;i++) {
			newArray[i+1]=a[i];
		}
		System.out.println("After Insertion: "+Arrays.toString(newArray));
		}
}
