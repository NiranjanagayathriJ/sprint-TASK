package Day3;

public enum daysCount {
		January(30),February(28),March(31),April(30),May(31),June(30),July(31),August(31),September(30),October(31),November(30),December(31);
	
	private int day;
	daysCount(int day){
		this.day=day;
	}
	public int getDay() {
		return day;
	}
}
