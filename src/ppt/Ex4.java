package ppt;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {12,13,42,32,15,156,23,51,12};
		int[] keys=findMax(numbers);			//method called without object
		System.out.println("Max value:"+keys[0]);
	}
	static int[] findMax(int[]max){
	//static int findMax(int[]max){
		int[] keys=new int[3];
		int cmax=max[0];
		for(int i=1;i<max.length;i++) {
			if(max[i]>cmax)
				cmax=max[i];
		}
		keys[0]=cmax;
		return keys;
	}
}


