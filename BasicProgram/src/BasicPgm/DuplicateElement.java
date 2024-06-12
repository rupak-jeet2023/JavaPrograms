package BasicPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		//String[] name = {"Python","Selenium","Java","Ruby","C","MongoDB"};
		
		//1. by comparing each element. ---- Worst approach
//		for(int i=0; i<name.length;i++)  
//		{
//			for(int j=i+1;j<name.length;j++)
//			{
//				if(name[i].equals(name[j]))
//				{
//					System.out.println("Duplicate Element is "+name[i]);
//				}
//			}
//		}
//		
//		
//		int[] num = {50,10,20,30,40,10,44,30};
//		int temp;
//		
//		for(int i=0; i<num.length;i++)
//		{
//			for(int j=i+1;j<num.length;j++)
//			{
//				if(num[i]==num[j])
//				{
//					System.out.println("Duplicate number is " + num[i]);
//				}
//				if(num[i]<num[j])
//				{
//					temp= num[i];
//					num[i]=num[j];
//					num[j]=temp;
//					
//				}
//			}
//		}
		
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.println(num[i]);
//		}
//		System.out.println();
		
		
//		System.out.println("*************************");

	
	
	//2. Hashset : it stores unique values.
	
//		HashSet<String> store = new HashSet<String>();  
//	
//	/*Set is the interface and Hashset is the class. Hashset is implement Set Interface. Child class object
//	can be refered by Parent Interface reference variable. */
//		int c=0;
//		
//		for(int i=0; i<name.length;i++)
//		{
//			if(store.add(name[i]) ==  false)	// to get the duplicate values
//				/* to get the unique values if(store.add(name[i] ==  true)
//					{
//						System.out.println("Duplicate Element is "+name[i]);
//					} */
//			{
//				System.out.println("Duplicate Element is "+name[i]);
//				c++;
//			}
//			
//			
//		}
//		if(c==0)
//		{
//			System.out.println("No duplicate element");
//		}
		
		
	//3. Using HashMap. 
		
		 ArrayList<String> value = new ArrayList<String>(Arrays.asList("A","B","C","D","A","C","E"));
		 
		 ArrayList<String> dupelement = new ArrayList<String>();
		 
		 int c=0;
				    
				    for(int i=0;i<value.size();i++){
				        for(int j=i+1;j<value.size();j++){
				            if(value.get(i).equalsIgnoreCase(value.get(j)))
				            {
				            	dupelement.add(value.get(i));
				            	c++;
				            }
				        }
				    }
				    
				    if(c==0) {
				    	System.out.println("There is no duplicate element present");
				    }
				    else
				    {
				    	System.out.println("Duplicate elements are "+ dupelement);
				    }
				    
	}
}
