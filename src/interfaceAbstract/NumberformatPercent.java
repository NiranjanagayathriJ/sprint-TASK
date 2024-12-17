package interfaceAbstract;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberformatPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale ld=new Locale("","");
		displayPercentage(Locale.ROOT);
	}
	public static void displayPercentage(Locale m) {
		float i=0.2345f;
		NumberFormat n=NumberFormat.getPercentInstance(m);
		String per=n.format(i);
		System.out.println("Percentage:"+per);
	}
}
