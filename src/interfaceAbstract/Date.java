package interfaceAbstract;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println("date:"+d.getDate()+" Hours:"+d.getHours());
		LocalDate ld=LocalDate.now();
		System.out.println("date:"+ld+" Era: "+ld.getEra());
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt.minusDays(2));
		System.out.println(ldt.toLocalDate());
		System.out.println(ldt.plusMinutes(60));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM-dd-yy");
		String f1=ldt.format(dtf);
		System.out.println("Formatted to "+f1);
		

	}

}
