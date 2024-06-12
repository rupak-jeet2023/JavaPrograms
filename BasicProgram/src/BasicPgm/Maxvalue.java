package BasicPgm;

import java.util.Scanner;

public class Maxvalue {
	
	public static int max_of_2(int a, int b)
	{
		
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	}
	
	public static int max_of_3(int x, int y, int z)
	{
		return max_of_2(x,max_of_2(y,z));
	}
	
	public static int max_of_5(int x, int y, int z, int j, int k)
	{
		return max_of_3(x,max_of_2(y,z),max_of_2(j,k));
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(max_of_3(x,y,z));
		
		System.out.println(max_of_5(x,y,z,j,k));

	}

}
