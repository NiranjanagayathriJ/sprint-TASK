package collection;

public class GenericEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1=new Example1();
		e1.set("niranjana");
		System.out.println("String:"+e1.get());
		e1.set('a');
		System.out.println("char:"+e1.get());
		e1.set(12300433);
		System.out.println("integer:"+e1.get());
		e1.set(12343202487L);
		System.out.println("Long:"+e1.get());
		e1.set((short)1);
		System.out.println("Short:"+e1.get());
		
		Test<Float,Character,Double>t1=new Test<>();
		 System.out.println("float:"+t1.getKey(12.435f));
		 System.out.println("character:"+t1.getValue('a'));
		 System.out.println("double:"+t1.getValue1(123456.79));
	}

}
class Example1{
	private Object obj;
	
	public void set(Object obj) {
		this.obj=obj;
	}
	public Object get() {
		return obj;
	}
}

interface genIF<K,V,V1>
{
	public K getKey(K k);
	public V getValue(V v);
	public V1 getValue1(V1 v1);
}

class Test<key,value,value1>implements genIF<key,value,value1>
{
	public value getValue(value v) {
		return v;
	}
	@Override
	public key getKey(key k) {
		// TODO Auto-generated method stub
		return k;
	}
	@Override
	public value1 getValue1(value1 v1) {
		// TODO Auto-generated method stub
		return v1;
	}
}
