package interfaceAbstract;

import java.util.StringTokenizer;

public class Tokenizers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example 1:");
		StringTokenizer s=new StringTokenizer("A regular expression is a ?sequence of characters ?that forms a search pattern.");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken("?"));
		}
		System.out.println();
		System.out.println("Example 2:");
			StringTokenizer s1=new StringTokenizer("A regular expression is a ?sequence of characters ?that forms a search pattern.","s");
		while(s1.hasMoreTokens()) {
			System.out.println(s1.nextToken("?"));
		}
		System.out.println();
		System.out.println("Example 3:");
		StringTokenizer s2=new StringTokenizer("A regul8ar expression8 is a ?sequence of characters ?that8 forms a sear8ch pattern.","8");
		while(s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
		}
		
		StringTokenizer s3=new StringTokenizer("A regular expression is a ?sequence of characters ?that forms a search pattern.","?");
		while(s3.hasMoreElements()) {
			System.out.println(s3.nextToken());
		}
	}

}
