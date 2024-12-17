package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDef{

	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int mark=sc.nextInt();
		Marks marks=new Marks(mark);
		marks.grade();
		}catch(InvalidMarkException e) {
			e.display();
		}catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		
		try {
			Level level=new Level(2);
			level.study(2);
		}
		catch(InvalidClassException e) {
			e.show();
		}
	}

}
class Marks{
	int mark;
	public Marks(int mark) {
		this.mark=mark;
	}
	void grade() throws InvalidMarkException {
		if(mark>60) {
			System.out.println("Pass");
		}else if(mark<60 && mark>40) {
			System.out.println("Retry");
		}else {
			throw new InvalidMarkException();
		}
	}
}

class InvalidMarkException extends Throwable{
	void display() {
		System.out.println("Fail");
	}
}

class Level{
	int standard;
	public Level(int standard) {
		this.standard=standard;
	}
	void study(int standard){
		if(standard>4) {
			System.out.println("Allowed");
		}else {
			throw new InvalidClassException();
		}
	}
}

class InvalidClassException extends RuntimeException{
	void show() {
		System.out.println("Invalid Class");
	}
}

