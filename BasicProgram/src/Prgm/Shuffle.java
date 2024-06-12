package Prgm;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ge68hjk@3hjm*({";
				
		String word="";
		String number="";
		String sc="";
		
		
		for(char ch : s.toCharArray())
		{
			if(Character.isLetter(ch)) {
				
				word = word+ch;
			}
			else if(Character.isDigit(ch)) {
				number = number+ch;
			}
			else
			{
				sc=sc+ch;
			}
		}
		
		System.out.println(word);
		System.out.println(number);
		System.out.println(sc);
		

	}

}
