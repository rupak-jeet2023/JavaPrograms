package BasicPgm;

import java.util.Scanner;

public class Factorial {
	
//	public static int IsFactorial(int num)    //without recursive method
//	
//	{
//		if(num==0)
//			return 1;
//		
//		int temp =1;
//		
//		for(int i = num; i>0;i--)
//		{
//			temp = temp * i;
//		}
//		
//		
//		return temp;
//		
//		
//	}
	
	public static int IsFactorial(int num)    //with recursive method
	{
		int temp;
		
		if(num==0)
		return 1;
		
		else
		
			temp = num * (IsFactorial(num-1));
		return temp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		System.out.println("Factorial of "+num+" is = "+IsFactorial(num));
		

	}

}
