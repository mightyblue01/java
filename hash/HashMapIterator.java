/* January 04, 2017 :: utility
 * <<HashMap Iterators>>
 * Different ways to iterate through a hashmap
 * 
 * 
 */


package practice.stringbuider;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		Map<String,Integer> hm = new HashMap<>();
		hm.put("name1", 1);
		hm.put("name2", 2);
		hm.put("name3", 3);
		
		Set<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//Method 1 - foreach loop
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		
		//Method 2 - iterate for key and value separately
		
		for(String key:hm.keySet())
			System.out.println(key);
		
		for(int value:hm.values())
			System.out.println(value);
		
		//Method 3 - using iterator
		
		Iterator itr = hm.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
		
		
	}

}
