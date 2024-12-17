package compare;

public class QueueArray {

	public static void main(String[] args) {
		QueueArray q=new QueueArray();
		Example e=q.new Example(5);
		e.enqueue("Niranjana");
		e.enqueue("Gayathri");
		e.dequeue();
		e.enqueue("Kavya");
		e.enqueue("Alice");
		e.enqueue("Aisvarya");
		e.display();		
		e.enqueue("Mega");
		e.display();
		System.out.println("Peek element:"+e.peek());
		e.dequeue();
		e.dequeue();
		e.dequeue();
		e.dequeue();
		e.dequeue();
		e.display();

	}
	
	public class Example{
		private String[] queue;
		private int front=0;
		private int rear=0;
		
		public Example(int capacity) {
			queue=new String[capacity];
		}
		public String peek() {
			// TODO Auto-generated method stub
			return queue[front];
		}
		public void enqueue(String element) {
			if(rear==queue.length) {
				System.out.println("Array is Full");
			}else {
				queue[rear++]=element;
			}
		}
		public String dequeue() {
			if(front>=rear) {
				System.out.println("Queue is empty");
				return null;
			}else {
				return queue[front++];
			}
		}
		public void display() {
			System.out.println("Queue:");
			for(int i=front;i<rear;i++) {
				System.out.println(queue[i]);
			}
			System.out.println();
		}
	}

}
