package BasicPgm;

public class ReverseNumberwithRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursionReverse(123);
		recursionReverse(23123);
		recursionReverse(100);
		recursionReverse(10);
		recursionReverse(9);
		recursionReverse(123000456);

	}
	
	public static void recursionReverse(int a) {
		
		if(a<=9) {
			System.out.println(a);
		}
		else
		{
			System.out.print(a%10);
			recursionReverse(a/10);
		}
		
	}

}
