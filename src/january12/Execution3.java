package january12;

public class Execution3 {

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub
		
		NewBike obj = new NewBike("LMl",125,9);
		obj.displayName();
		obj.displaySpeed();
		
		int result = obj.returnGears();
		System.out.println("The Speed of Bike is  " + result);
		

	}

}
