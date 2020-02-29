package homeworkjanuary;

public class Car
    {

	String name;
	String color;  // these all 3 are  instance variables 
	int year;
	
	Car(String name,String color,int year)
	{
	 this.name = name;
	 this.color = color; // example of this keyword
	 this.year = year;
		
	}
	
	void displyDetails()
	{
	
	System.out.println("The Name of Car  is " + name);
	
	System.out.println("The Color of Car is  " + color);
	
	System.out.println("The Year of Car is  " + year);
	
	}
	void exCelrate() 
	{
	   System.out.println("The Car is very high excelrate");
	   
	}
	
	
	 void  changeGear(int num)
	{
		int num1 = num;
		
	System.out.println("The Car is changing  to gear  " + num1);	
		
	}
 int  applyBreaks()
 {
	 int speed2 = 20; // speed is  local variable 
	 
	 System.out.println("The Car is reducing speed to  " + speed2);
	 
	 return speed2;
	 
 }
}
