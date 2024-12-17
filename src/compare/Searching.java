package compare;

public class Searching {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=12;
		a[1]=11;
		a[2]=14;
		a[3]=5;
		a[4]=14;
		a[5]=13;
		int c=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==14) {
				System.out.println("Present at Index "+i);
				c++;
			}
		}
		if(c>0)
		System.out.println("Element 14 found");
		else
			System.out.println("Not found");
	}

}
