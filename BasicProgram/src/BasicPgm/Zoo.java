package BasicPgm;

import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String value = s.next();
        int z=0;
        int o=0;

        for(int i=0;i<value.length();i++)
        {
            if(value.charAt(i)=='z')
            {
                z++;
            }
            else if(value.charAt(i)=='o')
            {
                o++;
            }
        } 
        
        System.out.println(z+" "+o);
        
        if(2*z==o)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
        

	}

}
