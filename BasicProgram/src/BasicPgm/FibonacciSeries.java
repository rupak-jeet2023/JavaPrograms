package BasicPgm;

public class FibonacciSeries {

	static int a=0, b=1, c;
	public static void main(String[] args) {
//		int num =13;
//		int n1=0,n2=1,sum=0;
//		
//		for(int i=0;i<10;i++)
//		{
//			if(num==sum)
//			{
//				break;
//			}
//			else
//			{
//			sum=n1+n2;
//			n1=n2;
//			n2=sum;
//			}
//			
//		}
//		System.out.println(n1 +" "+n2);
		
		System.out.print(a+" "+b);
		printfb(10);

	}
	
	public static void printfb(int i) {
		
		if(i>=1) {
			
			c= a+b;
			System.out.print(" "+c);
			a=b;
			b=c;			
			printfb(i-1);   
		}
		
	}

}
