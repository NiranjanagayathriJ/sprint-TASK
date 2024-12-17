package AbstractTasks;

public class bankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank=new SBI();
		bank.setAccNo(3425);
		bank.deposit();
		bank.withdrawal();
	}

}
abstract class Bank{
	private int accno;
	abstract void deposit();
	abstract void withdrawal();
	public void setAccNo(int accno) {
		this.accno=accno;
	}
	public int getAccNo() {
		return accno;
	}
	}
class SBI extends Bank{
	void deposit() {
		int deposit=5500;
		System.out.println("AccNo:"+getAccNo());
		System.out.println("Deposit Rs."+deposit);
	}
	void withdrawal() {
		int withdrawal=2000;
		System.out.println("Withdrawal Amount Rs."+ withdrawal);
	}
}