package BasicPgm;

import java.util.Scanner;

public class ReverseInteger {

	  static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
//		int num = 234561;
//		int rev = 0, rem;
//		
//		while(num !=0)
//		{
//			rem = num % 10;
//			rev = (rev*10) + rem;
//			num = num/10;
//			
//			
//		}
//		
//		System.out.println(rev);
		
		
		int revvalue = reverse(sc);
		System.out.println(revvalue);
		
		//reverse(sc);
	
		
		
		
		
//		long num1=1235435431;
//		
//		StringBuffer sf = new StringBuffer(String.valueOf(num1)).reverse(); //using StringBuffer class
//		 System.out.println(sf);
	}
	
	public static int reverse(Scanner sc ) {
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();	
		
		int rem,rev =0;
		
	 while (num != 0) {
			
			rem = num % 10;
			rev = (rev*10)+rem;
			num = num /10;
				
					
		}

		return rev;
		
		
		
		
	}
}
