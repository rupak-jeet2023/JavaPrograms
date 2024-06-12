package BasicPgm;

import java.util.Scanner;

public class SplitHouses {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();

	        String h = s.next();

	        if(h.contains("HH"))
	        {
	            System.out.println("NO");
	        }
	        else
	        {
	            h=h.replace('.', 'B');
	            System.out.println("YES");
	            System.out.println(h);
	        }

	}

}
