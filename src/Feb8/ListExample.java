package Feb8;
import java.util.ArrayList;
import java.util.List;
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<>(); // we not declare size it will get value and size at runtime 
		 
		obj.add("pune");
		obj.add("mumbai");
		obj.add("nashik");
		obj.add("pune"); // in list duplicate value can be inserted 
		obj.add("aurangabad");
		obj.add("mumbai");
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.contains("Delhi")); //Contains (find) method check if value is present in list
		
		System.out.println(obj.indexOf("pune"));// print the first value of index not duplicate value index print
		
		System.out.println(obj.get(3)); //get value from list
		
		List<String> newList = obj.subList(0, 3); // create a sub list from main list
		
		System.out.println(newList);
		
		newList.add("Nanded"); // add new value to list
		
		System.out.println(newList);
		
		System.out.println(obj);
		
		obj.remove("Nanded"); // remove from list
		
		System.out.println(obj);
		
		for(int i =0; i<obj.size();i++)
		{
			System.out.println(obj.get(i)+ " ");//here we use index then get value
			
		}
		
		// example of Enhanced for loop

		for (String value : obj) //this for loop use only for list and set
		{
			
		
			System.out.println(value);
		}
	}

}
