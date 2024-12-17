package compare;

public class SingleLinkedList {

	public static void main(String[] args) {
		YPLinkedList list=new YPLinkedList();
		YPNode n1=new YPNode();
		YPNode n2=new YPNode();
		
		n1.setyp(new YP("Niranjana",123));
		n2.setyp(new YP("Gayathri",456));
		
		list.addToFront(n1);
		list.addToFront(n2);
		System.out.println("List:");
		list.print();
		
		YPNode n3=new YPNode();
		n3.setyp(new YP("Abc",333));
		list.addToEnd(n3);
		System.out.println("\nAfter adding at END:");
		list.print();
		
		list.removeFromFront();
		System.out.println("\nAfter removing from FRONT:");
		list.print();
		
		list.removeFromEnd();		
		System.out.println("\nAfter removing from End:");
		list.print();
	}

}
class YP{
	private String name;
	private int id;
	
	public YP(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	//setters
	public void setName(String name) {
		this.name=name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String toString() {
		return "YP id="+id+" YP name="+name;
	}
}
class YPNode{
	private YP yp;
	YPNode next;
	
	/*public YPNode(YP yp) {
		this.yp=yp;
	}*/
	public YP getyp() {
		return yp;
	}
	public YPNode getnext() {
		return next;
	}
	//setter
	void setyp(YP yp) {
		this.yp=yp;
	}
	void setnext(YPNode next) {
		this.next=next;
	}
}
class YPLinkedList{
	
	private YPNode head;
	private int size;
	public YPNode gethead() {
		return head;
	}

	public void print() {
		YPNode current=head;
		while(current!=null) {
			System.out.print(current.getyp());
			System.out.print("-->");
			current=current.getnext();
		}
		System.out.print("null");
	}
	
	public int getsize() {
		return size;
	}
	//setter
	void sethead(YPNode head) {
		this.head=head;
	}
	void setsize(int size) {
		this.size=size;
	}
	
	//
	void addToFront(YPNode yp) {
		YPNode node=new YPNode();
		node.setyp(yp.getyp());
		node.setnext(head);
		head=node;
		size++;
		
	}
	void addToEnd(YPNode yp){
		YPNode n=new YPNode();
		n.setyp(yp.getyp());
		YPNode current=head;
		while(current.getnext()!=null) {
			current=current.getnext();
		}
		current.next=n;
		n.next=null;
		size++;
	}
	YPNode removeFromFront() {
		YPNode removenode=head;
		head=head.getnext();
		size--;
		removenode.setnext(null);
		return removenode;
	}
	YPNode removeFromEnd() {
		YPNode removenode=head;
		while(removenode.next.next!=null) {
			removenode=removenode.next;
		}
		removenode.next=null;
		size--;
		return removenode;
	}
}
