package Practice;

public class Solution {

	    public static void main (String [] args){
	        
	int n=4;
	if(n%2==0) {
			if(n<5){
	    
	        System.out.println("Not Weird 2 to 5");
			}
			else if(n<6 && n<20) {
	 
	        System.out.println("Weird 6 to 20");
	    }
	    
			else if(n>20)
	    {
	        System.out.println("Not Weird greather than 20");
	    }
	}
	else{                                                                                                                               
	    System.out.println("Weird odd");
	}
	    }
	}

