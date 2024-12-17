package Day3;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problems pro=new problems();
		pro.swap(10,5);
		pro.evOd(10,20);
		System.out.println("Factorial="+pro.factorial(4));
	}
}
class problems{
	void swap(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);	
	}
	
	void evOd(int a,int n) {
		System.out.println("Even Numbers");
		for(int i=a;i<=n;i++) {
		if((i%2)==0) 
			System.out.println(i);
		}
		System.out.println("Odd numbers");
		for(int i=a;i<=n;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
	
}
	int factorial(int n) {
		int A=1;
		for(int i=n;i>=1;i--) {
			A=A*i;
		}
		return A;
	}
}
