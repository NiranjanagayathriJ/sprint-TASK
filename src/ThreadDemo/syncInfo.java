package ThreadDemo;

public class syncInfo {

}

//CLASS LEVEL SYNC.
class Counter { 
	private static int count = 0;
	public synchronized static void increment() {
		count++;
		}
	public synchronized static void decrement() {
		count--; 
		} 
	public static int getCount() {
		return count; 
		}
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> 
		{ for (int i = 0; i < 1000; i++) {
			Counter.increment(); } 
		});
		Thread t2 = new Thread(() -> 
		{ for (int i = 0; i < 1000; i++) {
			Counter.decrement(); }
		});
		t1.start();
		t2.start(); 
		try {
			t1.join();
		t2.join(); 
		} catch (InterruptedException e) {
			e.printStackTrace(); 
			}
		System.out.println("Final count: " + Counter.getCount()); 
		} 
	}

//INSTANCE LEVEL SYNC>
class Counter {
	private int count = 0;
	public synchronized void increment() {
		count++;
		} 
	public synchronized void decrement() {
		count--; 
		}
	public int getCount() {
		return count; 
		}
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(() ->
		{ for (int i = 0; i < 1000; i++) { 
			counter.increment(); 
			} 
		});
		Thread t2 = new Thread(() -> 
		{ for (int i = 0; i < 1000; i++) {
			counter.decrement(); 
			}
		}); 
		t1.start(); 
		t2.start(); 
		try { 
			t1.join();
			t2.join();
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
				}
		System.out.println("Final count: " + counter.getCount()); 
		}
	}

//SYNC. BLOCK
class Counter { 
	private int count = 0; 
	public void increment() {
		synchronized (this) {
			count++;
			} 
		}
	public void decrement() { 
		synchronized (this) { 
			count--; 
			} 
		} 
	public int getCount() {
		return count; 
		}
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(() -> 
		{ for (int i = 0; i < 1000; i++) { 
			counter.increment(); 
			} 
		});
		Thread t2 = new Thread(() ->
		{ for (int i = 0; i < 1000; i++) { 
			counter.decrement(); 
			} 
		});
		t1.start(); 
		t2.start(); 
		try { 
			t1.join();
			t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
				} 
		System.out.println("Final count: " + counter.getCount()); 
		} 
	}

//SYNC. METHODS
class Counter { 
	private int count = 0;
	public synchronized void increment() {
		count++;
		}
	public synchronized void decrement() {
		count--;
		} 
	public int getCount() { 
		return count;
		}
	public static void main(String[] args) { 
		Counter counter = new Counter();
		Thread t1 = new Thread(() ->
		{ for (int i = 0; i < 1000; i++) {
			counter.increment(); 
			} 
		});
		Thread t2 = new Thread(() -> 
		{ for (int i = 0; i < 1000; i++) {
			counter.decrement();
			} 
		});
		t1.start();
		t2.start();
		try {
			t1.join(); 
			t2.join(); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
				}
		System.out.println("Final count: " + counter.getCount()); 
		}
	}