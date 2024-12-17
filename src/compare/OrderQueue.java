package compare;

import java.util.*;

public class OrderQueue {
	private Queue<Order> order;
	private int capacity;
	
	OrderQueue(int capacity) {
		this.order=new LinkedList<>();
		this.capacity=capacity;
	}
	
	//gettersetter
	public Queue<Order> getOrder(){
		return order;
	}
	public void setOrder(Queue<Order> order){
		this.order=order;
	}
	void enqueue(Order order) {
		if(this.order.size()<this.capacity)
			this.order.add(order);
		else
			System.out.println("queue is full");
	}
	public Order dequeue() {
		if(this.order.isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		return this.order.poll();
	}
	public void display() {
		if(this.order.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Orders in the queue:");
		for(Order o:order) {
			System.out.println("Customer: "+o.getCustomer()+" Order ID: "+o.getOrderId());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of orders:");
		int capacity=sc.nextInt();
		OrderQueue oq=new OrderQueue(capacity);
		
		oq.enqueue(new Order("Niranjana","123"));
		oq.enqueue(new Order("Gayathri","456"));
		
		oq.display();
		System.out.println("Dequeued order: "+oq.dequeue().getOrderId());
		
		oq.display();
		
		
	}

}
class Order{
	private String customer;
	private String orderId;
	
	public Order(String customer,String orderId) {
		this.customer=customer;
		this.orderId=orderId;
	}
	//gettersetter
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId=orderId;
	}
}
