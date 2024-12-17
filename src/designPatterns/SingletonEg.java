package designPatterns;

public class SingletonEg {
	
	private static SingletonEg instance;
	
	private SingletonEg() {
		
	}
	
	public static SingletonEg getInstance() {
		if(instance==null) {
			instance=new SingletonEg();
		}
		return instance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonEg s1=SingletonEg.getInstance();
		SingletonEg s2=SingletonEg.getInstance();
		
		System.out.println(s1==s2);
	}

}
