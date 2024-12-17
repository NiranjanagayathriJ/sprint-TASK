package interfaceAbstract;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aadhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String regex="[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}";
		Pattern aadhar=Pattern.compile(regex);
		System.out.println("Enter your Aadhar Number:");
		String input=sc.nextLine();
		Matcher m=aadhar.matcher(input);
		if(m.matches()==true) 
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		System.out.println(m.toMatchResult());
		
		if (m.matches()) {  // Or m.matches(), depending on your use case
		    System.out.println("Matched substring: " + m.group());
		    System.out.println("Start index: " + m.start());
		    System.out.println("End index: " + m.end());
		}

	}
}
