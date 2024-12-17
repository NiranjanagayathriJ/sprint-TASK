package streamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOstream {
	public static void main(String[] args)throws IOException{
		File file=new File("C:\\Users\\NIRANJ\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\javaProgram\\src\\streamDemo\\inputFile");
		FileInputStream fis=new FileInputStream(file);
		File fileo=new File("C:\\Users\\NIRANJ\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\javaProgram\\src\\streamDemo\\outputfile");
		FileOutputStream fos=new FileOutputStream(fileo);
		int c; 
		while((c=fis.read())!=-1) {
			fos.write(c);
		}
		fis.close();
		fos.close();
	}
}
