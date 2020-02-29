package january12;

public class Execution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj = new Bike();
		
		
		obj.displayName();
		
		obj.displaySpeed(80);
		
		int result= obj.returnGear();
		System.out.println("The Number of gear is  " + result);

	}

}
