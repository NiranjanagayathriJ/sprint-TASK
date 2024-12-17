package ppt;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[][]= {{1,3},{2,4}};		//{1,3}->n[0]  {2,4}->n[1]
		for(int i=n.length-1;i>=0;i--) {
			for(int y:n[i]) {			//{2,4}->{n[0],n[1]}
										//{1,3}->{n[0],n[1]}
				System.out.print(y);
			}
		}
	}

}
			