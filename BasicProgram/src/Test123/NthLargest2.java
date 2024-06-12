package Test123;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class NthLargest2 {

	public static void main(String[] args) {
		
		int[] arr = {10,23,11,15,20,15,23,20,30,9};

		findN(arr);
		
	}
	
	public static void findN(int[] arr) {
		
		Arrays.sort(arr);
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int arry : arr) {
			set.add(arry);
		}
		
		System.out.println(set);
		
		System.out.println(set.pollFirst()+" "+set.pollLast() );
		
		  int nthLargest = 0 ;
	        for (int i = 1; i < 2; i++) {
	            nthLargest = set.pollLast();
	        }
	        
	        System.out.println("The " + 2 + "th largest number is: " + nthLargest);
		
		
		
		
		
						
	}

}
