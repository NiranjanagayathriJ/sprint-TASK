package AbstractTasks;

public class HasARelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time("6.00 AM");
		Passenger p=new Passenger("NIRANJANA",2,0,t);
		p.display();
	}

}
class Passenger{
	private String name;
	private int anum;
	private int cnum;
	private Time time;
	
	Passenger(String name,int anum,int cnum,Time time){
		this.name=name;
		this.anum=anum;
		this.cnum=cnum;
		this.time=time;
	}
	void display() {
		System.out.println("Passenger Name:"+name+" Number of Adults:"+anum+" Number of children:"+cnum+" "+time);
	}
}

class Time{
	private String time;
	
	Time(String time){
		this.time=time;
	}
	public String toString() {
		return "Time of travel: "+time;
	}
}

	
