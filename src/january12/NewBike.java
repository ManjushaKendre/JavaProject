package january12;

public class NewBike {
	
	String name;
	int speed;
	int gears;
	
	NewBike(String iname,int ispeed,int igears)
	{
	 name = iname;
	 speed = ispeed;
	  gears = igears;
	  
	}
	
	void displayName()
	{
		
		System.out.println("The Name of bike is  " + name);
	}
 void displaySpeed()
 {
	 
	 
	 System.out.println("The Maximum speed of bike is  " + speed);
 }
 
 int returnGears()
 {
	 return gears;
 }
}
