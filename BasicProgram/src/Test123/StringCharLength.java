package Test123;

public class StringCharLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "GREAT";
		
		lengthofString(value);

	}
	
	public static void lengthofString(String value) {
		
		for(int i =0; i<value.length();i++)
		{
			char ch = value.charAt(i);
			System.out.println(ch+"-"+i);
		}
		
	}

}
