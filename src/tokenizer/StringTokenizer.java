package tokenizer;

public class StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("What? Don't you know me?");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken("?"));
		}
		
	}

}
