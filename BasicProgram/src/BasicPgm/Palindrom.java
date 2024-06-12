package BasicPgm;

import java.util.Scanner;

public class Palindrom {
	
	
	public static void ispalindrom(int num) 
	{
		//this reverse of the number should be same. example: 151,343,34543,999....
		int reverse = 0;
		int sum = 0;
		int temp;
		
		temp=num; 
		
		while(num>0)
		{
			reverse=num%10; //reminder will store in reverse variable.
			sum = (sum*10)+reverse;
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int num = sc.nextInt();
		
		ispalindrom(num);
		
	}

}
