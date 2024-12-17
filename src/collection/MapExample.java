package collection;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Float,Double> map=new HashMap<>();
		map.put(1.0f, 1000.0);
		map.put(2.0f, 2000.0);
		map.put(1.0f, 1000.0);
		map.put(3.0f, 1000.0);
		map.put(4.0f, 2000.0);
		map.put(5.0f, 3000.0);
		System.out.println(map);
		
		for(Map.Entry map1:map.entrySet()) {
			System.out.println("Key:"+map1.getKey()+" Value:"+map1.getValue());
		}
		System.out.println(map.get(map));
		System.out.println(map.containsKey(map));
		System.out.println(map.containsValue(map));
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.put(5.9f, 6008.7));
		//System.out.println(map.putAll(map));
		System.out.println(map.remove(2.0f, 2000.0));
		System.out.println(map);
		
	}

}
