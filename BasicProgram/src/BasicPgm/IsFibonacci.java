package BasicPgm;

import java.util.Scanner;

public class IsFibonacci {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		isfibonacci();
		

	}
	
	public static void isfibonacci() {
		
		int  n = sc.nextInt();
		int a=0,b=1,sum=0;
		
		boolean isfbnc = false;
		
		if(n==0 ) {
			isfbnc = true;
			System.out.println(n+" is a fbnc");
		}
		else
		{
			
			for(int i=1;i<=n;i++) 
			{
				sum=a+b;
							
				if(sum==n) {
					isfbnc= true;
					System.out.println(n+" is a fbnc "+a+" "+b);
					break;
				}
				
				a=b;
				b=sum;
				
			}
		}
		
		
		if(isfbnc==false)
			System.out.println("not fbnc");
		
		
	}

}
