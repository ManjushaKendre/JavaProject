package january19;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =   10;
		 int y =  20;
		  int z =  30;
		  
		  if ( x < y)
		  {
			  
			 System.out.println("Y is Smaller than X");
			 
		  }
		  
     /*  if ( x < y )
       {
    	   
    	   System.out.println("X is Smaller than Y");
    	   
    	   if (x < z)
    	   {
    		   
    		   System.out.println("X is Smaller than Z as well");
    	   }
       }
	}*/

	if ( (x<y && x<z  ))
		
	{
	 System.out.println("X is Smaller than Y and Z also");	
	}
	
	}
	
	
		  
}
