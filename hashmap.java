package GamblingSimulation;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
		hashmap.put(1, 10);
		hashmap.put(2, 20);
		hashmap.put(3, 30);
		hashmap.put(4, 40);
		hashmap.put(5, 50);
		hashmap.put(6, 60);
		
		int maxno=0;
		int maxkey=0;
		
		for(java.util.Map.Entry<Integer, Integer> m:hashmap.entrySet() ) {
			System.out.println();
			System.out.println("key:"+m.getKey());
			System.out.println("value:"+m.getValue());
			System.out.println();
			int value=(int) m.getValue();
			
        if(maxno<value) {
				maxno=value;
				maxkey=(int) m.getKey();
			}
		}
		
		
		System.out.println("maximum value is:"+maxno+" on key "+maxkey);
		
}
}
