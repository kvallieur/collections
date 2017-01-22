package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> hashMap1 = new LinkedHashMap<Integer,String>();
		Map<Integer,String> hashMap2 = new TreeMap<Integer,String>();
		testMap(hashMap2);
	}
		
		
	public static void testMap(Map<Integer,String> map)	{
		map.put(11,"eleven");
		map.put(7,"seven");
		map.put(1,"one");
		map.put(9,"nine");
		map.put(15,"fifteen");
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key+": " +value);
		}
	}	
}
