package BasicPgm;

import java.util.Scanner;

public class StringPalindrome {

	public static void isstring(String name)
	{
		
		String temp;
		String r="";
		
		temp=name;
		
		for (int i=name.length()-1;i>=0;i--)
		{
			r =  r + name.charAt(i);
			
		}
		System.out.println(temp);
		System.out.println(r);
		
		if(temp.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.next();
		
		isstring(name);
	}

}
