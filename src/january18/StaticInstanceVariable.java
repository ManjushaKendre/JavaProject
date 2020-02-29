package january18;

public class StaticInstanceVariable {
	
	int counter = 0; //instance variable
	
	static int counter1 = 0; // class variable which is static
	
	void increement()
	{
		
	 counter++;
	  counter1++;
	}
	
 void display() 
 {
	 
	System.out.println("Counter : " + counter);
	
	System.out.println("Counter1: " + counter1);
	 
 }
}
