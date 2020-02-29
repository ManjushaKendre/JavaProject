package Feb2;

public class FinallyExample {

	private static int z;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 10;
		int y = 20;
		try 
		{
			z = x/y;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception : " + e.getMessage());
			
		}
      finally
      {
    	System.out.println("I am in Finally Block");  
    	  
      }
	
	}
	

}
