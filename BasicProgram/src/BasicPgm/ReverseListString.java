package BasicPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ReverseListString {

	
	
	
	
	 public List reverse(List mylist){
		    //your code should read the values from a list and reverse the values and return the reversed list.
		 	
		 	ArrayList<String> reverseList = new ArrayList<String>();
		 	
		 	for(int i=mylist.size()-1;i>=0;i--)
		 	{
		 		reverseList.add((String) mylist.get(i)); 
		 	}
		 
		 	
			return reverseList;
	}

		    @Test
		    public void test1(){
		        List<String> messageReversed = Arrays.asList("You?", "Are", "How", "Hello");
		        List<String> message = Arrays.asList("Hello", "How", "Are", "You?");
		       Assert.assertEquals(message, reverse(messageReversed));
		    }

		    @Test
		    public void test2(){
		        List<String> message = Arrays.asList("A", "B", "C", "D", "E");
		        List<String> messageReversed = Arrays.asList("E", "D", "C", "B", "A");
		        Assert.assertEquals(message, reverse(messageReversed));
		    }

			@Test
		    public void test3(){
		        List<String> message = Arrays.asList("1", "2", "3", "4", "5","6");
		        List<String> messageReversed = Arrays.asList("6", "5", "4", "3", "2", "1");
		        Assert.assertNotEquals(message, reverse(messageReversed));
		    }
}






