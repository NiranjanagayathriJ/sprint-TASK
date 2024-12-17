package day2;

public class ProtectCard {
	protected int cardNo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.cardNo=345;
		c.print();
	}
	void print() {
		System.out.println("Your voucher No."+cardNo);
	}

}
class Customer extends ProtectCard{
	void print() {
	System.out.println("Your voucher No. from Customer child class"+cardNo);
	}
}
