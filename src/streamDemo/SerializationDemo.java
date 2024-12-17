package streamDemo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Student s1=new Student("Niranjana",12);
		Student s2=new Student("Gayathri",13);
		String path="C:\\Users\\NIRANJ\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\javaProgram\\src\\streamDemo\\Objectoutput";
		FileOutputStream fos=new FileOutputStream(path,true);
	//Serialization
	
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s2);
		oos.writeObject(s1);
		
		oos.flush();
		oos.close();
		//Deserialization
		
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		for(int i=0;i<2;i++) {
			Student stu=(Student) ois.readObject();
			System.out.println("Read: "+stu);
		}
//		fis.close();
//		fos.close();
//		oos.close();
//		ois.close();
	}

}
class Student implements Serializable{
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return "Name: "+name+" ID: "+id;
	}
}