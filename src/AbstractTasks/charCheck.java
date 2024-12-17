package AbstractTasks;

import java.util.Scanner;

public class charCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
			System.out.println("Character is Alphabet");
		}
		else {
			System.out.println("Character is not alphabet");
		}
	}
	}
}
