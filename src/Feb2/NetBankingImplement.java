package Feb2;

public abstract class NetBankingImplement implements NetBanking {
	
	public void setUserName()
	{
		
		System.out.println("You can set your username");
	}
   
	public  void neft() {
		
	System.out.println("You can Transfer money via neft");
	
		}
	
	public void electricity()
	
	{
		
		System.out.println("pay Your electricity bill");
		
	}
	
	public void gas()
	{
		
		System.out.println("Bool your gas cylinders online");
	}
}
