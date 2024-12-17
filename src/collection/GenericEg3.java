package collection;

public class GenericEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 e3=new Example3();
		e3.set(1234.657);
		System.out.println("Double:"+e3.get());
		
		Test2<Integer,Byte,Boolean> t2=new Test2<>();
		System.out.println("Integer:"+t2.getKey(1233));
		System.out.println("Byte:"+t2.getValue((byte)110));//-128 to 127
		System.out.println("Boolean:"+t2.getValue1(true));
	}

}

interface genif3<Key,Value,Value1>{
	public Key getKey(Key k);
	public Value getValue(Value v);
	public Value1 getValue1(Value1 v1);
}
class Example3{
	private Object obj;
	public void set(Object obj) {
		this.obj=obj;
	}
	public Object get() {
		return obj;
	}
}

class Test2<Key,Value,Value1>implements genif3<Key,Value,Value1>{

	@Override
	public Key getKey(Key k) {
		// TODO Auto-generated method stub
		return k;
	}

	@Override
	public Value getValue(Value v) {
		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public Value1 getValue1(Value1 v1) {
		// TODO Auto-generated method stub
		return v1;
	}
	
}