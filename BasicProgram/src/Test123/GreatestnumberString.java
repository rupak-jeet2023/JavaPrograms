package Test123;

public class GreatestnumberString {

	public static void main(String[] args) {
		
		String[] numberAsString = {"999","23","34","100","20","901","-100","1001"};
		
		GreatestnumberString gns = new GreatestnumberString();
		gns.greatestNumber(numberAsString);
		
	}
	
	public void greatestNumber(String[] number) {
		
		int maxnumber = Integer.parseInt(number[0]);
		int secondnumber = Integer.parseInt(number[1]);
		
		for(int i=2;i<number.length;i++) {
			
			int currentnumber = Integer.parseInt(number[i]);
			if(currentnumber > maxnumber) {
				secondnumber = maxnumber;
				maxnumber=currentnumber;
			}
			else if(currentnumber > secondnumber && secondnumber != maxnumber) {
				secondnumber=currentnumber;
			}
			
		}
		
		System.out.println(maxnumber+"----"+secondnumber);
		
	}

}
