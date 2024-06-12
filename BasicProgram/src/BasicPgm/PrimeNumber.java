package BasicPgm;

import java.util.Scanner;

public class PrimeNumber {

	public static void Prime(int num) {
	
	int c=0;
	if(num>1)
	{
		//boolean prime = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				c++;
			}
		}
		
		if(c!=0)
		{
			System.out.println("Not Prime");
			
		}
		else 
		{
			System.out.println("Prime");
			
		}
			
		}
		
//		for(int i =2;i<num;i++)
//		{
//			if(num%i==0)
//			{
//				prime = false;
//				System.out.println(i);
//				break;
//			}
//		}
//		System.out.println(prime);
//		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Prime(num);
	}
	
	
	

}

