package firstDay;
import day2.*;
public class CheckProtect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sendmsg sm=new Sendmsg();
		sm.print();
	}

}
class Sendmsg extends ProtectCard{
	void print() {
		cardNo=123;
		System.out.println("Your voucher No. from Sendmsg class another package sub class"+cardNo);
	}
}
