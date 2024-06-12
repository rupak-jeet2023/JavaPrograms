package Test123;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FCB1 {

	public static void main(String[] args) {
		
		String value ="FIRST CITIZEN BANK";
		
		 printEachCharacter(value);
		
		

	}
	
	public static void printEachCharacter(String value) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] character = value.toCharArray();
		
		for(char ch : character) {
			
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		
		Iterator<Character>	it = map.keySet().iterator();
		
		while(it.hasNext()) {
			
				Character newvalue= it.next();
				
				System.out.println(newvalue+" = "+map.get(newvalue));
			
		}
				
		
	}

}
