package ThreadDemo;

import java.util.Random;
import java.util.Stack;

public class HotelMngt {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Bank b = new Bank();
				Order1 d =  new Order1(b);
				Thread th1 = new Thread(d);
				th1.start();
				Deliver w = new Deliver(b);
				Thread th2 = new Thread(w);
				th2.start();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
			}
		 
		}
		 
		class Bank {
			private Stack<Integer> stack= new Stack<>();
			public void push(int num)
			{
				stack.push(num);
			}
			public int pop()
			{
				return stack.pop();
			}
			public boolean isEmpty()
			{
				return stack.isEmpty();
			}
		}
		 
		 
		class Order1 implements Runnable{
			private Bank b;
			public Order1(Bank b) {
				this.b = b;
			}
			public void run() {
				while(true) {
					Random r = new Random();
					int n = r.nextInt(100);
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					synchronized(b)
					{
					b.push(n);
					System.out.println("Pushed: "+n);
					b.notifyAll();
					}
				}
			}
		}
		 
		 
		class Deliver extends Thread{
			private Bank b;
			public Deliver(Bank b) {
				this.b = b;
			}
			public void run() {
			   while(true) {
				   synchronized(b) {
					   if(!b.isEmpty()) {
						   int n = b.pop();
						   System.out.println("Popped: " + n);
					   }
					   try {
						   b.wait();
					   }catch(InterruptedException e){
						  e.printStackTrace(); 
					   }
				   }
			   }
			}
	

	}
