package Test123;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class NthLargestNumber {

	public static void main(String[] args) {

		int[] number = {2,4,99,10,78,99,5};
		
		//2,4,5,10,78,99
		
		int largest = nthLargest(number, 4);
		System.out.println(largest);
		
		//System.out.println(ThreadLocalRandom.current().nextInt(0,20));
		

	}

	public static int nthLargest(int[] number, int n) {
		
		int size = number.length;
		
		Arrays.sort(number);
		return number[size - n];
		
	}
	
}
