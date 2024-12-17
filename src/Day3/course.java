package Day3;

public enum course {
	DBT(1),REACT(1),ANGULAR(2),REST(1),SPRING(1),HIBERNATE(2);
	
	private int choice;
	private int capacity;
	course(int choice){
		this.choice=choice;
		this.capacity=0;
	}
	public int getchoice() {
		return choice;
	}
	public int getcapacity() {
		return capacity;
	}
	
	public boolean ok() {
		if(capacity<choice) {
			capacity++;
			System.out.println("Alloted");
			return true;
		}
		else 
		return false;
	}
	
}
