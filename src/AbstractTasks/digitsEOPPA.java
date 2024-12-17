package AbstractTasks;

import java.util.Scanner;

public class digitsEOPPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		digitsEOPPA d=new digitsEOPPA();
		Number n=d.new Number(a);
		n.EvOd();
		n.prime();
		n.palindrome();
		n.Armstrong();
		
	}
class Number{
	int even=0,odd=0,palin=0,prime=0,arm=0;
	int a[];
	Number(int[]a){
		this.a=a;
	}
	
	void EvOd() {
		for(int i=0;i<5;i++) {
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even count="+even);
		System.out.println("Odd count="+odd);
	}
	void prime() {
		int count=0;
		for(int i=0;i<5;i++) {
			if(a[i]<2)
				continue;
			boolean isPrime=true;
			for(int j=2;j<=Math.sqrt(a[i]);j++) {
			if(a[i]%j==0) {
				isPrime=false;
			break;
			}
			}
			if(isPrime==true) {
				count++;
			}
				
		}
		System.out.println("Prime count="+count);
	}
	void palindrome() {
		for(int i=0;i<5;i++) {
			
			int rev=0;
			int c=a[i];
				int r=c%10;
				rev=rev*10+r;
				c/=10;
			if(rev==a[i]) {
				palin++;
		}
	}
System.out.println("Palindrome count:"+palin);
}
	void Armstrong() {
		for(int i=0;i<5;i++) {
			int ori=a[i];
			int sum=0,count=0;
			while(ori!=0) {
				int r=ori/10;
				count++;
			}
			ori=a[i];
		
		while(ori!=0) {
			int r=ori%10;
				sum+=(int) Math.pow(r, count);
				 ori/=10;	 
			
			if(sum==ori) {
				arm++;
				System.out.println("Armstrong count:"+arm);
		}
	}
	}
}
}
}

