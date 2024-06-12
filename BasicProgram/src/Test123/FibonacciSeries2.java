package Test123;

public class FibonacciSeries2 {

	static int n1 = 0;
	static int n2 = 1;
	
	public static void main(String[] args) {
		
		System.out.print(n1+" "+n2);	
		
		findf(10);
	}
	
	public static void findf(int n) {

		if(n>0) {
				
		 int sum = n1+n2;
		 System.out.print(" "+sum);
		 
		 n1=n2;
		 n2=sum;
		 
		 findf(n-1);
		 
		}
	}

}
