package AbstractTasks;

import java.util.Scanner;

public class occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		for(int i=0;i<8;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<8;i++) {
			int count=1;
			for(int j=i+1;j<8;j++) {
			if(a[i]==a[j]) {
				count++;
			}
			}
				System.out.println(a[i]+"occurs"+count+"times");
		}
	}

}
