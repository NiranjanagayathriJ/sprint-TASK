package ppt;

public class testcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {12,13,42,32,15,156,23,51,12};
		int[] keys=findMax(numbers);
		System.out.println("Max value:"+keys);
	}
	static int[] findMax(int[]max){
	//static int findMax(int[]max){
		int[] keys=new int[3];
		int cmax=keys[0];
		for(int i=1;i<keys.length;i++) {
			if(keys[i]>cmax)
				cmax=keys[i];
		}
		keys[0]=cmax;
		return keys;
	}


}
