package BasicPgm;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat nf = NumberFormat.getInstance();   
        
       String us = nf.getCurrencyInstance(Locale.US).format(payment);
       String india = nf.getCurrencyInstance(new Locale("en", "IN")).format(payment);
       String china = nf.getCurrencyInstance(Locale.CHINA).format(payment);

       String france = nf.getCurrencyInstance(Locale.FRANCE).format(payment);
       
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

