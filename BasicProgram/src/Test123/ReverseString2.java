package Test123;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value ="My name is Rupak";
		reverse(value);

	}

	public static void reverse(String value)
	{
		String[] newvalue = value.split(" ");
		
	    String rev1="";
	    
	    System.out.println(newvalue.length);
	    
	    for(int i= newvalue.length-1; i>=0;i--) {
	    	
	    	rev1 = rev1 + newvalue[i]+" ";
	    	
	    	//System.out.println(newvalue[i]);
	    	
	    }
	    
	    System.out.println(rev1);
	}
}
