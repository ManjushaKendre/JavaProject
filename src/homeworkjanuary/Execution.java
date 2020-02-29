package homeworkjanuary;

public class Execution {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Car c1 = new Car("Swift","white",2019);
		
		
		c1.displyDetails();
		
		c1.exCelrate();
		
		
		c1.changeGear(4);
		
		int num = c1.applyBreaks();
		
		System.out.println("The speed of Car after applying brak is "   + num);
		
		
		
		
		Car c2 = new Car ("Hondacity","Gray",2018);
		
        c2.displyDetails();
		
		c2.exCelrate();
		
		c2.changeGear(3);
		
        int num2 = c1.applyBreaks();
		
		System.out.println("The speed of Car after applying brak is "  + num2);
		
		
		


	}

}
