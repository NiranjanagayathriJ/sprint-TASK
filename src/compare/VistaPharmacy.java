package compare;

import java.time.LocalDate;
import java.util.*;

public class VistaPharmacy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the medicine code:");
		String medicine=sc.next();
		if(!(medicine.length()==6)) {
		System.out.println(medicine.length()+" is an invalid length");
		 throw new InvalidLengthException();
		}
		String sub1=medicine.substring(0, 2);
		String sub2=medicine.substring(2, 4);
		int s2=Integer.parseInt(sub2);
		String sub3=medicine.substring(4, 6);
		int s3=Integer.parseInt(sub3);
		if(!sub1.equals("VS")) {
			System.out.println(medicine+" is an invalid medicine code");
			throw new InvalidMedException();
		}
		if(!(s2>=01 &&s2<=06)) {
			System.out.println(s2+" is an invalid manufactured month");
			throw new InvalidMonthException();
		}
		if(!(s3>=01 &&s3<=18)) {
			System.out.println(s3+" is an invalid expiry duration");
			throw new InvalidExpException();
		}
			System.out.println("Manufactured date "+sub2+"/2021");
			int exp=s2+s3,rem=0;
			if(exp<=12)
				System.out.println("Expiry date "+String.format("%02d", exp)+"/2021");
			else {
				rem=exp-12;
				System.out.println("Expiry date "+String.format("%02d", rem)+"/2022");
			}
			// expired/not
			int currentMon=07;
			int currentYear=2021;
			if(exp>=currentMon && currentYear==2021)
				System.out.println("The medicine is not expired");
			else
				System.out.println("The medicine is expired");

		
	}catch(InvalidLengthException e) {
		e.printStackTrace();
	}
	}
}
class InvalidLengthException extends Exception{
	public InvalidLengthException() {
		System.out.println("<length> is an invalid length");
	}
}
class InvalidMedException extends Exception{
	public InvalidMedException() {
		System.out.println("<medicine code> is an invalid medicine code");
	}
}
class InvalidMonthException extends Exception{
	public InvalidMonthException() {
		//super();
		System.out.println("<month> is an invalid manufactured month");
	}
}
class InvalidExpException extends Exception{
	public InvalidExpException() {
		//super();
		System.out.println("<month> is an invalid expiry duration");
	}
}