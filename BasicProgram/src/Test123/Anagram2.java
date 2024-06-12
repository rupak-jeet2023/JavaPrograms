package Test123;

import java.util.HashMap;
import java.util.Map;

public class Anagram2 {

	public static void main(String[] args) {
		
		String s1 ="Silent   ".toLowerCase().replaceAll("\\s", "");
		String s2 ="List en".toLowerCase().replaceAll("\\s", "");
		
		
		isAnagram(s1,s2);
		
	}
	
	public static void isAnagram(String s1, String s2)
	{
		int l1 = s1.length();
		int l2 = s2.length();
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		if(l1 != l2) {
			System.out.println("Not anagram");
		}
		else
		{
			char[] ch1 = s1.toCharArray();
			for (char value1 : ch1) {
				if (!map1.containsKey(value1)) {
					map1.put(value1, 1);
				} else {
					map1.put(value1, map1.get(value1) + 1);
				}
				}
			
			char[] ch2 = s2.toCharArray();
			for (char value2 : ch2) {
				if (!map2.containsKey(value2)) {
					map2.put(value2, 1);
				} else {
					map2.put(value2, map2.get(value2) + 1);
				}
				}
			
			System.out.println(map1+"&&&"+map2);
			
			if(map1.equals(map2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram 1");
			}
			
		}
		
		
		
	}

}
