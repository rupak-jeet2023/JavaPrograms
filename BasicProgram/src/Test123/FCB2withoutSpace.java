package Test123;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class FCB2withoutSpace {

	public static void main(String[] args) {
		
		String value ="FIRST CITIZEN BANK";
		
		Integer y =7;
		System.out.println(y.parseInt("23"));
		System.out.println(y);
		
		printEachCharacter(value);

	}
	
	public static void printEachCharacter(String value) {
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		
		String[] newvalue = value.split(" ");
		
		for(String nv : newvalue)
		{
			char[] ch = nv.toCharArray();
			
			for(char newch : ch) 
			{
				if(!map.containsKey(newch))
				{
					map.put(newch, 1);
				}
				else
				{
					map.put(newch, map.get(newch)+1);
				}
				
			}
			
		}
		
//		Iterator<Character>	it = map.keySet().iterator();
//		
//		while(it.hasNext()) {
//			
//			Character eachchar = it.next();
//			
//			System.out.println(eachchar+" = "+map.get(eachchar));
//			
//		}
		
		Iterator<Entry<Character, Integer>> it =	map.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Entry<Character, Integer> pair = it.next();
			
			System.out.println("key = "+pair.getKey()+" and value is "+pair.getValue());
			
		}
		
	}

}
