package compare;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Customer> stack=new Stack<>();
		stack.push(new Customer("Niranjana",2999));
		stack.push(new Customer("Kavya",4965));
		stack.push(new Customer("Mega",5999));
		
		System.out.println("Top(First Customer) person:"+stack.peek());
		
		//System.out.println("Customers List:"+stack.toArray(new Customer[0]));
		//System.out.println("CUSTOMERS LIST:"+stack.clone());
		StackArray st=new StackArray(3);
		st.push(new Customer("Niranjana",2999));
		st.push(new Customer("Kavya",4965));
		st.push(new Customer("Mega",5999));
		st.print();
		
	}

}

class Customer{
	private String name;
	private int amount;
	
	public Customer(String name,int amount) {
		this.name=name;
		this.amount=amount;
	}
		public String toString() {
			return "Customer name="+name+" Amount="+amount;
		}
		public String getName() {
			return name;
		}
		public int getAmount() {
			return amount;
		}
	
}
/*class StackE<O>{
	private O[] elements;
	private int top;
	private int size;
	
	public void push(O obj) {
		elements[++top]	=obj;
	
}
	public O pop() {
		return elements[top--];
	}
	
	public O peek() {
		return elements[top];
	}

}*/

class StackArray{
	private Customer[] a;
	private int top;
	
	StackArray(int s){
		a=new Customer[s];
		top=0;
	}
	 void push(Customer customer) {
		// TODO Auto-generated method stub
		a[top++]=customer;
	}
	Customer pop() {
		return a[--top];
	}
	void print() {
		for(int i=0;i<top;i++) {
			System.out.println("Customer at index"+i+": "+a[i]);
		}
	}
}