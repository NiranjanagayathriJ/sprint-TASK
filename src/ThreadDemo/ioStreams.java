package ThreadDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ioStreams {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\NIRANJ\\Documents\\Welcome.txt");
		FileReader fr=new FileReader(f);
		String text="Niranjana!";
		FileWriter fw=new FileWriter("C:\\Users\\NIRANJ\\Documents\\Task1.txt",true);
		fw.write(text);
		BufferedReader bf=new BufferedReader(fr);
		String s;
		int c=bf.read(); 	// Unicode value of the character read.(w=87)
		System.out.println(c);
		char[] buffer=new char[100]; //size 100, so, reads characters upto 100. Here, ans 18.
		int charread=bf.read(buffer);
		System.out.println(charread);
		int b=bf.read(buffer, 2, 5);	//reads form buffer[2] to buffer[6] = 5
		System.out.println(b);
		//long l=bf.skip(b);			//skips b characters here b=5
		//System.out.println(l);
		boolean r=bf.ready();
		System.out.println(r);
		while((s=bf.readLine())!=null) {
			System.out.println("Read: "+s);
		}
		
		fw.write(65);
		char[] bufferw= {'H','e','l','l','o'};
		fw.write(bufferw);
		fw.write(bufferw, 0, 3);
		fr.close();
		bf.close();
		fw.close();
	}

}
