package Test123;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentifySpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sp = "jdhfjs$@9343mf$3483$fg%hh&&*%";
		
		spcialCharactercheck(sp);

	}
	
	public static void spcialCharactercheck(String sp) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String newsp ="";	
		
		
		char[] spchar = sp.toCharArray();
		
		for(char ch : spchar) {
			if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
				
				newsp = newsp + ch;
				
				
				
				if(!map.containsKey(ch)) {
					map.put(ch, 1);
				}
				else
				{
					map.put(ch, map.get(ch)+1);
				}
				
			}
		}
		
		System.out.println(newsp);
		
		System.out.println(map);
				
		Iterator<Character> it = map.keySet().iterator();
		
		while(it.hasNext()) {
				Character value = it.next();
				
				System.out.println(value+" = "+ map.get(value));
				
		}
		
		
		
		
		
	}

}
