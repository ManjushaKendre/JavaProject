package Feb8;
public class ArrayDeclarations {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = new int[6]; // we cannot delete any element in array thats the size of array will be Reduce
		
		int[] newNumbers = new int[4]; //we have to create a new array if we want to reduce the size of array
		int j = 0;
		int i = 0;
		int index = 2;
		numbers[0] = 12;
		numbers[1] = 15;
		numbers[2] = 13;
		numbers[3] = 20;
		numbers[4] = 90;
		numbers[5] = 10;
		numbers[6] = 23;
		
		for( i=0; i < numbers.length; i++)
		{
			if(index == i)
			{
				continue;
			}
		
			
			newNumbers[j] = numbers[i];
			j++;
			
			for( i=0; i < numbers.length; i++)
			{
		System.out.println(newNumbers[i]);
		
			}
		
		}

	}

}
