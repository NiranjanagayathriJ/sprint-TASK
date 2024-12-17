package collection;

public class GenericEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e1=new Example2();
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
		 System.out.println("double:"+t1.getValue1(123456.79));//getKey1
	}

}
class Example2{
	private Object obj;
	
	public void set(Object obj) {
		this.obj=obj;
	}
	public Object get() {
		return obj;
	}
}

interface genIF2<K,V,K1>
{
	public K getKey(K k);
	public V getValue(V v);
	public K1 getKey1(K1 k1);
}

class Test1<key,value,Key1>implements genIF2<key,value,Key1>
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
	public Key1 getKey1(Key1 k1) {
		// TODO Auto-generated method stub
		return k1;
	}
	}


