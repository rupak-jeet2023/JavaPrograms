package Test123;

public class StringSorting {

	public static void main(String[] args) {
		 	
			String value ="My name is rupak ";
	        sortingValue(value);

	}
	
public static void sortingValue(String value){
	    
	    String[] newvalue = value.split(" ");
	    
	    String revvalue="";
	    
	    String rev ="";
	    
	    for(int i=0;i<newvalue.length;i++)
	    {
	        
	        for(int j=i+1; j<newvalue.length;j++){
	            if(newvalue[j].length()>newvalue[i].length()){
	                revvalue = newvalue[j];
	                newvalue[j] = newvalue[i];
	                newvalue[i] = revvalue;
	            }
	        }
	        
	        rev = rev+ newvalue[i]+ " "; 
	        
	    }
	    
	    System.out.println(rev);
	    

	    
	}

}
