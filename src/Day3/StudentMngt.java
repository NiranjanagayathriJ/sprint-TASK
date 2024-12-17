package Day3;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentMngt {
	
	private static HashSet<Student> stu=new HashSet<>();

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		a:for(int i=1;i<=4;i++) {
		 Student s=new Student();
		 boolean validInput=false;
		 
		 while(!validInput) {
		System.out.println("Enter Student Name:");
		s.name=sc.next();
		System.out.println("Enter pnr ID:");
		s.pnr=sc.next();
		if(isDuplicatePNR(s.pnr)) {
			System.out.println("PNR already exists. Starting over.");
			continue;
		}
		
		System.out.println("Enter date of birth(YYYY-MM-DD):");
		String dob=sc.next();
		if(!isValidDOB(dob)) {
			System.out.println("Invalid date format. Accepts students with DOB after 1999-01-01");
			continue;
		}
		s.DOB=dob;
		
		s.email=getValidEmail(sc);
		if(s.email==null) {
			System.out.println("Invalid email format. Starting over.");
			continue;
		}
		System.out.println("Enter password:");
		String password=sc.next();
		if(password==null) {
			System.out.println("Password must be at least 5 characters long and contain a special character. Starting over.");
			continue;
		}
		s.password=password;
		
		
		System.out.println("Enter GPA:");
		s.GPA=sc.nextInt();
		if(s.GPA<=7) {
			System.out.println("minimum GPA of 7 is expected");
			continue a; 
		}
		validInput=true;
		 }
		course cc=null;
		while(cc==null) {
		System.out.println("Enter Course: 1.DBT 2.REACT 3.ANGULAR 4.REST 5.SPRING 6.HIBERNATE");
		int select=sc.nextInt();
		
		switch(select) {
		
		case 1:
			cc=course.DBT;
			//System.out.println("alotted");
			break;
		
		case 2:
			cc=course.REACT;
			break;
			
		case 3:
			cc=course.ANGULAR;
			break;
			
		case 4:
			cc=course.REST;
			break;	
			
		case 5:
			cc=course.SPRING;
			break;
			
		case 6:
			cc=course.HIBERNATE;
			break;
			
		default:
			System.out.println("Choose valid course");
			continue;
			
		}
		if(!cc.ok()) {
			System.out.println("Course Full. Choose Another course please");
			cc=null;
			//continue ;
			 		}
		
		}	
	
		ContactDetails c=new ContactDetails();
		System.out.println("Enter your residing city:");
		c.city=sc.next();
		System.out.println("Enter your State:");
		c.state=sc.next();
		System.out.println("Enter phone number:");
		c.phone=sc.nextLong();
		stu.add(s);
		s.contactDetails=c;
		System.out.println("Applied successfully");
	}
			
		
		}

	private static boolean isValidpw(String password) {
		return password.length()>=5 && Pattern.compile("[@#$%*]").matcher(password).find();
	}
	private static boolean isValidDOB(String dob) {
		if(!dob.matches("\\d{4}-\\d{2}-\\d{2}")) {
			return false;
		}
		LocalDate date=LocalDate.parse(dob,DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate minDate=LocalDate.of(1999, 01, 01);
		return !date.isBefore(minDate);
	}
	
	private static boolean isValidEmail(String email) {
		return Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$").matcher(email).matches();
	}
	
	private static String getValidEmail(Scanner sc) {
		String email;
		do {
		System.out.println("Enter email:");
		email=sc.next();
		if(isValidEmail(email)) {
			return email;
		}else {
			System.out.println("Invalid email format. Please try again.");
		}
		}while(true);
		
}
	private static String getValidPassword(Scanner sc) {
		String password;
		do {
			System.out.println("Enter password:");
			password=sc.next();
			if(isValidpw(password)) {
				return password;
			}else {
				System.out.println("Password must be at least 5 characters long and contain a special character. Please try again.");
			}
		}while(true);
	}
	private static boolean isDuplicatePNR(String pnr) {
		for(Student s:stu) {
			if(s.pnr.equals(pnr)) {
				return true;
			}
		}
		return false;
	}
	}

class Student{
	String pnr;
	String name;
	String email;
	String DOB;
	String emailregex="[A-Z]|[a-z]{5,10}";
	String password;
	double GPA;
	course co;
	ContactDetails contactDetails;
	 
	Student(String pnr,String name,String email,String DOB,String password,double GPA,course co){
		this.pnr=pnr;
		this.name=name;
		this.email=email;
		this.DOB=DOB;
		this.password=password;
		this.GPA=GPA;
		this.co=co;
		
	}
	Student(){
		pnr="";
		name="";
		email="";
		DOB="";
		password="";
		GPA=0;
		co=null;
		 
	}
	void display() {
		System.out.println("pnr ID:"+pnr);
		System.out.println("Name:"+name);
		if(email.contains(emailregex))
		System.out.println("email ID:"+email);
		else
			System.out.println("Invalid Email");
		System.out.println("password:"+password);
		System.out.println("GPA:"+GPA);
		
		
	}
	
}
class ContactDetails{
	String city;
	String state;
	long phone;
	
	ContactDetails(String city,String state,long phone){
		this.city=city;
		this.state=state;
		this.phone=phone;
	}
	ContactDetails(){
		city="";
		state="";
		phone=0;
	}
	void personal() {
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		System.out.println("Phone No.:"+phone);
	}
}


