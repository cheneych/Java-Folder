package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		testmap(treemap);
		
	}
	
	public static void testmap(Map<Integer, String> map)
	{
		map.put(2,"Hello");
		map.put(10,"Bye");
		map.put(6,"Tata");
		map.put(9,"Wow");
		map.put(8,"Tada");
		
		for (Integer key:map.keySet())
		{
			String value = map.get(key);
			System.out.println(key+ " : " +value );
		}
		
		
		
		
		
		
//		String text = map.get(8);
//		System.out.println(text);
//		
//		for(Map.Entry<Integer, String> entry: map.entrySet())
//		{
//			int key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key+ " : " +value );
//			
//		}
		

	}

}
