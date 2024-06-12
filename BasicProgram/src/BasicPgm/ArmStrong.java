package BasicPgm;

import java.util.Scanner;

public class ArmStrong {
	
	public static void ArmStrong(int num)
	{
		int r =0;
		int sum =0;
		int temp;
		
		temp=num;
		
		while(num>0)
		{
			r = num%10;
			sum = sum + (r*r*r);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not ArmStrong");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		ArmStrong(num);

	}

}
