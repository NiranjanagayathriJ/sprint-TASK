package linearProbing;

public class LinearBasic {

	public static void main(String[] args) {
		LinearHT ht=new LinearHT(10);
		ht.insert(12);
		ht.insert(22);
		ht.insert(65);
		ht.insert(47);
		ht.delete(22);
		ht.search(65);
		ht.printTable();

	}

}
class LinearHT{
	private int[] table;
	private int size;
	private int capacity;
	
	public LinearHT(int capacity) {
		this.table=new int[capacity];
		this.size=0;
		this.capacity=capacity;
		
		for(int i=0;i<capacity;i++) {
			table[i]=-1;
		}
	}
	//gettersetter
	public int[] getTable() {
		return table;
	}
	public void setTable(int[] table) {
		this.table=table;
	}
	public int getSize() {
		return size;
	}
	public void setsize(int size) {
		this.size=size;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}

	public int hash(int key) {
		return key%capacity;
	}
	public void insert(int key) {
		if(size==capacity) {
			System.out.println("Table full");
			return;
		}
		
		int index=hash(key);
		
		while(table[index]!=-1) {
			if(table[index]==key) {
				System.out.println("key already exists: "+key);
				return;
			}
			index=(index+1)%capacity;
		}
		table[index]=key;
		size++;
		System.out.println("Inserted key: "+key+" at index "+index);
	}
	
	public boolean search(int key) {
		int index=hash(key);
		
		while(table[index]!=-1) {
			if(table[index]==key) {
				System.out.println("Found");
				return true;
			}
			index=(index+1)%capacity;
		}
		System.out.println("NOT Found");
		return false;
	}
	
	public void delete(int key) {
		int index=hash(key);
		while(table[index]!=-1) {
			if(table[index]==key) {
				table[index]=-1;
				size--;
				System.out.println("Deleted");
				return;
			}
			index=(index+1)%capacity;
		}
		System.out.println("Not found");
	}
	
	public void printTable() {
		System.out.println("Hash Table:");
		for(int i=0;i<capacity;i++) {
			System.out.println(table[i]);
		}
	}
}