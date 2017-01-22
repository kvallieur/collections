package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(11,"eleven");
		hashMap.put(7,"seven");
		hashMap.put(1,"one");
		hashMap.put(9,"nine");
		hashMap.put(15,"fifteen");
		
		String text = hashMap.get(11);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+": " +value);
		}
	}
}
