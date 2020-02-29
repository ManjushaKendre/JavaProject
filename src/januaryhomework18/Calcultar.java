package januaryhomework18;

public class Calcultar
{
	
	
	int num1,num2;
	
	Calcultar(int inum1,int inum2)
	{
		num1 = inum1;
		
		num2 = inum2;
		
		System.out.println(num1);
		
		System.out.println(num2);
	}

	
	void additionOf()
	{
		int result;
		
		result = num1 + num2;
		 
		System.out.println("Addition of 2 number is " + result);
		
		
	}
	void divisionOf()
	{
		int result4;
		
		result4 = num1 / num2;
		 
		System.out.println("division of 2 number is " + result4);
		
		
	}
	void SubtractionOf()
	{
		int result2;
		
		result2 = num1 - num2;
		 
		System.out.println("Subsatraction of 2 number is " + result2);
		
		
	}
	void multiplactionOf()
	{
		int result3;
		
		result3 = num1 * num2;
		 
		System.out.println("Mutliplaction  of 2 number is " + result3);
		
		
	}
 
}
