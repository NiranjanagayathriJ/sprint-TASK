package compare;

import java.util.Scanner;

abstract public class Car {
	private String sedan;
	private int seats;
public Car() {
	this.sedan=sedan;
	this.seats=seats;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	}
	
	public String getIsSedan() {
		return sedan;
	}
	
	public int getSeats() {
		return seats;
	}
	abstract public int getMileage();
	

}

class WagonR extends Car{
	private int mileage;
	
	public WagonR() {
		super();
		this.mileage=mileage;
	}
	public int getMileage() {
		return mileage;
	}
}

class HondaCity extends Car{
	private int mileage;
	
	public HondaCity() {
		super();
		this.mileage=mileage;
	}
	public int getMileage() {
		return mileage;
	}
	
}

class InnovaCrysta extends Car{
	private int mileage;
	public InnovaCrysta() {
		super();
		this.mileage=mileage;
	}
	public int getMileage() {
		return mileage;
	}
}


