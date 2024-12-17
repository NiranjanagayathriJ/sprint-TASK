package AbstractTasks;

public class garbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		garbageCollection g1=new garbageCollection();
		g1=null;
		garbageCollection g2=new garbageCollection();
		g2=null;
		garbageCollection g3=new garbageCollection();
		g3=g2;
		System.out.println(g3);
		new garbageCollection();
		System.gc();
		
	}
	public void finalize() {
		System.out.println("Object is garbage collected");
	}

}
