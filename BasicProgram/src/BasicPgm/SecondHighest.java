package BasicPgm;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		print2largest();
	}

	public static void print2largest() {
		
//		System.out.println("Enter the nth value:");
//		
//		int n = sc.nextInt();
		
		int arr[] = {1,2,5,4,5,5,6,10,7,100,50,50,88,88};
		
		// 1 2 4 5 5 5 6 7 10 50 50 88 88 100
		
		int size = arr.length;
		
		System.out.println(size);
		
		Arrays.sort(arr);
		
		
		//if(n<=size) {
		for(int i= size-2; i>=0;i--) 
		{
			if(arr[i]!= arr[size-1] )
			{
				System.out.println(arr[i]+" is the 2nd highest number");
				break;
			}
		}
		}
//		else
//		{
//			System.out.println("Please enter the value less than or equal to array size");
//		}
//	}	

}
