package BasicPgm;

import java.util.Scanner;

public class ReverseString {

	public static void reverse(String s)
	{
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			temp = temp + s.charAt(i);
		}
		
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.next();
		
		reverse(s);
		
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.append("Pal"));
		System.out.println(sf.reverse());
		
		
		

	}

}
