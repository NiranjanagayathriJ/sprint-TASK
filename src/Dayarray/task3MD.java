package Dayarray;

public class task3MD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1,sum=0;
int array[][]=new int[3][3];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
			array[i][j]=n++;
	}
}
for(int i=0;i<3;i++) {
	System.out.print("[");
	for(int j=0;j<3;j++) {
		System.out.print(array[i][j]+" ");
		sum+=array[i][j];
	}
	System.out.print("]");
	System.out.println();
}
System.out.println("Sum of elements:"+sum);
	}

}


