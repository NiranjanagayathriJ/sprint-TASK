package interfaceAbstract;

import java.util.Scanner;

public class FunctIFlambda 
//implements BiggestOf3
{
	private int a,b,c;
	public FunctIFlambda() {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BiggestOf3 b3=new FunctIFlambda();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	
		BiggestOf3 b3=(x,y,z)->{return (a>b && a>c)?a:(b>c)?b:c;};
		System.out.println("Biggest Number:"+b3.biggest(a,b,c));
		
		/*BiggestOf3 b3=(a,b,c)->{return (a>b && a>c)?a:(b>c)?b:c;};
		System.out.println("Biggest Number:"+b3.biggest(12,44,3));*/
		
		
	}

	/*@Override
	public int biggest(int a, int b, int c) {
		// TODO Auto-generated method stub
		return (a>b && a>c)?a:(b>c)?b:c;
	}*/

}
