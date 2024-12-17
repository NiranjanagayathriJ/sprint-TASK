package firstDay;


public class customerExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		c:while(j<=2) {
		d:while(i<=20) {
	System.out.println(i);
	i++;
	if(i==17)
		break d;
	else if(i!=19)
		continue c;
	}
		System.out.println("End of loop1");
		j++;
	
	}
		System.out.println("End");
	}
}

