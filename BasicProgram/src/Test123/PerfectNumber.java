package Test123;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPerfct(496);

	}
	
	public static void isPerfct(int n) {
		
		//boolean isPerfect = false;
		
		int p=0;
		
		if(n>0) {
			
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					p = p+i;
				}
				
			}
			
			if(p==n) {
				System.out.println("perfect number");
			}
			else
				System.out.println("not perfect");
		}
		
		
		
		
	}

}
