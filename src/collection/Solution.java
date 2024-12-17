package collection;

				import java.io.*;
				import java.util.*;
				import java.text.*;
				import java.math.*;
				import java.util.regex.*;

				public class Solution{
					public static void main(String[] args){
						
						Scanner in = new Scanner(System.in);
						int testCases = Integer.parseInt(in.nextLine());
				        String regex="^<([A-Za-z][A-Za-z0-9]*)>(.*?)</\\1>$";
				            Pattern pattern=Pattern.compile(regex);
						while(testCases>0){
							String line = in.nextLine();
							Matcher matcher=pattern.matcher(line);
				            boolean foundValidTag=false;
				            while(matcher.find()){
				                System.out.println(matcher.group(2));
				                foundValidTag=true;
				            }
							if(!foundValidTag){
				                System.out.println("None");
				            }
							testCases--;
						}
					}
		}





