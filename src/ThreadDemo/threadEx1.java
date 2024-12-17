package ThreadDemo;

import java.util.Scanner;

public class threadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply mul=new Multiply();
		mul.setName("MULTIPLICATION");
		mul.start();
		
		try {
			mul.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Add add=new Add();
		Thread ta=new Thread(add,"ADD");
		ta.start();
		ta.interrupt();  //instead of stop
//		ta.setPriority(Thread.MAX_PRIORITY);
//		System.out.println("Priority add:"+ta.getPriority());
		

	}

}
class Multiply extends Thread{
	public void run() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		System.out.println("Enter m:");
		int m=sc.nextInt();
		System.out.println(Thread.currentThread().getName());
			for(int j=1;j<=m;j++) {
				int A=n*j;
				System.out.println(n+"*"+j+"="+A);
				
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Add implements Runnable{
	public void run() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("SUM="+(a+b));
		//Thread.sleep(2000);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
