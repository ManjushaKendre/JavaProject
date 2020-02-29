package Feb2;
import java.util.*;

public class DivideByZeroExecption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		 x  = obj.nextInt();
		
    int z = 0;
    String a = "";
    
      System.out.println("Enter Another Number:");
      
       y = obj.nextInt();
      
      try
      {
    	System.out.println(a.charAt(1));
    	
    	z = x/y;
    	
    	
    	  
      }
      
      catch (Exception e)
      {
    	  
    	  
    	  e.printStackTrace();
    	  System.out.println("Execption Occoured " + e.getMessage() );
    	  
    	  z = 5;
    	  
 }
      
      for(int i=0;i<=z;i++)
      {
    	  
    	  System.out.println(" "+i);
      }
       obj.close();
	}
}
