package interfaceAbstract;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="A regular expression is a \r\n"
				+ "sequence of characters \r\n"
				+ "that forms a search pattern.";
		//Pattern p=Pattern.MULTILINE;
		
		Pattern p=Pattern.compile("search");
		Matcher m=p.matcher(s);
		System.out.println(m.find());
		System.out.println(m.matches());
		String r=m.quoteReplacement("not");
		System.out.println(m.replaceAll(r));
	}

}
