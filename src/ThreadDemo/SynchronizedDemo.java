package ThreadDemo;

import java.util.Scanner;

public class SynchronizedDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedDemo sd=new SynchronizedDemo();
		sd.setName("Niranjana");
		SynchronizedDemo sd2=new SynchronizedDemo();
		sd2.setName("Gayathri");
		sd.start();
		sd2.start();
	}
	public void run() {
		Order o=new Order();
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Customer order no. "+o.deliver(1002)+" by "+Thread.currentThread().getName());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				System.out.println("Customer name: "+o.name(255)+" Order: "+Thread.currentThread().getName());
				}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Order{
	private int orderId;
	private String name;
	public synchronized int deliver(int orderId)throws Exception{
		if(orderId!=1002) {
			throw new Exception("Order doesn't match");
		}
		return orderId;
	}
	public synchronized String name(int orderId) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter name:");
		this.name=sc.nextLine();
		System.out.println(name);
		}finally {
			sc.close();
		}
		return this.name;
	}
}